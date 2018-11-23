import jdk.nashorn.internal.objects.annotations.Constructor;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
import java.util.*;

@RunWith(Parameterized.class)
public class AccountServiceTest {

    AccountService service = null;

    private Integer accNo;
    private Double input_amount;
    private Double expectedOutput;

    public AccountServiceTest(Integer accNo, Double input_amount, Double expectedOutput) {
        this.accNo = accNo;
        this.input_amount = input_amount;
        this.expectedOutput = expectedOutput;
    }

    @Before
    public void setUp(){
        service = new AccountService();
        Map<Integer, Account> accounts = new HashMap<Integer,Account>();
        accounts.put(1001,new Account("Abhishek",20000));
        accounts.put(1002,new Account("Amitabh",30000));
        accounts.put(1003,new Account("Jaya",40000));
        service.setData(accounts);
    }

    @After
    public void tearDown(){
        service = null;
    }

    @Parameterized.Parameters
    public static Collection params(){
        List data = new ArrayList();
        //After withdrawing 20000 from A/c 1001, balance should be 0
        data.add(new Object[]{1001,20000D, 0D});

        //After withdrawing 20000 from A/c 1002, balance should be 10000
        data.add(new Object[]{1002,20000D, 10000D});

        //After withdrawing 20000 from A/c 1003, balance should be 20000
        data.add(new Object[]{1003,20000D, 20000D});
        return data;
    }

    //A Test case, which expect an Exception to be thrown
    //If no exception is thrown, test case is marked as FAILED
    @Test(expected = RuntimeException.class)
    public void testNonExistingAccount(){
        Account acc = service.findAccount(1004);
    }


    //Test withdrawal of amount higher than balance
    @Test
    public void testWithdraw() throws NoSufficientFundException{
        service.withdraw(accNo,input_amount);
        assertEquals(expectedOutput,service.findAccount(accNo).getAmount() ,0.1);
    }

    @Test
    public void testDeposit(){
        double beforeamount = service.findAccount(1001).getAmount();
        service.deposit(1001,1000);
        double afteramount = service.findAccount(1001).getAmount();
        assertEquals(afteramount,beforeamount+1000,0);
    }

    @Test(expected = RuntimeException.class)
    public void testDeposit1(){
        service.deposit(1000,1000);
    }
}

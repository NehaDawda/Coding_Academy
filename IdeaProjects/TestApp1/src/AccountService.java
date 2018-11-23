import java.util.*;

public class AccountService extends Throwable{

    private Map<Integer,Account> accounts = new HashMap<Integer,Account>();

    public AccountService(){

    }

    public void setData(Map<Integer,Account> acounts){
        this.accounts = acounts;
    }

    public Account findAccount(int accountNo){
        if(accounts.containsKey(accountNo)){
            return accounts.get(accountNo);
        }
        else throw new RuntimeException("Account No "+accountNo+" does not exists!");
    }

    public void withdraw (int accountNo, double amount) throws NoSufficientFundException{
        Account acc = accounts.get(accountNo);
        if(acc.getAmount()<amount)
            throw new NoSufficientFundException(accountNo);
        else
            acc.setAmount( acc.getAmount()-amount );
    }

    public void deposit(int accountNo, double amount){
        Account account = findAccount(accountNo);
        account.setAmount(account.getAmount()+amount);
    }
}

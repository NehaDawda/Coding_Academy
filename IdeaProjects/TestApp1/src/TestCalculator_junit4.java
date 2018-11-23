import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestCalculator_junit4 {

	Calculator calc = new Calculator();

	@Before
	public void setUp(){
		System.out.println("Before each test case");
	}

	@BeforeClass
	public static void setUpClass(){
		System.out.println("Before Test Suite");
	}

	@After
	public void unload(){
		System.out.println("After each test case");
	}

	@AfterClass
	public static void unloadClass(){
		System.out.println("After Test Suite");
	}

	@Test
	public void addDataSet01() {	
		double result = calc.add(2, 2);
		assertEquals(4, result, 0);
	}
	
	@Test
	public void addDataSet02() {	
		double result = calc.add(100, 50);
		assertEquals(150, result, 0);
	}
}

package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoanTest {
	
	@BeforeTest
	public void method3() {
		
		System.out.println("inside Before Test");
	}

	
	
	@BeforeMethod(alwaysRun=true)
	public void method1() {
		
		System.out.println("inside Method 1");
	}
	
	
	@Test(groups = {"Sanity"}, priority = 0, description = "This test case is for home loan")
	public void HomeLoanTest() {
		
		System.out.println("Inside HomeLoan Test");
	}
	
	@Test(enabled=true, priority = 1)
	public void CarLoanTest() {
		
		System.out.println("Inside CarLoan Test");
	}
	
	@AfterMethod(alwaysRun=true)
	public void method2() {
		
		System.out.println("inside Method 2");
	}
	
	@AfterTest
	public void method4() {
		
		System.out.println("inside After Test");
	}

	
}

package testNg;

import org.testng.annotations.Test;

public class CardTest {

		@Test(groups = {"Sanity"})
		public void CreditCardTest() {
	System.out.println(" Inside Credit Card Test ");
}	
	
		@Test
		public void CcAccountTest() {
			
			System.out.println("Inside CC Account Test");
		}
	
	
	
	
}

package Com.Java;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng2 {
	@Test (priority = 1)
	public void A() {
		System.out.println(10);
	Reporter.log("10",true);
	}
	@Test(priority = 2)
	public void D() {
		System.out.println("Hi");
	}
	@Test(priority = 4)
	public void B() {
		System.out.println("Bye");
	}
		@Test(priority = 3)
		public void C() {
			System.out.println("Hey");
		
}
	
	
	
	
	
	
	
}

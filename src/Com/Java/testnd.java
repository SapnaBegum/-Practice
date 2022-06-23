package Com.Java;

import org.testng.annotations.Test;

public class testnd {
	@Test (priority = 1)
	public void A() {
		System.out.println("my");	
	}
	@Test(priority = 2,dependsOnMethods = {"A"})
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

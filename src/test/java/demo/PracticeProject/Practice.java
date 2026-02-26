package demo.PracticeProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice {
	
	@Test
	public void m1() {
		
		System.out.println("m1 method ");
	}
	
	@Test(groups= {"smoke"})
	public void m3( ) {
		
		System.out.println("m3 method ");
	}
	
	@Test
	public void m2() {
		
		System.out.println("m2 method ");
	}
	
	@Test
	public void m4() {
		
		System.out.println("m4 method ");
	}

//	@Test(priority=1)
//	public void v1() {
//		
//		System.out.println("v1 method");
//	}
//	
//	@Test(priority=1)
//	public void v2() {
//		
//		System.out.println("v2 method");
//	}
	
	
}

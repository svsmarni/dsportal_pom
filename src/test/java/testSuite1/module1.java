package testSuite1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class module1 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("executing before method");
	}
	
	
	@Test (groups = {"smoke", "sanity"})
	public void test001() {
		
		System.out.println("executing test case1");
	}
	
	@Test	
	public void test002() {
		
		System.out.println("executing test case2");
	}


	@Test
	public void test003() {
	
	System.out.println("executing test case3");
	}
	
	
	
	@Test
	public void test004() {
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("executing after method");
	}
	
	@DataProvider
	public Object[][] data001() {
		
		Object[][] data = {{"vijay", "pass001"}, {"bharathi", "pass002"}};
		
		return data;
	}
	
	
@Test (dataProvider = "data001")
public void login(String username, String password) {
	
	System.out.println(username +" and "+ password);
}
	
}

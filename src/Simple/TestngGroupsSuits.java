package Simple;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngGroupsSuits {
	@BeforeGroups("IT Department")  
	public void before_it()  
	{  
	System.out.println("This method will be executed before the execution of IT Department group");  
	}  
	@Test  
	public void testcase1()  
	{  
	System.out.println("HR");  
	}  
	 @Test(groups= {"IT Department"})  
	public void testcase2()  
	{  
	System.out.println("Software Developer");  
	}  
	 @Test(groups= {"IT Department"})  
	 public void testcase3()  
	 {  
	 System.out.println("QA Analyst");  
	 }  
	 @BeforeSuite
	 public void beforeSuite() {
	   System.out.println("This will execute before the Test Suite");
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	   System.out.println("This will execute after the Test Suite");
	 }

}

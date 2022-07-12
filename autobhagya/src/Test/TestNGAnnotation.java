package Test;
import org.testng.annotations.*;

public class TestNGAnnotation {
   @BeforeClass
     public void beforeclass()
       {
        	System.out.println("beforeclass");
        }
	
	@Test
	
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");
	}
	 @AfterClass 
	 public void afterclass()
	  {
	 	System.out.println("afterclass");
	  }
	 @BeforeMethod
	public void beforementhod()
	{
		 System.out.println("beforeMethod");
	}
	 @AfterMethod
	 public void aftermethod()
	 {
		 System.out.println("aftermethod");
	 }
		 @Test
		 public void test3()
		 {
			 System.out.println("test3");
		 }
		 @BeforeTest
		 public void beforetest()
		 {
			 System.out.println("beforetest");
		 }
		 @AfterTest
		 public void aftertest()
		 {
			 System.out.println("aftertest");
		 }
	 }




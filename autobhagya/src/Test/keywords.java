package Test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class keywords {
	 
	@Test(priority=1,timeOut=2000)
		public void test1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Test1");
	}

	@Test(priority= -1)
	@Parameters({"a","b"})
	public void test2(int a,int b)
	{
		System.out.println(a+b);
		System.out.println("Test2");
	}

     @Test(invocationCount=2)
		 public void test3()
		 {
			 System.out.println("test3");
		 }
		
     @Test(enabled=false) //will not run this test
	 public void test4()
	     {
		 System.out.println("test4");
	     }
     
      @Test(dependsOnMethods= {"test2"})
    public void test5()
      {
	    System.out.println("Test5");
      }
}








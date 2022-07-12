package bhagya;

public class overloading {
	
	public void test()
	{
		System.out.println("hello i am argument");
		
	}
	public void test (int a)
	{
		System.out.println(a);
	}
  public void test (int a, int b)
{
	System.out.println(a+b);
	
}
  public static void main(String args[])
  {
	  
	  overloading z=new overloading();
	  z.test();
	  z.test(3);
	  z.test(3,3);
  }
  
  
  }


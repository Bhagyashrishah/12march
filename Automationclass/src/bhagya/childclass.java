package bhagya;

public class childclass extends parentclass{
	int c=45;
	public static void demo() {
		System.out.println("i am child class");
	}
	public static void main(String args[])
	{
		childclass r=new  childclass();
		
		r.demo();
		
		r.test1();
		r.test2();
		r.test3();
		
	}

}

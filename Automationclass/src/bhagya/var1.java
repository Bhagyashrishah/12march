package bhagya;

public class var1 {
	int a=19; //instance variable,,instance global variable,,
	static int b=77;//class varaible,class global variable;
	public void test() {
		System.out.println(a);
		System.out.println(b);}
		public static void  main(String [] args)
		{
			var1 m=new var1();
			m.test();
		}
		
	}



package bhagya;

public class mtd {
	int a=89;
	String b="bhagyasanajyshah";
	int c=56;
	int d;
	public void test(int a) {
		int d=c+a;
		System.out.println("the addition is "+d);
		System.out.println("I am test");
	}
	public void test2() {
		System.out.println("i am test2");
	}
		
	
	public static void test3() {
		for(int d=0;d<=2;d++)
		{
		System.out.println("i am test3");
	}}
	
	public static void main(String args[]) {
		mtd i=new mtd();
		i.test(4);
		i.test2();
		mtd.test3();
		
		
	}

}

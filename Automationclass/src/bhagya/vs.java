package bhagya;

public class vs {
	vs(int q,String b){
		System.out.println("hello i am constructor");
		
	}
	vs(int a){
		System.out.println("i am constructor1");
	}
	vs(char b){
		System.out.println("i am character");
	}

public void test()
{
System.out.println("hello i am test");

}
public static void main(String args[])
{
	vs c=new vs(5,"bhagya");
	//vs c1=new vs(5,"bhagya");
//	vs c2=new vs(5,"bhagya");
	
	vs d=new vs(6);
	vs z=new vs('a');
	z.test();
	d.test();
	c.test();
	
	
	
		
	
	
}

}

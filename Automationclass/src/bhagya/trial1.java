package bhagya;

public class trial1 extends trial{
	int c=34;
	public void demo() {
		super.test();
		System.out.println(this.c);
		System.out.println("i am child propertyy");
	}
public void test1()
{
	System.out.println("hello javaaa");
}
public static void main(String args[])
{
	trial1 t=new trial1();
	t.demo();
	t.test1();
	trial q=new trial();
	//test1();
	
	
}
}

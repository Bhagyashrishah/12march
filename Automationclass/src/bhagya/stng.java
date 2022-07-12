package bhagya;

public class stng {
public static void main(String args[]) {
	String a="bhagyashri";
	String b=new String("shah");
	char d=a.charAt(3);
	System.out.println(d);
	System.out.println(b.charAt(2));
	int len=a.length();
	System.out.println(len);
	System.out.println(b.length());
	System.out.println(a.toUpperCase());
	System.out.println(b.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(b.toLowerCase());
	boolean r=a.equals(b);
	System.out.println(r);
	boolean r1=a.equalsIgnoreCase(b);
	System.out.println(r1);
	System.out.println(a.concat("  sanjay shah"));
	System.out.println( b.concat (" beautiful"));
	boolean p=a.contains("shri");
	System.out.println(p);
	System.out.println(a.substring(3));
	System.out.println(b.substring(1));
	}	
}	
	


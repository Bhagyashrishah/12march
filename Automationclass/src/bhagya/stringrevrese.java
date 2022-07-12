package bhagya;

public class stringrevrese {
	public static void main(String args[]) {
		String name="mam";
		
		int length=name.length();
		String rev= "";
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if (name.equals(rev))
		{
			System.out.println("string is palindron");
		}
		else
		{
			System.out.println("string is not palindron");
		}
		
		
	}

}

package bhagya;

public class palindrn {
	public static void main(String args[]) {
		int no= 182,rem;
		int temp=no;
		int rev=0;
		while(temp !=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(no==rev)
		{
			System.out.println("it is palindron");
		}
		else
		{
		System.out.println("it is not palindron");
		}
		
	}
}

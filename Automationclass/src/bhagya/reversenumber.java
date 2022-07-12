package bhagya;

public class reversenumber {
	public static void main(String args[]) {
		int no= 121,rem;
		int temp=no;
		int rev=0;
		while(temp !=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(temp==rev)
		{
			System.out.println("it is palindron");
		}
		else
		{
		System.out.println("it is not palindron");
		}
		
	}

}

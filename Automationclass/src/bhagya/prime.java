package bhagya;

public class prime {
	public static void main(String [] args)
	{
	int n=83;
	int temp=0;
	for(int i =2;i<=n-1;i++)
	{
		if(n%i==0)
		{
			temp=temp+1;
		}
	}
if(temp>0)
{
	System.out.println(n + " no is not prime");
}
else
{
	System.out.println(n + "  no is prime");
}

}
}
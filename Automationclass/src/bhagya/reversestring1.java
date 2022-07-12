package bhagya;

public class reversestring1 {
	public static void main(String[] args) {
		String name="velocity katraj is in pune";
		int len=name.length();
		int count=0;
		for(int i=len-1;i>=0;i--)
		{
			if(name.charAt(i)==' ')
			{
				count++;
			}
				
				
		}
		System.out.println(count);
	}

}

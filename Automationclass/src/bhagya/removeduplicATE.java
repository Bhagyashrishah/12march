package bhagya;

import java.util.HashSet;
import java.util.Set;

public class removeduplicATE {

	public static void main(String [] args)
	{
		String str="bhagyashri";
		System.out.println(removedup(str));
		
	}
	public static String removedup(String str)
	{
		Set<Character> set=new HashSet<>();
		StringBuffer sf =new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
				
			}
			
		}
		return sf.toString();
		
	}
}
	



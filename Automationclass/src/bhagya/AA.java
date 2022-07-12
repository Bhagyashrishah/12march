package bhagya;

public class AA {
	public static void main(String[] args) {
		int answer = -1;
		int no = 379;
		int sum = 0;
		int originalNumber = no;
		while (answer != 0) {
		int digit = no % 10;
		sum = sum + digit * digit * digit;
		answer = no / 10;
		no = answer;
		}
		System.out.println(sum);
		System.out.println(originalNumber);
		
		if (sum == originalNumber)
		System.out.println("It is armstrong number");
		else
		System.out.println("It is NOT armstrong number");
		}
		}
	
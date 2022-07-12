package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class display {

	public static void main(String args[])
	{
		WebDriver driver =op.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement input =driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		boolean c = input.isDisplayed();
		System.out.println(c);
	}
	
}

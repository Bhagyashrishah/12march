package pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class isselect {
	public static void main(String args[])
	{
		WebDriver driver =op. openBrowser("https://demo.guru99.com/test/radio.html");
		
		WebElement radio2=driver.findElement(By.xpath("//input[@id=\"vfb-7-2\"]") );
	//	radio2.click();
		boolean r =radio2.isSelected();
		System.out.println(r);
		
	}
}

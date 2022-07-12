package pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String args[])
	{
		WebDriver driver=op.openBrowser("https://vctcpune.com/selenium/practice.html");
	WebElement dropdown	=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	Select sel= new Select (dropdown);
	//sel.selectByValue("option1");
	sel.selectByVisibleText("Option2");
//sel.selectByIndex(2);
//	sel.selectByVisibleText("Option3");
	
	}
}

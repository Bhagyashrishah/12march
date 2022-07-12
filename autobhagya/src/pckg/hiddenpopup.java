package pckg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class hiddenpopup {

	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver =op. openBrowser("https://www.facebook.com/");
	WebElement al = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	al.click();
//	Alert a=driver.switchTo().alert();
	Thread.sleep(5000);
	WebElement name = driver.findElement(By.xpath("//input[@placeholder='First name']"));
	//Thread.sleep(5000);
	name.sendKeys("bhagya");
	Thread.sleep(5000);
	WebElement al1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select a=new Select(al1);
	a.selectByVisibleText("6");
//	a.selectByValue("6");
	//sel.selectByVisibleText("Option3");
	
	
	}
	
}

package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locator {
public static void main(String args[])
{
	WebDriver driver =op. openBrowser("https://www.facebook.com/");
	
//	WebElement email=driver.findElement(By.id("email"));
//	email.sendKeys("bhagya");
	
	
//	WebElement pass =driver.findElement(By.id("pass"));
//	pass.sendKeys("shah");
	
//	WebElement login =driver.findElement(By.tagName("button"));
//	login.click();
	
//	WebElement email= driver.findElement(By.name("email"));
//	email.sendKeys("bhagya");
//	WebElement log= driver.findElement(By.name("login"));

	//log.click();
	
	WebElement pass= driver.findElement(By.className("_6lux"));
	pass.sendKeys("maiapnifavoritehu");
	
//	WebElement createnew= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
//	createnew.click();
	
//	WebElement forgot=driver.findElement(By.linkText("Forgotten password?"));
//	forgot.click();
	
//	WebElement forgot=driver.findElement(By.partialLinkText(" password?"));
//	forgot.click();
	
	//WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
	//		email.sendKeys("bhagya");
			
	//		WebElement forgot =driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//			forgot.click();
	
//	WebElement forgot =driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?privacy_')]"));
//forgot.click();
	
//	WebElement forgot =driver.findElement(By.xpath("////input[@type='text'][1]"));
//	forgot.sendKeys("hiiiiiii");
		
}
}

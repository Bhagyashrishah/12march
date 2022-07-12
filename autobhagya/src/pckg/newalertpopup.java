package pckg;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newalertpopup {
	
			
		public static void main(String[] args) throws InterruptedException  {
		
			WebDriver driver =op. openBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			WebElement al = driver.findElement(By.xpath("//input[@value='Alert']"));
				al.click();
				Alert a=driver.switchTo().alert();
				a.accept();
				
		//	WebElement cm = driver.findElement(By.xpath("//input[@name='confirmation']"));
		//		cm.click();
		//		Alert bb =driver.switchTo().alert();
			//	bb.dismiss();
				
		//		WebElement cm = driver.findElement(By.xpath("//input[@value='Prompt']"));
		//		cm.click();
				
		//		Alert bb =driver.switchTo().alert();
		//		Thread.sleep(2000);
		//		bb.sendKeys("bhagya");
			//	bb.accept();
		//		String i=bb.getText();
		//		System.out.println(i);
				
			
		}

}

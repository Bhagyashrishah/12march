package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class keybroadactions {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=op.openBrowser("https://demoqa.com/text-box");
		WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
		username.sendKeys("bhagya");
			
		Actions actions =new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("bhagya@gmail.com");
		actions.build().perform();
		
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("bhagyashri sanjay shah");
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		
		actions.sendKeys(Keys.TAB);
	
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		
		actions.build().perform();
	//	Thread.sleep(9000);
		//actions.sendKeys(Keys.TAB);
		//Thread.sleep(9000);
		//actions.click();
		//actions.build().perform();
		
		Thread.sleep(12000);
		WebElement username1=driver.findElement(By.xpath("//button[@id='submit']"));
		 username1.click();
	}

}

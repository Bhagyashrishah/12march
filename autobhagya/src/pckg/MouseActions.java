package pckg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=op.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
///	WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
	//Actions action=new Actions(driver);
	//Thread.sleep(3000);
	//action.contextClick(rightclick);
	//action.perform();
	
	//WebElement copy=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
	//Thread.sleep(3000);
	//copy.click();
	
//	WebElement pest=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste context-menu-hover context-menu-visible']"));
	//Thread.sleep(3000);
//	pest.click();
	
	
	WebElement doubleclick1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions action1=new Actions(driver);
	Thread.sleep(3000);
	action1.doubleClick(doubleclick1);
	Thread.sleep(3000);
	action1.perform();
	 Alert a=driver.switchTo().alert();
	 Thread.sleep(3000);
	 a.accept();
	
	
	

}
}
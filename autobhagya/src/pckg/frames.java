package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class frames {
	
	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriver driver =op. openBrowser("https://vctcpune.com/selenium/practice.html");
		
//		driver.switchTo().frame("courses-iframe");
//		driver.switchTo().frame(0);
		WebElement iframe1= driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(3000);
		WebElement course =driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		Thread.sleep(3000);
		course.click();
		}

}

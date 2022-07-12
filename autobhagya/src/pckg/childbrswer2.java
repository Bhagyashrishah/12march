package pckg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childbrswer2 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=op.openBrowser("https://vctcpune.com/");
		WebElement seliniumpractise = driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
		seliniumpractise.click();
		seliniumpractise.click();
		seliniumpractise.click();

 
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		
		while(i.hasNext())
		{
			Thread.sleep(3000);
		    String handle=i.next();
			driver.switchTo().window(handle);
			String s=driver.getTitle();
			if(s.equals("Practice Page"))
				{
				
					WebElement radio1= driver.findElement(By.xpath("//input[@type='radio'][1]"));
											radio1.click();
											
				}
		}
	
		}

}

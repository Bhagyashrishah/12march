package pckg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childbrwser1 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=op.openBrowser("https://vctcpune.com/");
		WebElement seliniumpractise = driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
		seliniumpractise.click();
	//	seliniumpractise.click();
		//seliniumpractise.click();

		//String s=driver.getWindowHandle();
		//System.out.println(s);
		 
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		String handles1=i.next();
		System.out.println(handles1);

		String handles2=i.next();
		System.out.println(handles2);
		
		driver.switchTo().window(handles2);
		
		String s=driver.getTitle();
if(s.equals("Practice Page"))
		{
	
	
	WebElement radio1= driver.findElement(By.xpath("//input[@type='radio'][1]"));
	
	Thread.sleep(3000);
	radio1.click();
		}

	}	

}


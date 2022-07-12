package pckg;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childbrowser3 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=op.openBrowser("https://vctcpune.com/");
		WebElement seliniumpractise = driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
		seliniumpractise.click();
		Thread.sleep(5000);
		
		seliniumpractise.click();
		Thread.sleep(5000);
		
		seliniumpractise.click();
		Thread.sleep(5000);
		
		ArrayList<String> list= new ArrayList(driver.getWindowHandles());
		int p= list.size();
		System.out.println(p);
		
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(2));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(3));
		System.out.println(driver.getTitle());
		
		
		
	}
	
}

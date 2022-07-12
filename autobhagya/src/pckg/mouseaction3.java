package pckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseaction3 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=op.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(iframe);
	Actions action=new Actions(driver);
	
	List<WebElement> image=driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content')]"));
	
	WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
	
for(int i=0;i<image.size();i++)
    {
	
       WebElement picture=image.get(i);
  	action.dragAndDrop(picture,trash);
    	Thread.sleep(3000);
    	action.perform();
    	
    	
     }
    List<WebElement> image1=driver.findElements(By.xpath("//a[text()='Recycle image']"));
    WebElement trash1 =driver.findElement(By.xpath("//ul[@id='gallery']"));
    for(int i=0;i<image1.size();i++)
    {
	
       WebElement picture=image1.get(i);
    	action.dragAndDrop(picture,trash1);
    	Thread.sleep(3000);
    	action.perform();
}
}
}


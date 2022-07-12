package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseaction1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=op.openBrowser("https://www.amazon.com/ref=as_li_ss_tl?_encoding=UTF8&camp=1789&creative=390957&linkCode=ur2&tag=amznipops-20&linkId=VETEOIMPO7O4WRWZ");
		WebElement sign=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(sign);
		action.perform();
		WebElement order=driver.findElement(By.xpath("//a[@id='nav-orders']"));
	    order.click();
	 
	    WebElement email=driver.findElement(By.xpath(" //input[@id='ap_email']"));
	   email. sendKeys("bhagya");
		
	}

}

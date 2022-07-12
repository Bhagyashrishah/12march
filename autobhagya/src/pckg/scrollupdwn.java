package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;

public class scrollupdwn {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=op.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement practise=driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("argument[0].ScrollIntoView(true)",practise);
		//((JavascriptExecutor)driver).executeScript(("window.scrollBy(800,800)"));
	}

	
	
}

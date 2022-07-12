package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mm {
	public static void main(String args[])
	{
		WebDriver driver =op.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement heading =driver.findElement(By.xpath("//h1[@class=' header1 font-weight-bold text-white text-center\']"));
	    String cc =heading.getText();
	    System.out.println(cc);
	    
		
		
		
}
}


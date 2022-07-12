package pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class op {

	public static WebDriver openBrowser(String url)
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\automation1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	return driver;
}
}
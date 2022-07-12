package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver ChromeBrowser()
	{
	//System.setProperty("webdriver.chrome.driver", "C:\\automation1\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions op =new ChromeOptions();
		op.addArguments("disable-notifications");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://kite.zerodha.com/");
    driver.manage().window().maximize();
    
 //   driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	return driver;
}
}
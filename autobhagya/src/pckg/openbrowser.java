package pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;

import org.openqa.selenium.Dimension;

public class openbrowser {
	public static void  open(String url) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get(url);
		driver.navigate().to(url);
	//	Thread.sleep(4500);
		driver.navigate().back();
		//Thread.sleep(4500);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		String t=driver.getTitle();
		System.out.println(t);
		String url1=driver.getCurrentUrl();
		System.out.println(url);
		Options op =driver.manage();
		Window win=op.window();
		win.maximize();
		
		Dimension d= new Dimension(8000, 300);
		driver.manage().window().setSize(d);
		
		
		
		
				
	}

}



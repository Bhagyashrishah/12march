package pckg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
public class sizenposition {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\automation1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	
	driver.get("https://www.google.com/search?q=working+capital+management+project.docx&oq=&aqs=chrome.1.69i59i450l8.2175726691j0j15&sourceid=chrome&ie=UTF-8");

	Dimension d=new Dimension(8000 ,400);
	driver.manage().window().setSize(d);
	Point p=new Point (700,900);
	driver.manage().window().setPosition(p);
			
	driver.close();
	
	
	}
	
	
}


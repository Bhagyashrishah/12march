package pckg;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class bwzer {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=i+love+pdf+to+word&sxsrf=ALiCzsZqTM7mRO3xWYfDlLK0CSquLvTN9Q%3A1652259992116&ei=mHx7YtThBuKxmAXR17n4Bg&oq=quickly+convert+word+to+pdf&gs_lcp=Cgdnd3Mtd2l6EAEYATIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwA0oECEEYAEoECEYYAFAAWABg3xhoAXABeACAAQCIAQCSAQCYAQDIAQjAAQE&sclient=gws-wiz");
	}

}

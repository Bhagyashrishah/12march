package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaCreateAccount;

public class singUp {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser()
	{
		 driver=  Browser. ChromeBrowser();
	}
	@Test
	public void singUptest() throws InterruptedException {
		ZerodhaCreateAccount zerodhacreateaccount =new ZerodhaCreateAccount(driver);
		zerodhacreateaccount.clickOnSingUp();
		 Set<String> handles=driver.getWindowHandles();
			Iterator<String> i= handles.iterator();
			String mainpage=i.next();
			driver.switchTo().window(mainpage);
			String childhandle=i.next();
			driver.switchTo().window(childhandle);
		zerodhacreateaccount.enterMbNo("9067282766");
		zerodhacreateaccount.ClickOncontinue();
		
	}
	
	

}

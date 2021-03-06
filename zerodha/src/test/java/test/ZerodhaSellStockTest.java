package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaDashBoradPom;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSellStockPom;
import utility.Parameteration;
import utility.ScreenShot;

public class ZerodhaSellStockTest {
	public WebDriver driver;
	@BeforeMethod
	public void OpenBrowser()
	{
		 driver=  Browser. ChromeBrowser();
	}
	@Test
public void zerodhabuyStock() throws EncryptedDocumentException, IOException, InterruptedException
{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userId=Parameteration.getData("Credentials",0,1);
		String pass=Parameteration.getData("Credentials",1,1);
		String pin=Parameteration.getData("Credentials",2,1);
		zerodhaLoginPage.enterUserId(userId);
		zerodhaLoginPage .enterpassword(pass);
		zerodhaLoginPage.clickOnLogin();
		Thread.sleep(2000);
		zerodhaLoginPage.enterpin(pin,driver);
		zerodhaLoginPage.ClickOnContinue();
		
		Thread.sleep(5000);
		ZerodhaDashBoradPom zpom=new ZerodhaDashBoradPom(driver);
		zpom.entersearch("INFY");
		Thread.sleep(3000);
		zpom.clickOnShare();
		Thread.sleep(3000);
		zpom.clickOnorangeSell();
		Thread.sleep(3000);
		
		 ZerodhaSellStockPom sellstock=new  ZerodhaSellStockPom(driver);
		 sellstock.clickOnbse();
		 Thread.sleep(3000);
	//	 sellstock.clickOnintraday();
		 sellstock.enterQuantity("6");
		 Thread.sleep(3000);
		 sellstock.enterPrice("6691");
		 Thread.sleep(3000);
		// sellstock.clickOnMarket();
		 Thread.sleep(3000);
		// sellstock.clickOnSell();
}
//	@Test
	//	public void test1()
			{
		//		System.out.println("timepass");
			}
		
		


		
	

//	@AfterMethod
///	public void screenshot() throws IOException
	{
	//	ScreenShot.screenshot(driver,"ZerodhaDashBoardTest" );
		//driver.close();
}
	
}

package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaBuyStockPom;
import pom.ZerodhaDashBoradPom;
import pom.ZerodhaLoginPage;
import utility.Parameteration;
import utility.ScreenShot;

public class ZerodhaBuyStockTest {
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
		zpom.clickOnbluebuy();
		Thread.sleep(3000);
		
		ZerodhaBuyStockPom buystock=new ZerodhaBuyStockPom(driver);
		Thread.sleep(3000);
		buystock.clickOnbse();
		Thread.sleep(3000);
	//	buystock.clickOnLongTerm();
		buystock.clickOnintraday();
		Thread.sleep(3000);
	buystock.enterQuantity("4");
		buystock.enterPrice("8566");
	   buystock.clickOnLimit();
	    buystock.clickOnBuy();
		Thread.sleep(3000);
		
}
//	@AfterMethod
	public void screenshot() throws IOException
	{
		ScreenShot.screenshot(driver,"ZerodhaDashBoardTest" );
		driver.close();
}
	
}

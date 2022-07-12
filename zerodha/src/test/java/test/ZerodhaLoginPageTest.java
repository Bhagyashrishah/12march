package test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Parameteration;
public class ZerodhaLoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser()
	{
		 driver=  Browser. ChromeBrowser();
	}
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userId=Parameteration.getData("Credentials",0,1);
		String pass=Parameteration.getData("Credentials",1,1);
		String pin=Parameteration.getData("Credentials",2,1);
		
	//	boolean status=zerodhaLoginPage.isImagedispalyed();
	//	Assert.assertTrue(status);        
		
		boolean status=zerodhaLoginPage.isImagedispalyed();
		SoftAssert softAssert=new SoftAssert ();
		 softAssert.assertFalse(status);
		
		
		zerodhaLoginPage.enterUserId(userId);
		zerodhaLoginPage .enterpassword(pass);
	//	Thread.sleep(3000);
		zerodhaLoginPage.clickOnLogin();
	//	Thread.sleep(3000);
		zerodhaLoginPage.enterpin(pin,driver);
		zerodhaLoginPage.ClickOnContinue();
		softAssert.assertAll();
		
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		//wait.until(ExpectedConditions.titleContains("Dashboard / Kite"));
		//String currentTittle=driver.getTitle();
		//String expectedTittle="Dashboard / Kite";
		//Assert.assertEquals(currentTittle,expectedTittle);                 // Hard Assert
	}
}














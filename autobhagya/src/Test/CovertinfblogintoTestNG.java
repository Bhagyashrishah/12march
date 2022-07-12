package Test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.FaceBookLoginPage;
import pckg.op;
import pckg.screenshot;
public class CovertinfblogintoTestNG {
	
	WebDriver driver;
	
      @BeforeMethod
      public void launchbrowser()
         {
         	 driver=op.openBrowser("https://www.facebook.com");
          }

       @Test
		public void loginPageTest()
		{	
			
			FaceBookLoginPage facebookloginpage=new FaceBookLoginPage(driver);
			facebookloginpage.EnterMailId("bhagya");
			facebookloginpage.Enterpassword("shah");
			facebookloginpage.ClickOnLogin();
		}
       @Test
		public void loginWithOnlyUserTest()
		{
			
			FaceBookLoginPage facebookloginpage=new FaceBookLoginPage(driver);
			facebookloginpage.EnterMailId("bhagya");
			facebookloginpage.ClickOnLogin();
		
	    }
       @AfterClass
       public void screentshot() throws IOException 
       {
    		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		File destination = new File("C:\\Android\\img\\b1.jpg");
    		FileHandler.copy(source, destination);
       }
  
}



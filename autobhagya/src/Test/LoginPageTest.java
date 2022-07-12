package Test;

import org.openqa.selenium.WebDriver;

import POM.FaceBookLoginPage;
import pckg.op;

public class LoginPageTest {

	public void loginPageTest()
	{	
		WebDriver driver=op.openBrowser("https://www.facebook.com");
		FaceBookLoginPage facebookloginpage=new FaceBookLoginPage(driver);
		facebookloginpage.EnterMailId("bhagya");
		facebookloginpage.Enterpassword("shah");
		facebookloginpage.ClickOnLogin();
	}
	public void loginWithOnlyUserTest()
	{
		WebDriver driver=op.openBrowser("https://www.facebook.com");
		FaceBookLoginPage facebookloginpage=new FaceBookLoginPage(driver);
		facebookloginpage.EnterMailId("bhagya");
		facebookloginpage.ClickOnLogin();
	
    }
	public static void main(String[] args)
	{
		 LoginPageTest loginpagetest1=new  LoginPageTest();
		 loginpagetest1.loginPageTest();
	}
}
package Test;

import org.openqa.selenium.WebDriver;

import POM.FaceBookLoginPage;
import pckg.op;

public class HomePageTest {

	public void HomePageTest()
	{
		WebDriver driver=op.openBrowser("https://www.facebook.com");
		FaceBookLoginPage facebookloginpage=new FaceBookLoginPage(driver);
		facebookloginpage.EnterMailId("appu");
		facebookloginpage.Enterpassword("doshi");
		facebookloginpage.ClickOnLogin();
	}
	public static void main(String[] args)
	{
		HomePageTest hmpg=new  HomePageTest();
		 hmpg.HomePageTest();
	}
}

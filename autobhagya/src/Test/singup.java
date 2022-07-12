package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POM.FaceBookSingUp;
import pckg.op;

public class singup {
	
	public void LoginSingUpPage() throws InterruptedException
	{
		WebDriver driver=op.openBrowser("https://www.facebook.com");
		Thread.sleep(5000);
		 FaceBookSingUp singup = new FaceBookSingUp(driver);
		 singup.Clickoncreatepage();
		singup. EnterfirstName("bhagyashri");
		singup.EnterlastName("shah");
		singup.entermbno("9067282766");
		singup.enternewpassword("bhagya");
		singup.enterbdydate("6");
		singup.enterbdymonth("6");
		singup.enterbdyyear("1991");
		singup.Clickonfemale();
	//	singup.Clickonmale();
	//	singup.clickoncoustm();
		
	}
		
	
	
	
	public static void main(String[] args) throws InterruptedException {
	
		 singup ss=new singup();
		
		 ss.LoginSingUpPage();
		
				 
		 
	}		
	
}

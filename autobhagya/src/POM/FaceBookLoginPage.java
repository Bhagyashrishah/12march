package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {

	@FindBy (xpath="//input[@id='email']") private WebElement email;
	@FindBy (xpath="//input[@id='pass']") private WebElement password;
	@FindBy (xpath="//button[@name='login']") private WebElement login;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgot;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement create;
	@FindBy (xpath="//a[text()='Create a Page']") private WebElement createPage;
	
	
	public  FaceBookLoginPage(WebDriver driver)  //constructor
	{
		PageFactory.initElements( driver,this);
	}
	
	
	public void EnterMailId(String emailID)
	{
		email.sendKeys(emailID);
	}
	public void Enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void ClickOnLogin()
	{
		login.click();
	}
	public void ClickOnforgotpassword()
	{
		forgot.click();
	}
	public void ClickOnCreateAccount()
	{
		create.click();
	}
	public void ClickOnCreatepage()
	{
		 createPage.click();
	}
	
	
}

package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaCreateAccount {
	WebDriver driver;
	@FindBy(xpath="(//a[@target='_blank'])[3]") private WebElement singUp;
	@FindBy(xpath="//input[@id='user_mobile']") private WebElement mbNo  ;
	@FindBy(xpath="//button[@id='open_account_proceed_form']") private WebElement submit;

public ZerodhaCreateAccount (WebDriver driver)
{
	
		PageFactory.initElements(driver, this);
	

}
public void clickOnSingUp() throws InterruptedException {
	 singUp.click();
		 
}
public void enterMbNo(String number) {
	mbNo.sendKeys(number);
}
public void ClickOncontinue()
{
	submit.click();
}
}













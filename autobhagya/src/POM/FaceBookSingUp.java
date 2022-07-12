package POM;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSingUp {

	@FindBy(xpath="//a[@data-testid='open-registration-form-button']") private WebElement createpage;
	@FindBy(xpath="//input[@name='firstname']")private WebElement first;
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastname;
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement mobileno;
	@FindBy(xpath="//input[@id='password_step_input']")private WebElement newpassword;
	@FindBy(xpath="//select[@name='birthday_day']")private WebElement bdydate;
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement bdymonth;
	@FindBy(xpath="//select[@name='birthday_year']")private WebElement bdyyear;
	@FindBy(xpath="//label[text()='Female']")private WebElement female;
	@FindBy(xpath="//label[text()='Male']")private WebElement male;
	@FindBy(xpath="//label[text()='Custom']")private WebElement coustm;
	
	
	
	public FaceBookSingUp(WebDriver driver)
		{
            PageFactory.initElements(driver, this);
		}
	
	public void Clickoncreatepage() throws InterruptedException
	{
		createpage.click();
		Thread.sleep(3000);
	}

	public void EnterfirstName(String Name)
	{
		first.sendKeys(Name);
	}
	public void EnterlastName(String surName)
	{
		lastname.sendKeys(surName);
	}
	public void entermbno(String MbNo)
	{
		mobileno.sendKeys(MbNo);
	}
	public void enternewpassword(String newpass)
	{
		newpassword.sendKeys(newpass);
	}

	public void enterbdydate(String c)
	{
		 Select select=new Select(bdydate);
		 select.selectByValue(c);
	}
	
	public void enterbdymonth(String i)
	{
		 Select select=new Select(bdymonth);
		 select.selectByValue(i);
	}
	public void enterbdyyear(String i)
	{
		 Select select=new Select(bdyyear);
		 select.selectByValue(i);
	}
	public void Clickonfemale()
	{
		female.click();
	}
	public void Clickonmale()
	{
		male.click();
	}

	public void clickoncoustm ()
	{
		coustm.click();
	}
	
}


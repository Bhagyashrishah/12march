package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaDashBoradPom {

	@FindBy(xpath="//input[@icon='search']") private WebElement search;
	@FindBy(xpath="//a[@class='router-link-exact-active router-link-active']") private WebElement dashboard;
	@FindBy(xpath="//a[@class='orders-nav-item']") private WebElement order;
	@FindBy(xpath="//a[@href='/holdings']") private WebElement holding;
	@FindBy(xpath="//a[@href='/positions']") private WebElement position;
	@FindBy(xpath="//a[@href='/funds']") private WebElement funds;
	@FindBy(xpath="//a[@href='/apps']") private WebElement apps;
	@FindBy(xpath="(//button[@class='button-blue'])[1]") private WebElement startinvesting;
	@FindBy(xpath="(//button[@class='button-blue'])[2]") private WebElement active;
	@FindBy (xpath="//button[@class='button-blue buy']") private WebElement bluebuy;
	@FindBy (xpath = "//span[text()='INFY']") private WebElement info;
	@FindBy (xpath="//button[@class='button-orange sell']") private WebElement orgsell;
public ZerodhaDashBoradPom(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
	public void entersearch(String name) throws InterruptedException 
	{
		search.sendKeys(name);
		
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
				
	}

	public void clickOnShare() throws InterruptedException
	{
		info.click();
		Thread.sleep(3000);
	}
	public void clickOnbluebuy() throws InterruptedException
	{
		bluebuy.click();
		Thread.sleep(3000);
	}
	public void clickOnorangeSell() throws InterruptedException
	{
		orgsell.click();
		Thread.sleep(3000);
	}
	public void clickonDashBoard()
	{
		dashboard.click();
	}
	public void clickonOrder()
	{
		order.click();
	}
	
	
	public void clickonHoldings()
	{
		holding.click();
	}
	public void clickonpostios()
	{
		position.click();
	}
	public void clickonfunds()
	{
		funds.click();
	}
	public void clickonapps()
	{
		apps.click();
	}
	public void clickonstartinvestings()
	{
		startinvesting.click();
	}
	public void clickonactive()
	{
		active.click();
	}
}
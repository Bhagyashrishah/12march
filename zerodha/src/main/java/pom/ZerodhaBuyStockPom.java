package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaBuyStockPom {
	
	@FindBy(xpath="(//label[@class='su-radio-label'])[1]") private WebElement bse;
	@FindBy(xpath="(//label[@class='su-radio-label'])[2]") private WebElement nse;
	@FindBy(xpath="//label[text()='Regular']") private WebElement regular;
	@FindBy(xpath="//label[text()='Cover']") private WebElement cover;
	@FindBy(xpath="(//label[@class='su-radio-label'])[7]") private WebElement intraday;
	@FindBy(xpath="(//label[@class='su-radio-label'])[8]") private WebElement longterm;
	@FindBy(xpath="//input[@label='Qty.']") private WebElement quantity;
	@FindBy(xpath="//input[@label='Price']") private WebElement price;
	@FindBy(xpath="(//label[@class='su-radio-label'])[9]") private WebElement market;
	@FindBy(xpath="(//label[@class='su-radio-label'])[10]") private WebElement limit;
	@FindBy(xpath="(//label[@class='su-radio-label'])[11]") private WebElement stoploss;
	@FindBy(xpath="(//label[@class='su-radio-label'])[12]") private WebElement marketloss;
	@FindBy(xpath="//span[@data-balloon='More options']") private WebElement moreoption;
	@FindBy (xpath = "//button[@type='submit']") private WebElement  mothabuy;
	@FindBy(xpath="(//button[@type='button'])[3]") private WebElement cncl;
	
public ZerodhaBuyStockPom (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickOnbse()
{
	bse.click();
}
public void clickOnnse()
{
	nse.click();
}
public void clickOnregular()
{
	regular.click();
}
public void clickOncover()
{
	cover.click();
}
public void clickOnintraday()
{
	intraday.click();
}
public void clickOnLongTerm()
{
	longterm.click();
}
public void enterQuantity(String number)
{
	quantity.sendKeys(number);
}
public void enterPrice(String pp)
{
	price.sendKeys(pp);
}
public void clickOnMarket()
{
	market.click();
}
public void clickOnLimit()
{
	limit.click();
}
public void clickOnStopLoss()
{
	stoploss.click();
}
public void clickOnMarketLoss()
{
	marketloss.click();
}
public void clickOnMoreoption()
{
	moreoption.click();
}
public void clickOnBuy()
{
	mothabuy.click();
}
public void clickOncancle()
{
	cncl.click();
}
}






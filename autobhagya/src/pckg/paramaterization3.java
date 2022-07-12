package pckg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class paramaterization3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver =op. openBrowser("https://www.facebook.com/");
		String emailID=parametarization1.getData("ss",1, 1);
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys(emailID);
		
		String passID=parametarization1.getData("ss",1, 4);
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys(passID);
		
	}
}

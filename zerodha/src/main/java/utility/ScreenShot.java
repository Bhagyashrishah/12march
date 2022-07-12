package utility;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShot {
	public static void screenshot(WebDriver driver,String Name) throws IOException {
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Android\\img\\Name.jpg");
	FileHandler.copy(source, destination);

}
}
package pckg;
import java.io.*;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.io.FileHandler;


public class screenshot {
	public static void main(String args[]) throws IOException{
		WebDriver driver =op. openBrowser("https://vctcpune.com/");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Android\\img\\bhagya.jpg");
		FileHandler.copy(source, destination);
		
	}

	
	
	

}

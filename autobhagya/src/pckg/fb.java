package pckg;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	public class fb {


		public static void main(String args[])
		{
			WebDriver driver =op.openBrowser("https://www.facebook.com/");
			
			WebElement heading =driver.findElement(By.xpath("//h2[@class='_8eso']"));
		    String cc =heading.getText();
		    System.out.println(cc);
		    
			
			
			
	}
	}


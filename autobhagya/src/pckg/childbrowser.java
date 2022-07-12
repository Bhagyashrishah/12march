package pckg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childbrowser {
public static void main(String[] args) {

WebDriver driver=op.openBrowser("https://vctcpune.com/");
WebElement seliniumpractise = driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
seliniumpractise.click();
seliniumpractise.click();
seliniumpractise.click();

//String s=driver.getWindowHandle();
//System.out.println(s);
 
Set<String> handles = driver.getWindowHandles();
Iterator<String> i=handles.iterator();
String handles1=i.next();
System.out.println(handles1);

String handles2=i.next();
System.out.println(handles2);

String handles4=i.next();
System.out.println(handles4);

String handles3=i.next();
System.out.println(handles3);



}
}

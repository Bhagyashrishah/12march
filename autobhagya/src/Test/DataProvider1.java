package Test;

import org.testng.annotations.Test;

import pckg.parametarization1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


public class DataProvider1 {
	String value1;
	@BeforeClass
	public void getdata() throws EncryptedDocumentException, IOException {
		value1=parametarization1 .getData("ss",1,1);
	}
	
	
	@DataProvider(name="Testdata")
	public Object [][]values(){
		return new Object[][] {{5,7},{6,8},{9,7}};
		}
	@Test(dataProvider="Testdata")
	public void test1(int a,int b)
	{
		System.out.println(a+b);
	}
	@DataProvider(name="newdata")
	public Object[][] stringdata(){
		return new Object[][] {{value1},{"sanjay"},{"shah"}};
	}
	@Test(dataProvider ="newdata")
		public void test2(String name) {
		System.out.println(name);
	}
	@DataProvider(name="newdata1")
	public Object[][] stringdata1() throws EncryptedDocumentException, IOException{
		return new Object[][] {{parametarization1 .getData("ss",1,1)},{"sanjay"},{"shah"}};
	}
	@Test(dataProvider ="newdata1")
		public void test3(String name) {
		System.out.println(name);
	}
	
	
}

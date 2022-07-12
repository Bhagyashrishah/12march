package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pckg.parametarization1;

public class paradata {
	@DataProvider(name="newdata1")
	public Object[][] stringdata1() throws EncryptedDocumentException, IOException{
		return new Object[][] {{parametarization1 .getData("ss",5,1)},{"sanjay"},{"shah"}};
	}
	@Test(dataProvider ="newdata1")
		public void test3(String name) {
		System.out.println(name);
	}

}

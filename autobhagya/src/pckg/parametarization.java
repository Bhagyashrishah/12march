package pckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametarization {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream File= new FileInputStream("C:\\automation1\\test1.xlsx");
		String value=WorkbookFactory.create(File).getSheet("ss").getRow(1).getCell(4).getStringCellValue();
		System.out.println(value);
		
	}

}

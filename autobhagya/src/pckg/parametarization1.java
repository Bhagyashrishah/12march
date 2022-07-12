package pckg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametarization1 {

	public static String getData(String SheetName,int row,int cell)  throws EncryptedDocumentException, IOException {
		FileInputStream File= new FileInputStream("C:\\automation1\\test1.xlsx");
		String value=WorkbookFactory.create(File).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
	}
	
}

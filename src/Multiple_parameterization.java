import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multiple_parameterization 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");	
		Sheet sh=(Sheet) WorkbookFactory.create(fis).getSheet("Sheet8");
		
	}

}

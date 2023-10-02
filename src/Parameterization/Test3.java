package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//read numeric data from excel

public class Test3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file =new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		
		int no=(int) WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(no);
	}

}

package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//to read numeric data as string

public class ReadNumericasString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		String str=WorkbookFactory.create(fis).getSheet("Sheet7").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(str);
		
	}

}

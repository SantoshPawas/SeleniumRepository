package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//to get last row index
public class LastRowIndex 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		
		int LasstRowIndex=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(LasstRowIndex);
		
		
	}

}

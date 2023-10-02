package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//read boolean data from excel file
public class Test4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		
		boolean b=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0).getBooleanCellValue();
		System.out.println(b);
		
	}

}

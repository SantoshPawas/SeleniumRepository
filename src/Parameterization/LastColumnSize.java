package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastColumnSize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		
		int lastcolsize=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		
		System.out.println(lastcolsize);
	}

}

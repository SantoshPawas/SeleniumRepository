package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowSize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		
		int LastRowSize=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		
		System.out.println("Last Row Size="+LastRowSize);
		
		
	}

}

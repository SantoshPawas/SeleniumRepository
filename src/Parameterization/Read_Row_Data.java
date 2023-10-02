package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Row_Data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet6");
		
		int lastCellIndex=sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<lastCellIndex;i++)
		{
			String value=sh.getRow(0).getCell(i).getStringCellValue();
			Thread.sleep(2000);
			System.out.print(value+" ");
		}
		
		
	}

}

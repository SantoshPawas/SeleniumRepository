package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//how to read data from perticuler cell
public class Read_data_sameCol
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet6");
		
		int lastRowIndex=sh.getLastRowNum();
		for(int i=0;i<=lastRowIndex;i++)
		{
			String value=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value+" ");
		}
		
		
		
	}
	

}

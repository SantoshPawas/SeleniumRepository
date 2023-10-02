package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadHomo_data_fromsheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet6");
		
		int lastRowIndex=sh.getLastRowNum();
		int lastCellIndex=sh.getRow(0).getLastCellNum()-1;
		
	
		for(int i=0;i<=lastRowIndex;i++)
		{
			for(int j=0;j<=lastCellIndex;j++)
			{
				String value=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"\t\t");
			}
			System.out.println();
		}
		
		
	}
	

}

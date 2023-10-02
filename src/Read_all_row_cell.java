import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_all_row_cell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet6");
		
		int LastRowIndex=sh.getLastRowNum();
		for(int i=0;i<=LastRowIndex;i++)
		{
			int LastCellIndex=sh.getRow(i).getLastCellNum();
			
			for(int j=0;j<LastCellIndex;j++)
			{
				String value=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
			
		}
		
	}

}

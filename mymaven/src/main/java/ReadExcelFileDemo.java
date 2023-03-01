

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
public class ReadExcelFileDemo  
{  
public static void main(String args[]) throws IOException  
{  
//obtaining input bytes from a file  
FileInputStream fis=new FileInputStream(new File("C:\\myexcel.xlsx"));  
//creating workbook instance that refers to .xlsx file  
XSSFWorkbook wb=new XSSFWorkbook(fis);   
//creating a Sheet object to retrieve the object  
XSSFSheet sheet=wb.getSheetAt(0);  
//evaluating cell type   
 
for(Row row: sheet)     //iteration over row using for each loop  
{  
for(Cell cell: row)    //iteration over cell using for each loop  
{  
 //field that represents numeric cell type  
//getting the value of the cell as a number  
System.out.print(cell+ "\t\t");   
  
 
//getting the value of the cell as a string  
  


}  
System.out.println();  
}  
}  
}



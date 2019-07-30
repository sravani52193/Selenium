package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getdatafromallrowsandallcolum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fso =new FileInputStream("C:\\Users\\dell\\Desktop\\203410001w.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		Row r;
		
		
		int rowc=wso.getLastRowNum();
		
		for(int i=0;i<rowc;i++) {
			
			
		r=wso.getRow(i);
	String data=	r.getCell(0).getStringCellValue();
		
		//System.out.println(data);
		
		int rowb=r.getLastCellNum();
		
		for(int j=0;j<rowb;j++) {
			
			
			//r=wso.getRow(j);
		System.out.print(r.getCell(j).getStringCellValue()+"  ");	
			
			//System.out.println(data1+"");
			
			}
		

		System.out.println();
		
		}
		
		
		
		
		
		
		
		
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\203410001w.xlsx");
		wbo.write(fo);
		
		
	}

}

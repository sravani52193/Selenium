package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Updatenoofrows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fso =new FileInputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		Row r;
		
		int rowc=wso.getLastRowNum();
		for(int i=0;i<rowc;i++) {
		r=wso.getRow(i);
		r.createCell(0).setCellValue("hello");
		
		System.out.println("hello");
		}
		FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		wbo.write(fo);

	}

}

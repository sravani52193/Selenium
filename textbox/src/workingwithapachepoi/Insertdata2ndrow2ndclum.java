package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Insertdata2ndrow2ndclum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	FileInputStream fso=new FileInputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fso);
	XSSFSheet wso=wbo.getSheet("sheet1");
	Row r;
	r=wso.createRow(1);
	r.createCell(1).setCellValue("hello");
	
	FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
	wbo.write(fo);
	}

}

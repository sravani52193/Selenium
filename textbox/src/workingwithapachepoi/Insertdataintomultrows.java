package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Insertdataintomultrows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fso=new FileInputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook( fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		Row r;
		
		for(int i=0;i<13;i++) {
			r=wso.createRow(i);
			r.createCell(0).setCellValue("hello");
		}
		FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		wbo.write(fo);

	}

}

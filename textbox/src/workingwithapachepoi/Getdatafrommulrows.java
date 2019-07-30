package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class Getdatafrommulrows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fso =new FileInputStream("C:\\Users\\dell\\Desktop\\4D476000.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		
		
	Row r;
		
		
		for(int i=0;i<5;i++) {
		
		r=wso.getRow(i);
		
		
	String data=r.getCell(0).getStringCellValue();
	
	System.out.println(data);
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\4D476000.xlsx");
		wbo.write(fo);

	}

}
}

package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Insertdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

	    ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
	    
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	
		
		
		
	
		
		FileInputStream fso =new FileInputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		
		
		Row r;
		
		r=wso.createRow(0);
		
		String data = driver.findElement(By.linkText("Gmail")).getText();
		r.createCell(0).setCellValue(data);
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		wbo.write(fo);
		
		

	}

}

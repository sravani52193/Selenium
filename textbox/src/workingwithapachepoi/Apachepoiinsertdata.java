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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apachepoiinsertdata {
	
	ProfilesIni pr;
	FirefoxProfile fo;
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	FileOutputStream fp;
	
	@BeforeTest
	
	public void open() {
		pr=new ProfilesIni();
		fo=pr.getProfile("onlineqa");
		driver=new FirefoxDriver(fo);
		driver.get("https://www.google.com/");
	}
	
	@Test
	
	public void data() throws IOException {
		
		fso=new FileInputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("sheet1");
	
		
		Row r;
		r=wso.createRow(0);
		
		
		String data = driver.findElement(By.linkText("Gmail")).getText();
		
		r.createCell(0).setCellValue(data);
		
		FileOutputStream fp=new FileOutputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		wbo.write(fp);
		
		
		
		
	}

}

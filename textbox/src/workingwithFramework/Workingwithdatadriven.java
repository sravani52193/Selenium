package workingwithFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Workingwithdatadriven {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		FileInputStream fso=new FileInputStream("C:\\Users\\dell\\Desktop\\203410001.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		
		Row r;
		int rowc=wso.getLastRowNum();
		for(int i=0;i<rowc;i++) {
			
			r=wso.getRow(i);
			
			driver.findElement(By.id("txtUsername")).clear();
			
			driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
			
			
            driver.findElement(By.id("txtPassword")).clear();
			
			driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			
			driver.findElement(By.id("btnLogin")).click();
			
			
			String actual=driver.getCurrentUrl();
			
			
			r.createCell(3).setCellValue(actual);
			
			String expected=r.getCell(2).getStringCellValue();
			
			
			if(expected.equals(actual)) {
				
				r.createCell(4).setCellValue("pass");
			}
				
				else {
					
					r.createCell(4).setCellValue("fail");
				}
			FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\203410001.xlsx");
			wbo.write(fo);
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
				}
			}
			
}
			
			
			
			
			
		

	

	



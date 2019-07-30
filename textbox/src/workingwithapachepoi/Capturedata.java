package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Capturedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		FileInputStream fso=  new FileInputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\task1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		
		WebElement link=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"));
		String str=link.getText();
		
		Row r;
		r=wso.createRow(0);
		r.createCell(0).setCellValue(str);
		
		System.out.println(str);
		
		String expected="Jul";
		
		String actual=str;
		
		
		if (actual.contains(expected)) {
			
			r.createCell(1).setCellValue("pass");
		}
			else {
				r.createCell(1).setCellValue("fail");
				
			}
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\task1.xlsx");
		wbo.write(fo);
		}

	}



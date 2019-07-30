package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Getlinknamesinsrvalue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		FileInputStream fso =new FileInputStream("C:\\Users\\dell\\Desktop\\1DBD2000.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		
		Row r;
		
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		
		System.out.println("hai");
		
		
		for(int i=0;i<link.size();i++) {
			
			r=wso.getRow(i);
			r.createCell(1).setCellValue(link.get(i).getText());
			
			//System.out.println(link.get(i).getText());
			
			if(r.getCell(0).getStringCellValue().equals(link.get(i).getText())){
				
				r.createCell(2).setCellValue("pass");
			}else {
				r.createCell(2).setCellValue("fail");
				
			}
		}
		
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\dell\\Desktop\\1DBD2000.xlsx");
		wbo.write(fo);
	}

}

package workingwithapachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ntourreggetallvluefrmdropinsrexl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement list=driver.findElement(By.name("country"));
		List<WebElement> drop=list.findElements(By.tagName("option"));
		
		FileInputStream fso=new FileInputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\task1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		XSSFSheet wso=wbo.getSheet("sheet1");
		//try diff locatiomnes input one locaton output another exl file
		Row r;
		
		for(int i=0;i<drop.size();i++) {
			
			r=wso.createRow(i);
			
			r.createCell(1).setCellValue(drop.get(i).getText());
			
		}
	
		FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\4D476000.xlsx");
		wbo.write(fo);
	}

}

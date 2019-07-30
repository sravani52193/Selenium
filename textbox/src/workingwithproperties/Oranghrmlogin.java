package workingwithproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Oranghrmlogin {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
	
	@BeforeTest
	
	public void open(){
		
		pr=new ProfilesIni();
		fp=pr.getProfile("onlineqa");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
@Test


public void data() throws IOException{
	
	fso=new FileInputStream("C:\\Users\\dell\\Sravani\\textbox\\src\\workingwithproperties\\oranghrmlogin.properties");
	Properties prt =new Properties();
	prt.load(fso);
	
	driver.findElement(By.id(prt.getProperty("u"))).sendKeys("admin");
	
	driver.findElement(By.id(prt.getProperty("p"))).sendKeys("admin123");
	
	driver.findElement(By.id(prt.getProperty("l"))).click();
	
	
}
}

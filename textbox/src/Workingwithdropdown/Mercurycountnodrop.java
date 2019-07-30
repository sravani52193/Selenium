package Workingwithdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;

public class Mercurycountnodrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp =  pr.getProfile("onlineqa");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		List<WebElement> drop = driver.findElements(By.tagName("select"));
		
		System.out.println(drop.size());
		
		
		
		

	
			
			
			
			
			
			
			
		}
		

	}



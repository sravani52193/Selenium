package textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Verifygoogletittle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp = new ProfilesIni();
		FirefoxProfile pr =fp.getProfile("onlineqa") ;
		FirefoxDriver driver = new FirefoxDriver(pr);
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		String expected = "Gmail";
		String actual = driver.getTitle();
		
		System.out.println(actual);
		
		if(actual.equals(expected)){
			
			System.out.println("gmail");
		}
		else
			{
				System.out.println("notequal");
				
			}
		}
		
		

	}



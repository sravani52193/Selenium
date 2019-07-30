package Workingwithdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Mholidaydropdownselvlue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		
		
		driver.findElement(By.id("themes")).sendKeys("family");
		
		Sleeper.sleepTightInSeconds(3);
		
		
		
		Select drop =new Select(driver.findElement(By.id("themes")));
		    drop.selectByIndex(4);
		    
		drop.selectByVisibleText("Beach");

	}

}

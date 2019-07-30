package workingadvnuserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dragopeonslider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://jqueryui.com");
		
		WebElement slider=driver.findElement(By.id("sidebar"));
		
		Actions ac=new Actions(driver);
	
		int loc=slider.getLocation().x;
		
		Sleeper.sleepTightInSeconds(3);
	ac.dragAndDropBy(slider,100,loc).build().perform();
		
	}

}

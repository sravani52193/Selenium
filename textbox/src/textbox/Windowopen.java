package textbox;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Windowopen {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
		
		Sleeper.sleepTightInSeconds(3);
		 driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		 
		String parent = driver.getWindowHandle();
		Set<String> nwindow = driver.getWindowHandles();
		
		
             Iterator<String> it = nwindow.iterator();
             while(it.hasNext()){
            	 
            	 String wind = it.next().toString();
            	 if(!wind.contains(parent)){
            		 driver.switchTo().window(wind);
            		
            		 
            	 }
             }
             
            

	
		
		
		
		
	}

}

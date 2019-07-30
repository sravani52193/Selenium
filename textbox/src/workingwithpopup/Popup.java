package workingwithpopup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		String parent=driver.getWindowHandle();
		Set<String>pops=driver.getWindowHandles();
		
		Iterator<String>i=pops.iterator();
		while(i.hasNext()) {
			
			String popup=i.next().toString();
			if(!popup.contains(parent)) {
				
				driver.switchTo().window(popup);
				
				Sleeper.sleepTightInSeconds(3);
				driver.close();
				
				
			}
		}
		

	}

}

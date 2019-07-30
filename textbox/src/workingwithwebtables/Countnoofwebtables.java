package workingwithwebtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countnoofwebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
        FirefoxProfile pr=fp.getProfile("onlineqa");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.worldclock.com/");
        List<WebElement> clock=driver.findElements(By.tagName("table"));
        
		
		System.out.println(clock.size());
		
		
		
		

	}

}

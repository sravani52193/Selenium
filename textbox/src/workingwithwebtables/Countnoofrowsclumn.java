package workingwithwebtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countnoofrowsclumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
        FirefoxProfile pr=fp.getProfile("onlineqa");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.timeanddate.com/worldclock/");
        List<WebElement> clock=driver.findElements(By.tagName("td"));
        
        System.out.println(clock.size());
        
      for(int i=0;i<clock.size();i++) {
		
		System.out.println(clock.get(i).getText());
        }
		
		 List<WebElement> row=driver.findElements(By.tagName("tr"));
		 
		 System.out.println(row.size());
		 
		 for(int i=0;i<clock.size();i++) {
				
				System.out.println(clock.get(i).getText());
		        }
	        
			
			
	}

}

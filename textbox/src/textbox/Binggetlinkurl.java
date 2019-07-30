package textbox;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Binggetlinkurl {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ProfilesIni pr = new ProfilesIni();
   FirefoxProfile fp  = pr.getProfile("onlineqa");
   FirefoxDriver driver = new FirefoxDriver();
   driver.get("https://www.bing.com/");
   
   List<WebElement> links = driver.findElements(By.tagName("a"));
   
   for(int i=0;i<links.size();i++){
	   
	   System.out.println(links.get(i).getText());
	   
	   
	   if(links.get(i).isDisplayed()){
		   
		   String str2 = links.get(i).getText();
	

		  links.get(i).click();
		  
		  //Sleeper.sleepTightInSeconds(3);
		   
		 String str1 = driver.getCurrentUrl();
		  
		 
		 System.out.println(str1);
		 driver.navigate().back();
		 
		links =  driver.findElements(By.tagName("a"));
		  
		  
		  
		  
	   }
	   
	   
   }
   
   
	}

}

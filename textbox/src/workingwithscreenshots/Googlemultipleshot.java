package workingwithscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Googlemultipleshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		
		for(int i=0;i<link.size();i++) {
			
			if(link.get(i).isDisplayed()) {
				
				 System.out.println("hello");
				 Thread.sleep(3000);
				 String str2 =link.get(i).getText();
				
				 
				link.get(i).click();
				
				 System.out.println("hello");
				
					Sleeper.sleepTightInSeconds(3);
			
			
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcfile, new File("C:\\Users\\dell\\Desktop\\"+str2+".jpg"));
				
			    
			
				
				driver.navigate().back();
				link=driver.findElements(By.tagName("a"));
				 
				
				
			}
		}
				
	}

}


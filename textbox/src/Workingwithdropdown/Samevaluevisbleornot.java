package Workingwithdropdown;

import java.util.List;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Samevaluevisbleornot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement drop=driver.findElement(By.name("theme"));
		
		Thread.sleep(3000);
		List<WebElement>value=drop.findElements(By.tagName("option"));
		
	  for(int i=0;i<value.size();i++) {
		  
		  String name=value.get(i).getText();
		  value.get(i).click();
		  if(value.get(i).isDisplayed()) {
		  
			  System.out.println(name+""+"isactS");
		  }
			  else {
				  System.out.println(name+""+"isinact");
			  }
	  }

	}

}
package Workingwithdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Mercurygetnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement value = driver.findElement(By.id("themes"));
		
		List<WebElement> drop = value.findElements(By.tagName("option"));
		
		for(int i=1;i<drop.size();i++){
			System.out.println(drop.get(i).getText());
			
		}

	}

}

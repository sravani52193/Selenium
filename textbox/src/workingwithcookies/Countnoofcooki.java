package workingwithcookies;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countnoofcooki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mirror.co.uk/");
		
		Set<Cookie> mycookies=driver.manage().getCookies();
		
		System.out.println(mycookies.size());
		

	}

}

package textbox;


import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Orangehrm {

	public static void main(String[] args) {
		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile gp = pr.getProfile("onlineqa");
		
FirefoxDriver fp = new FirefoxDriver(gp);
fp.get("https://www.google.com/");
fp.findElement(By.linkText("Gmail")).click();


	}
}

package workingadvnuserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Rightclickongmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions ac=new Actions(driver);
		ac.contextClick(gmail).build().perform();
	}

}

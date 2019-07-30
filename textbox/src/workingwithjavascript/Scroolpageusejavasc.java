package workingwithjavascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Scroolpageusejavasc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,5000)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("document.getElementById('u_0_1b').scrollIntoview");
		
	}

}

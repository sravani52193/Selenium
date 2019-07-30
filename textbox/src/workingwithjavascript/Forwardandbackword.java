package workingwithjavascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Forwardandbackword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.history.back()");
		
		Thread.sleep(3000);
		
		js.executeScript("window.history.forward()");
	}

}

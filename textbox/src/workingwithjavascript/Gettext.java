package workingwithjavascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Gettext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		

		Thread.sleep(3000);
		
		
		String title =js.executeScript("return document.title").toString();
		                 
		System.out.println(title);
		System.out.println("hello");
		
		

	}

}

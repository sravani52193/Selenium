package workingwithjavascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Loginoperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		System.out.println("hello");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('email').value='sravani521.ch@gmail.com'");
		
		//driver.findElement(By.id("email")).sendKeys("sravani521.");
	
		
		//driver.findElement(By.id("pass")).sendKeys("9059550416");
		
		js.executeScript("document.getElementById('u_0_3').click()");
		

	}

}

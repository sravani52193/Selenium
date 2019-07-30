package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Loginiguru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProfilesIni pr = new ProfilesIni();
		   FirefoxProfile fp  = pr.getProfile("onlineqa");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("http://demo.guru99.com/V4/index.php");
		   driver.findElement(By.name("uid")).sendKeys("sravani");
		   driver.findElement(By.name("password")).sendKeys("sravani");
		   driver.findElement(By.name("btnLogin")).click();
		  // driver.findElement(By.name("btnReset")).click();
		   
		   
		   
		   
		   
	}

}

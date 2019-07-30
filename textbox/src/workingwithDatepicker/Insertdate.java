package workingwithDatepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Insertdate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Datepicker")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).sendKeys("07/24/2019");

	}

}

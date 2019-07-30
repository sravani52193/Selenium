package workingwithDatepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Searchholiday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		driver.findElement(By.id("holiday_category_id")).sendKeys("usa");
		driver.findElement(By.id("duration_d")).sendKeys("2Nights+3Days");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('dphh1').value='05/16'");
		
		driver.findElement(By.name("theme")).sendKeys("summer");
		driver.findElement(By.xpath("//*[@id=\"int_auto_comp_param\"]/div/div/div[3]/div/div/button")).click();
		
		
	}

}

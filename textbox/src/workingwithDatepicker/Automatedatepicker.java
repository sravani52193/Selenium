
package workingwithDatepicker;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Automatedatepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='08/07'");

	}

}

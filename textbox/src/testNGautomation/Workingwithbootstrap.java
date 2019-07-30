package testNGautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Workingwithbootstrap {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	
	public void open() {
		
		pr=new ProfilesIni();
		fp=pr.getProfile("onlineqa");
		driver=new FirefoxDriver();
		driver.get("https://www.goibibo.com/?utm_source=Affiliate&utm_medium=Affinity&utm_campaign=Acquisition_CPO");
	}
		
		@Test
		
		public void data() {
			
			driver.findElement(By.linkText("signin")).click();
			
			System.out.println("hello");
			
			
			
		}
	
	
	

}

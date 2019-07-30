package workingwithBootstrap;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class Bootstrap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		
				
				
				ProfilesIni fp =new ProfilesIni();
				FirefoxProfile pr = fp.getProfile("onlineqa");
				
				FirefoxDriver driver = new FirefoxDriver();
				driver.get("https://www.goibibo.com/?utm_source=Affiliate&utm_medium=Affinity&utm_campaign=Acquisition_CPO");
				
				driver.findElement(By.linkText("Sign In")).click();
				
				Sleeper.sleepTightInSeconds(3);
				
				driver.switchTo().frame(0);
				
				Thread.sleep(3000);
				driver.findElement(By.id("authMobile")).sendKeys("9059550416");
				driver.findElement(By.id("mobileSubmitBtn")).click();


			}

		}


	



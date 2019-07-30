package workingwithalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Checkavailworkwithalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		
		
		driver.findElement(By.name("searchBtn")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		String text=driver.switchTo().alert().getText();
		
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		

	}

}

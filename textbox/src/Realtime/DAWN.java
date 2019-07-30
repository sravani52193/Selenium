package Realtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DAWN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.dawn.com/");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@type='FATHIMA']"));
		
		WebElement text1=driver.findElement(By.tagName("body"));
		
		
		String actual= text1.getText();
		
		System.out.println(actual);
		
		if(actual.contains("PRISM")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		
		}
		
	

}

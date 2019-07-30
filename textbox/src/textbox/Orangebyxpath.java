package textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Orangebyxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 FirefoxDriver driver = new FirefoxDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/");
 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
 driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
 driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
 
 Sleeper.sleepTightInSeconds(3);
 driver.findElement(By.xpath("//*[@id='welcome']")).click();
 driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}
	

}

package workingwithwindowelement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robotclassdownloding {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open()
	
	{
		pr=new ProfilesIni();
		fp= pr.getProfile("onlineqa");
		driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
	}
	@Test
	public void data() throws AWTException, InterruptedException{
		
		driver.findElement(By.linkText("3.141.59")).click();
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}

}

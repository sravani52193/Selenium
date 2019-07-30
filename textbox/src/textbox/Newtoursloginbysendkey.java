package textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtoursloginbysendkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://websites.milonic.com/newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		

	}

}

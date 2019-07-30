package workingadvnuserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Flipkartdraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		
		Sleeper.sleepTightInSeconds(3);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/span"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(drag).build().perform();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Kurtas")).click();
		Sleeper.sleepTightInSeconds(3);
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/div/section[2]"));
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,5000)");
	
		
		//WebElement slider=driver.findElement(By.id("sidebar"));
		
	
		int loc=slider.getLocation().x;
		ac.dragAndDropBy(slider,50,loc).build().perform();

	}

}

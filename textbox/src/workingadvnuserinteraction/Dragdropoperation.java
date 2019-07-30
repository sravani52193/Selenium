package workingadvnuserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dragdropoperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Draggable")).click();
		//driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		Sleeper.sleepTightInSeconds(3);
		WebElement drop=driver.findElement(By.id("droppable"));
		
		
		
		Actions ac=new Actions(driver);
	   ac.dragAndDrop(drag,drop).build().perform();

	}

}

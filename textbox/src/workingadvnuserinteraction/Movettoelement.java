package workingadvnuserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Movettoelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement move=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[10]/a"));
		
		
		
		Actions ac=new Actions(driver);
		ac.moveToElement(move).build().perform();
		
		driver.findElement(By.linkText("Careers")).click();
		
		

	}

}

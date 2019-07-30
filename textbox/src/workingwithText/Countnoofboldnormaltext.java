package workingwithText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countnoofboldnormaltext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		List<WebElement>boldtext=driver.findElements(By.tagName("b"));
		System.out.println(boldtext.size());

		List<WebElement>normaltext=driver.findElements(By.tagName("p"));
		System.out.println(normaltext.size());

	}

}

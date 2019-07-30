package workingwithframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countnoofframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("");
		
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		System.out.println("frames.size()");

	}

}

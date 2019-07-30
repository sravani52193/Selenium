package workingwithimages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Getsrcofimg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		
		System.out.println("no.of images are"+""+imgs.size());
		for(int i=0;i<imgs.size();i++) {
		
		
		System.out.println(imgs.get(i).getAttribute("src"));
	}

}
}

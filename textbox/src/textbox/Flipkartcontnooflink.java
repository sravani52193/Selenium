package textbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Flipkartcontnooflink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(3000);
		List<WebElement>link=driver.findElements(By.tagName("a"));
		
		
		System.out.println(link.size());
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i).getText());
		}

	}

}

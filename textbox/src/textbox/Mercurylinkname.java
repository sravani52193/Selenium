package textbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Mercurylinkname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("onlinqa");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no of links are"+links.size());
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}
		
		
	}

}

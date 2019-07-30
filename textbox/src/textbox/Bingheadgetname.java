package textbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Bingheadgetname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		
		WebElement header = driver.findElement(By.id("sc_hdu"));
		List<WebElement> links =header.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}

	}

}

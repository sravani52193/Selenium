package textbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Bingvilinkhilnk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp =new ProfilesIni();
		FirefoxProfile pr = fp.getProfile("onlineqa");
		FirefoxDriver driver =new FirefoxDriver();
				driver.get("https://www.bing.com/");
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				
				int count = 0;
				int i =0;
				for( i=0;i<links.size();i++){
					
					
					if(links.get(i).isDisplayed()){
						
						
						count++;
					
				
					}
					
				}
				
				
				//System.out.println(links.get(i).getText());
System.out.println("no of visablelinks"+" "+count);
System.out.println("no of hidenlinks"+" "+(links.size()-count));



	}
	


}

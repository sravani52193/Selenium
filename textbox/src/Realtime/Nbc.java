package Realtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class Nbc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.nbc.ca/");
		
		WebElement credit=driver.findElement(By.id("1"));
		
		
		Actions ac=new Actions(driver);
		ac.moveToElement(credit).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"Sticky-0\"]/div[2]/div[2]/div/div[1]/div[2]/div[2]/a[5]")).click();
		
		WebElement tab=driver.findElement(By.xpath("//*[@id=\"TableStatic-1\"]/div/table/tbody/tr[1]/td[2]"));
		
		String str=tab.getText();
		
		System.out.println(str);
		
		List<WebElement> nrow=tab.findElements(By.tagName("tr"));
		
		System.out.println(nrow.size());
		 
		
		for(int i=0;i<nrow.size();i++) {
			
			System.out.println(nrow.get(i).getText());
		}
			
	}

}

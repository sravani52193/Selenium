package Realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Nbc2 {

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
		
		String part="//*[@id=\"TableStatic-1\"]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int i=1;i<8;i++) {
			
			for(int j=1;j<4;j++) {
				
				Sleeper.sleepTightInSeconds(3);
				
				String output=driver.findElement(By.xpath(part+i+part2+j+part3)).getText();
				
				System.out.print(output+"");
			}
			System.out.println();
		}

	}

}

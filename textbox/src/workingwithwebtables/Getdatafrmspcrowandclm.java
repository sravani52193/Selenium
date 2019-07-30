package workingwithwebtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Getdatafrmspcrowandclm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ProfilesIni fp=new ProfilesIni();
        FirefoxProfile pr=fp.getProfile("onlineqa");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.worldclock.com/");
        //text
        
        String clock=driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/table/tbody/tr[7]/td[1]")).getText();
        
		
		System.out.println(clock);
		
		//time
		
		String data1=driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/table/tbody/tr[13]/td[2]/span[1]")).getText();
		System.out.println("hello");
		
		System.out.println(data1);

	}

}

package workingwithcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Getnameofattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		List<WebElement>check=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<check.size();i++) {
		
		System.out.println(check.get(i).getAttribute("name")); 

	}

}
}
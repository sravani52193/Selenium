package workingwithradiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countnoofradiobtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
        List<WebElement> value=driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(value.size());
	}

}

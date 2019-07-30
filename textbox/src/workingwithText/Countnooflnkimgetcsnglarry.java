package workingwithText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countnooflnkimgetcsnglarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement>elements=driver.findElements(By.tagName("a"));
		System.out.println("no of links are"+""+elements.size());
		
		elements=driver.findElements(By.tagName("img"));
		System.out.println("no of images are"+""+elements.size());
		
		elements=driver.findElements(By.tagName("select"));
		System.out.println("no of dropdowns are"+""+elements.size());

		elements=driver.findElements(By.tagName("//input[@type='checkbox"));
		System.out.println("no of checkbox are"+""+elements.size());

		elements=driver.findElements(By.tagName("p"));
		System.out.println("no of normal text are"+""+elements.size());


	}

}

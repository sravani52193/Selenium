package workingwithText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Fillallregistrationdetil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("sravani");
		driver.findElement(By.name("lastName")).sendKeys("chinthagunta");
		driver.findElement(By.name("phone")).sendKeys("9059550416");
		driver.findElement(By.name("userName")).sendKeys("sravani521.ch@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("50061/hyd");
		driver.findElement(By.name("city")).sendKeys("sec");
		driver.findElement(By.name("state")).sendKeys("telengana");
		driver.findElement(By.name("postalCode")).sendKeys("50002");
		driver.findElement(By.name("country")).sendKeys("TOGO");
		driver.findElement(By.name("email")).sendKeys("sravani");
		driver.findElement(By.name("password")).sendKeys("sravani");
		driver.findElement(By.name("confirmPassword")).sendKeys("sravani");
		driver.findElement(By.name("register")).click();
		
		String expected=" sravani.";
		String actual=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(actual.contains(expected)) {
			
			System.out.println("tc pass");
		}
		else {
			System.out.println("tc fail");
		}
		
		

	}

}

package textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Verifyelentpregm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProfilesIni pr = new ProfilesIni();
FirefoxProfile fp = pr.getProfile("onlineqa");
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/");
WebElement links=driver.findElement(By.linkText("Gmail"));
if(links.isDisplayed()){
	
	System.out.println("gmail page");	
}
	else
	{

	System.out.println("not available");
}
}
}




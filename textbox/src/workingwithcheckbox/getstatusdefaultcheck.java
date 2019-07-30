package workingwithcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class getstatusdefaultcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(int i =0;i<check.size();i++) {
			if(check.get(i).isSelected()) {
				System.out.println(check.get(i).getAttribute("name")+""+"isactive");}
			else
			{
				System.out.println(check.get(i).getAttribute("name")+""+"inactive");
			}
		}
	}

}

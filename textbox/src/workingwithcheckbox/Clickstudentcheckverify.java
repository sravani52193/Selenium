package workingwithcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Clickstudentcheckverify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		WebElement student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		student.click();
		if(student.isSelected()) {
			System.out.println("check pass");
		}
		else {
			System.out.println("check fail");
		}
	}

}

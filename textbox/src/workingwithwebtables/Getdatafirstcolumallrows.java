package workingwithwebtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Getdatafirstcolumallrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ProfilesIni fp=new ProfilesIni();
        FirefoxProfile pr=fp.getProfile("onlineqa");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.timeanddate.com/worldclock/");
       
        String str="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String str2="]/td[1]";
		
		for(int i=1;i<37;i++) {
			String opt=driver.findElement(By.xpath(str+i+str2)).getText();
			System.out.println(opt);
		}
		

	}

}

package workingwithwebtables;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Allrowallcolums {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		Thread.sleep(3000);
		for(int i=1;i<37;i++) {
			for(int n=1;n<8;n++) {
				String output=driver.findElement(By.xpath(part1+i+part2+n+part3)).getText();
				
				System.out.print(output+"");
			}
			System.out.println();
		}
		
		
		

	}

}

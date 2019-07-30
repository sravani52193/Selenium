package workingwithscreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Googlegmailcapscreen {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		

		String title =driver.getTitle(); 
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File("C:\\Users\\dell\\Desktop\\"+title+".jpg"));
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String str2 = driver.getTitle();
		
		File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("C:\\Users\\dell\\Desktop\\"+str2+".jpg"));
		
		
		
	}

}

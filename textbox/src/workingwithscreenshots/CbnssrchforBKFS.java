package workingwithscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CbnssrchforBKFS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("onlineqa");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.cnbc.com/world/?region=world");
		
		
		
		List<WebElement> link=driver.findElements(By.linkText("BkFS"));
		
		if(link.size()==0)
			{
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(srcfile, new File("C:\\\\Users\\\\dell\\\\Desktop\\\\proof.jpg"));
			}
				
		else
		{
			link.get(0).click();
		}
		}
		
		

	}



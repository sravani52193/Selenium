package workingwithwebtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamicwebtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ProfilesIni fp=new ProfilesIni();
        FirefoxProfile pr=fp.getProfile("onlineqa");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.timeanddate.com/worldclock/");
        
        WebElement dt=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]"));
        
        
        Thread.sleep(3000);
        List<WebElement> nrow=dt.findElements(By.tagName("tr"));
        
        
        for(int i=0;i<nrow.size();i++) {
        	
        
        	
        	List<WebElement>ncol=nrow.get(i).findElements(By.tagName("td"));
        	
        	Sleeper.sleepTightInSeconds(3);
        	
        	for(int n=0;n<ncol.size();n++) {
        		System.out.print(ncol.get(n).getText()+"");
        	}
        	   System.out.println();

        }
		
		
     
        
	}

}

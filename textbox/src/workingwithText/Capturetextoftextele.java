package workingwithText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Capturetextoftextele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		List<WebElement>boldtext=driver.findElements(By.tagName("b"));
		System.out.println(boldtext.size());
	  
	    
	    for(int i=0;i<boldtext.size();i++) {
	    	System.out.println(boldtext.get(i).getText());
	    	
	    
	    }	List<WebElement>normaltext=driver.findElements(By.tagName("p"));
	    System.out.println(normaltext.size());
	  	  
	    
		    for(int j=0;j<boldtext.size();j++) {
		    	System.out.println(normaltext.get(j).getText());
	    
	    
	    

	}

}
}

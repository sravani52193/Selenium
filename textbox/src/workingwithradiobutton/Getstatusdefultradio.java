package workingwithradiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Getstatusdefultradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		ProfilesIni fp=new ProfilesIni();
		FirefoxProfile pr=fp.getProfile("onlineqa");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement> value=driver.findElements(By.xpath("//input[@type='radio']"));
		
		
		
           for(int i=0;i<value.size();i++) {
        	   
        	   
        	   if(value.get(i).isSelected()) {
        		   
        		   System.out.println(value.get(i).getAttribute("name")+""+"isactive");
        	   }
        		   else {
        			   System.out.println("is inactive");
        		   }
        		   
        	   
           }
	}


	}


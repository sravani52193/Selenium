package Realtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.nbc.ca/");
		WebElement mort=driver.findElement(By.id("3"));
		Actions ac=new Actions(driver);
		ac.moveToElement(mort).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Mortgage insurance")).click();
		driver.findElement(By.xpath("//*[@id=\"67d369ee-d9df-4adf-b47b-8fe3d7ea9423_parsys_panelcontainer_1784315151_parsys_collapse_copy_collapse_parsys_shown_textandimage\"]/div/div/p")).click();
	
		WebElement text=driver.findElement(By.xpath("/html/body/div[5]/div/div[5]/div[2]/div/div/div[3]/div/div[2]"));
		
		
		
		
		
		//WebElement text=driver.findElement(By.tagName("body"));
	
	
	if(text.isDisplayed()) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
	}}
		
		
		
		
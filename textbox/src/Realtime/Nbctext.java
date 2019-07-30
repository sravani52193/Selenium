package Realtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class Nbctext {

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
		String str=driver.findElement(By.xpath("//*[@id=\"67d369ee-d9df-4adf-b47b-8fe3d7ea9423_parsys_panelcontainer_1784315151_parsys_collapse_copy_collapse_parsys_collapse_panelcontainer_parsys_textandimage\"]/div/div")).getText();
		String expected="The offer below is valid from February 18 to October 31, 2019 (the \"Offer Period\"). The offer may be modified, extended, or withdrawn without prior notice at any time.\r\n" + 
				"\r\n" + 
				"This offer is for clients who sign up for disability or critical illness insurance on a new high ratio mortgage, in other words, with a downpayment equivalent to less than 20%  of the house value.  The refund amount could be up to 25% of premiums for the first year.\r\n" + 
				"\r\n" + 
				"To be eligible for this offer, clients must not have submitted a previous claim for the loan (all insured persons).\r\n" + 
				"\r\n" + 
				"At the end of the 12th month of enrolment, an amount will be refunded equal to 25% of the premium amount paid in the first month for eligible coverage (premium divided by a factor based on mortgage payment frequency) multiplied by 12.\r\n" + 
				"\r\n" + 
				"The refund is only calculated based on the coverage still in effect.\r\n" + 
				"\r\n" + 
				"If all conditions are met, the refund will be granted during the 13th month and deposited to the client's National Bank transaction account. Clients will receive a letter confirming the date and amount of the deposit.";
		if(str.contains(expected)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
	}

}

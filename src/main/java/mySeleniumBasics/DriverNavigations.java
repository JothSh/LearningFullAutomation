package mySeleniumBasics;

import org.openqa.selenium.By;

public class DriverNavigations {

	
	
	public static void main (String[]args) {
		
		  GlobalWebLauncher.launchBrowser();
		GlobalWebLauncher.driver.get("https://letcode.in/button");
		String currentUrl = GlobalWebLauncher.driver.getCurrentUrl();
		System.out.println("Current page url"+currentUrl);
		
		GlobalWebLauncher.driver.findElement(By.id("home")).click();
		String navigatedUrl = GlobalWebLauncher.driver.getCurrentUrl();
		System.out.println("Naviagted url = "+ navigatedUrl);
		
		GlobalWebLauncher.driver.navigate().back();
		String againNavigatedUrl = GlobalWebLauncher.driver.getCurrentUrl();
		System.out.println("Agin we came back to the start point "+ againNavigatedUrl);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

package mySeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebDriverWaitsConcepts {

	
	
		
		  public static void main(String[] args) {

		        GlobalWebLauncher.launchBrowser();
		        GlobalWebLauncher.getWait();
		        GlobalWebLauncher.driver.get("https://www.saucedemo.com/");

		        
		        
		        // Wait until the username field is visible
		        WebElement username = GlobalWebLauncher.wait.until(
		                ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))
		        );

		        username.sendKeys("standard_user");
		        
		        WebElement password = GlobalWebLauncher.wait.until(
		        		ExpectedConditions.visibilityOfElementLocated(By.id("password"))
		        		
		        		);
		        
		        password.sendKeys("secret_sauce");
		    }
		}

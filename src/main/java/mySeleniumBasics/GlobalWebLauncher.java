package mySeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalWebLauncher {

	 public static WebDriver driver;
	 public static WebDriverWait wait ;

	    public static void launchBrowser() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	    }
		 public static void getWait() {
			  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
		 }
	}



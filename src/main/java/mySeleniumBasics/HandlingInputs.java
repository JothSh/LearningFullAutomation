package mySeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	
	
	public static void main (String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.linkedin.com/?mcid=6844056167778418689&src=go-pa&trk=sem-ga_campid.14650114788_asid.145595942605_crid.651893406694_kw.www%20linkedin%20com_d.c_tid.kwd-2246447642_n.g_mt.e_geo.1007810&cid=&gclsrc=aw.ds&gad_source=1&gad_campaignid=14650114788&gbraid=0AAAAABKX7wH4etQ7uBlUjSNAkioJgKAd2&gclid=EAIaIQobChMIvtLJqZuDkwMVkaJmAh0zjjGIEAAYASAAEgII8_D_BwE");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath(
			    "//a[@data-tracking-control-name='guest_homepage-basic_nav-header-signin']"
			)).click();
		
		driver.findElement(By.xpath("//input[@name='session_key']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//Button[@type='submit']")).click();
		
		
		
	}
	
	
}

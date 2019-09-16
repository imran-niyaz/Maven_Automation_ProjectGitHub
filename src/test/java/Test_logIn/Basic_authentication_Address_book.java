package Test_logIn;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import junit.framework.Assert;

public class Basic_authentication_Address_book {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
		"/Users/imran/Documents/Cybertek/dependencies/WebDrivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://a.testaddressbook.com/sign_in");
		
	    WebElement username = driver.findElement(By.id("session_email"));
	    username.sendKeys("kexesobepu@zsero.com");
	    
	    
	    WebElement password = driver.findElement(By.className("form-control"));
	    password.sendKeys("password");
	    
	    WebElement signIn = driver.findElement(By.name("commit"));
	    signIn.click();
		
		
		
	}

}

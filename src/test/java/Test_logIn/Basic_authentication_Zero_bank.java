package Test_logIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Basic_authentication_Zero_bank {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
		"/Users/imran/Documents/Cybertek/dependencies/WebDrivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/login.html");
		
		WebElement user = driver.findElement(By.id("user_login"));
		user.sendKeys("username");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"user_password\"]"));
		password.sendKeys("password");
		
		WebElement signIn = driver.findElement(By.name("submit"));
		signIn.click();
		
		// verify user name is displayed
		WebElement userNameOnHomePage = driver.findElement(By.className("dropdown-toggle"));
		Assert.assertTrue(userNameOnHomePage.isDisplayed());
		
		Thread.sleep(2000);

		String title = driver.getTitle();
		Assert.assertEquals("Zero - Account Summary", title);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}

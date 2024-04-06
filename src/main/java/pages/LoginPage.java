package pages;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseTest;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void enterUsernamePassword(String username,String password) {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		driver.findElement(By.id("login")).click();
	}
	
	public void logoutButton() {
		driver.findElement(By.id("submit")).click();
	}
	
	public void verifyUsernameAfterLogin() {
		WebElement usernameElm=driver.findElement(By.id("userName-value"));
		org.testng.Assert.assertEquals(usernameElm.isDisplayed(), true);
	}
	
	public void verifyInvalidLogin() {
		WebElement errorMsgElm=driver.findElement(By.id("name"));
		org.testng.Assert.assertEquals(errorMsgElm.isDisplayed(), true);
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class NewUserPage{
        WebDriver driver;
	
	public NewUserPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click_newUser_button() {
		driver.findElement(By.id("newUser")).click();		
	}

	public void enter_firstName() {
		driver.findElement(By.id("firstname")).sendKeys("Test");
	}
	
    public void enter_lastName() {
    	driver.findElement(By.id("lastname")).sendKeys("test1");
	}
    public void enter_userName() {
    	driver.findElement(By.id("userName")).sendKeys("Test123");
   	}
     public void enter_password() {
    	 driver.findElement(By.id("password")).sendKeys("Test@123");
   	}
     
     public void click_register() {
    	 driver.findElement(By.id("register")).click();
     }
     
     public void verifyNewUserPage() {    	
    	Assert.assertEquals(driver.findElement(By.xpath("*//form[@id=\"userForm\"]/div/h4")).isDisplayed(), true);
     }
     
     public void verifyUser() {
    	 Assert.assertEquals(((WebElement) driver.findElements(By.xpath("*//p[@id=\"name\"]"))).isDisplayed(), true);
     }
	
}

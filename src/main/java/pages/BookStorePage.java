package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookStorePage{
	
	WebDriver driver;
	
	public BookStorePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click_goToBookStore() {
		driver.findElement(By.id("gotoStore")).click();		
	}
	
	
	public void search_element() {		
		WebElement elm=	driver.findElement(By.id("searchBox"));
		elm.sendKeys("Git Pocket Guide");
		
	}
	
	public void verifyBookPage() {
		WebElement bookEml= driver.findElement(By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]"));
		Assert.assertEquals(bookEml.isDisplayed(), true);
	}
}

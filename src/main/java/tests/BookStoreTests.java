package tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BookStorePage;
import pages.LoginPage;

public class BookStoreTests extends BaseTest {
	
	BookStorePage bookPage;
	LoginPage loginPage;
	
	@Parameters({"url"})
	@BeforeMethod
	public void beforeMethod(String url) throws InterruptedException {
		setUp(url);
		loginPage=new LoginPage(driver);	
		Thread.sleep(2000);
		loginPage.enterUsernamePassword("admin288","Admin@288");
		loginPage.clickLoginButton();
		bookPage=new BookStorePage(driver);
		Thread.sleep(2000);
		bookPage.click_goToBookStore();
		Thread.sleep(1000);
		bookPage.verifyBookPage();
		
	}
		
	@Test
	public void serach_book() {
		bookPage.search_element();
		loginPage.logoutButton();
	}
	

}

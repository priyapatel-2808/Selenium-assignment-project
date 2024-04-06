package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import base.BaseTest;
import pages.NewUserPage;

public class NewUserTests extends BaseTest {
	NewUserPage userPage;
	
	@Parameters({"url"})
	@BeforeMethod
	public void beforeMethod(String url) throws InterruptedException {
		setUp(url);		
		Thread.sleep(2000);		
	}
	
	@Test
	public void new_user() {
		userPage=new NewUserPage(driver);
		userPage.click_newUser_button();
		userPage.verifyNewUserPage();
		userPage.enter_firstName();
		userPage.enter_lastName();
		userPage.enter_userName();
		userPage.enter_password();
		userPage.click_register();
		userPage.verifyUser();
	}
	
}

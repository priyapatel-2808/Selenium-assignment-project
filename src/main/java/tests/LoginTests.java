package tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.PropertyReadWrite;

public class LoginTests extends BaseTest {
	LoginPage loginPage;
	String dataPath = "C:\\Users\\Priya\\eclipse-workspace\\Selenium_Assigment_Project\\src\\main\\resources\\testdata\\loginData.properties";
	PropertyReadWrite pr=new PropertyReadWrite();
	
	@Parameters({"url"})
	@BeforeMethod
	public void beforeMethod(String url) throws InterruptedException {
		setUp(url);
		loginPage=new LoginPage(driver);	
		Thread.sleep(2000);
	}
	
	@Test
	public void login_with_valid_credentials() throws InterruptedException, IOException {
		String username=PropertyReadWrite.readProperty(dataPath, "username1");
		String password=PropertyReadWrite.readProperty(dataPath, "password1");
		loginPage.enterUsernamePassword(username,password);	
		loginPage.clickLoginButton();
		Thread.sleep(2000);
		loginPage.verifyUsernameAfterLogin();
		
	}
	
	
	//@Test
	public void login_with_invalid_credentials() throws InterruptedException, IOException {
		String username=PropertyReadWrite.readProperty(dataPath, "username2");
		String password=PropertyReadWrite.readProperty(dataPath, "password2");
		loginPage.enterUsernamePassword(username,password);	
		loginPage.clickLoginButton();
		Thread.sleep(2000);
		loginPage.verifyInvalidLogin();
	}
		
}

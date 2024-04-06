package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver=new ChromeDriver();

	public void setUp(String url) {		
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get(url);
	}

}

package co.com.totto.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import co.com.totto.main.Driver;

public class BaseTest {
	
	public WebDriver driver;
	public static WebDriverWait wait;
	public String baseUrl;
	
	
	@Before
	public void setUp() {
		baseUrl ="https://co.totto.com/";
		
		Driver driverConfiguration = new Driver("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe","http://www.totto.com/");
		driver = driverConfiguration.DriverConfiguration();
		
		
		
		wait = new WebDriverWait(driver, 15);
		
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
				
	}
	
	@After	
	public void tearDown() {
		driver.quit();
	}

}

package co.com.totto.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver{
	private WebDriver driver;
//	private final String driverChrome="webdriver.chrome.driver";
//	private final String Ruta="C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
//	private final String Url ="http://www.totto.com/";
	
	private  String driverChrome;
	private  String Ruta;
	private  String Url;
	public Driver(String driverChrome, String Ruta, String Url) {
		this.driverChrome = driverChrome;
		this.Ruta = Ruta;
		this.Url= Url;
			
	}
	
	public WebDriver DriverConfiguration() {
		System.setProperty(driverChrome,Ruta);
		driver = new ChromeDriver();
		return driver;		
	}
	
	public void OpenTotto() {
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	
}

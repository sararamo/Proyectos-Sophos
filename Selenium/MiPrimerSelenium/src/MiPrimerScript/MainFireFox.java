package MiPrimerScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainFireFox 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\\\geckodriver.exe");
		WebDriver driverFireFox = new FirefoxDriver();//inicializa	
		driverFireFox.manage().window().maximize();//maximizar la ventana	
		driverFireFox.get("http://www.google.com.uy");//va a la url
		driverFireFox.findElement(By.name("q")).sendKeys("selenium get Screenshot java");
		driverFireFox.findElement(By.name("btnK")).submit();
		
		
		File src=((TakesScreenshot)driverFireFox).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the  screenshot to desired location using copyFile method
			 
		FileUtils.copyFile(src, new File("C:/selenium/captura.png"));                              
			} catch (IOException e)
			 
			{
			  System.out.println(e.getMessage());
			}
		//driver.close();
      }
		

}



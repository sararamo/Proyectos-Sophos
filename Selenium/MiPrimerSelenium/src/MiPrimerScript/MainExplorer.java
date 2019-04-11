package MiPrimerScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MainExplorer 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();//inicializa	
		driver.manage().window().maximize();//maximizar la ventana	
		driver.get("http://www.bing.com");//va a la url
		driver.findElement(By.name("q")).sendKeys("selenium get Screenshot java");
		driver.findElement(By.name("go")).submit();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the  screenshot to desired location using copyFile method
			 
		FileUtils.copyFile(src, new File("C:/selenium/captura.png"));                              
			} catch (IOException e)
			 
			{
			  System.out.println(e.getMessage());
			}
      }
		
		//driver.close();
		

}



package MiPrimerScript;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HolaMundo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//inicializa	
		driver.manage().window().maximize();//maximizar la ventana	
		driver.get("http://www.google.com.uy");//va a la url
		driver.findElement(By.name("q")).sendKeys("selenium get Screenshot java");
		driver.findElement(By.name("btnK")).submit();
		

		
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



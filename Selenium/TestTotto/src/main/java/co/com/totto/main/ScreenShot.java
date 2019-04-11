package co.com.totto.main;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShot {
	
private static int Image =1;
	
	public void Capture (WebDriver driver) 
    {
		try 
		{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
								 
		FileUtils.copyFile(src, new File("C:\\Users\\SEMILLERO\\Desktop\\TestTotto\\Capture\\"+Image+".png"));
		Image++;
		} catch (IOException e)
		  {
			System.out.println(e.getMessage());
		  }
    }

}

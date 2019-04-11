package co.com.totto.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCar 
{
	private ScreenShot picture = new ScreenShot();
	private WebDriver driver;
	private WebDriverWait wait;
	
	By add = By.xpath("//a[@class='buy-button buy-button-ref active']");
	By buy = By.xpath("//div[@class='mr-goto-cart']/a");
	
	public AddToCar(WebDriver driver, WebDriverWait wait)
	{
		this.driver= driver;
		this.wait= wait;
	}
	
	public void capture() {
		picture.Capture(driver);
	}
	
	public void Add()
	{
		picture.Capture(driver);
		driver.findElement(add).click();
	}
	
	public void Buy()
	{
		picture.Capture(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(buy));
		driver.findElement(buy).click();
	}
}


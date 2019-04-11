package co.com.totto.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage 
{
	private WebDriver driver;

	private ScreenShot picture = new ScreenShot();
	private By IconoBuscar = By.xpath("//a[@class='__searchBtn icon icon-search']");
	private By Escribir = By.xpath("//input[@id='top_search']");
	
	public SearchPage(WebDriver driver)
	{
		this.driver= driver;

	}
	
	public void capture() {
		picture.Capture(driver);
	}
	
	public void IcBuscar()
	{
		picture.Capture(driver);
		driver.findElement(IconoBuscar).click();
	}
	
	public void EscribirPalabra()
	{
		picture.Capture(driver);
		driver.findElement(Escribir).sendKeys("Morrales");
		driver.findElement(Escribir).sendKeys(Keys.ENTER);
	}
	
	
}

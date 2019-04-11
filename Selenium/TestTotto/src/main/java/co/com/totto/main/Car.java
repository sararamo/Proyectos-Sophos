package co.com.totto.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Car {
	
	private ScreenShot picture = new ScreenShot();
	private WebDriver driver;
	private WebDriverWait wait;
	By addProduct = By.xpath("//a[@id='cart-choose-more-products']");
	By selectCar = By.xpath("//a[@class='__cart']");
	
	
	public Car(WebDriver driver, WebDriverWait wait)
	{
		this.driver= driver;
		this.wait = wait;
		
	}
	
	public void capture() {
		picture.Capture(driver);
	}
	
	public void AddProduct() {
		wait.until(ExpectedConditions.presenceOfElementLocated(addProduct));
		picture.Capture(driver);
		driver.findElement(addProduct).click();
	}
	
	public void SelectCar() {
		wait.until(ExpectedConditions.presenceOfElementLocated(selectCar));
		picture.Capture(driver);
		driver.findElement(selectCar).click();
	}
	
	

}

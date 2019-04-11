package co.com.totto.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetResult {
	private WebDriver driver;
	private WebDriverWait wait;
//	private ClassModel classModel;
	By nombre= By.xpath("//span[@class='mr-prod-name']");
	By cantidad = By.xpath("//span[@class='mr-prod-qty']/small");
	
	public GetResult(WebDriver driver, WebDriverWait wait) 
	{
		this.driver=driver;
		this.wait= wait;
	}
	

	public ClassModel Result (ClassModel classModel)
	{	
		
		do { 
			wait.until(ExpectedConditions.presenceOfElementLocated(nombre)); 
		} 
		while (driver.findElement(nombre).getText().replace("-", "").replace(" ", "").toLowerCase().trim().isEmpty()); 		 		 		
		classModel = new ClassModel(classModel.getNombreEsperado(),classModel.getCantidadEsperada(),driver.findElement(nombre).getText().replace("-", "").replace(" ", "").toLowerCase().trim(),driver.findElement(cantidad).getText());		 		
		return classModel;
	}

}

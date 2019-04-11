package co.com.totto.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetDataPage 
{
	private WebDriver driver;
//	private ClassModel classModel;
	By nombre= By.xpath("//div[@class='_prodname']/h1/div[1]");
	By cantidad = By.xpath("//span[@class='label']");
	
	public GetDataPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	

	public ClassModel Data (ClassModel classModel)
	{	
		classModel = new ClassModel(driver.findElement(nombre).getText().replace("-", "").replace(" ", "").toLowerCase().trim(), driver.findElement(cantidad).getText(),"","");		
		return classModel;
	}

}


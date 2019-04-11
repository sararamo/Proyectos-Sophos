package co.com.totto.main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import co.com.totto.main.ScreenShot;

public class SelectArticlePage 
{
	private ScreenShot picture = new ScreenShot();
	private WebDriver driver;
	private By article =By.xpath("//div[@class='vitrine resultItemsWrapper']/div[@class='prateleira vitrine']/div/ul/li[2]");
	
	public SelectArticlePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void capture() {
		picture.Capture(driver);
	}
	
	public void Article() 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript ("window.scrollBy (0,500)");
		picture.Capture(driver);
		driver.findElement(article).click();
				
	}
	
	public void Resaltar() {
		
		Highlight resaltar = new Highlight();
		WebElement Article = driver.findElement(article);
		resaltar.highlightElement(driver, Article);
	}
	

	
}


package co.com.totto.test;

import org.junit.Assert;
import org.junit.Test;

import co.com.totto.main.AddToCar;
import co.com.totto.main.Car;
import co.com.totto.main.ClassModel;
import co.com.totto.main.GetDataPage;
import co.com.totto.main.GetResult;
import co.com.totto.main.SearchPage;
import co.com.totto.main.SelectArticlePage;

public class JUnitTotto extends BaseTest {
	SearchPage searchPage;
	SelectArticlePage selectArticlePage;
	GetDataPage getDataPage;
	ClassModel classModel;
	AddToCar addToCar;
	Car car;
	GetResult getResult;
	
	@Test
	public void test() {
		
		searchPage = new SearchPage(driver);
		
		selectArticlePage = new SelectArticlePage(driver);
		getDataPage=new GetDataPage(driver);
		addToCar = new AddToCar(driver, wait);
		car = new Car(driver, wait);
		getResult = new GetResult(driver,wait);
		searchPage.IcBuscar();
		searchPage.EscribirPalabra();
		selectArticlePage.Resaltar();
		selectArticlePage.Article();		
		classModel = getDataPage.Data(classModel);
		addToCar.Add();
		addToCar.Buy();
		car.AddProduct();
		car.SelectCar();
		classModel= getResult.Result(classModel);
		Assert.assertEquals(classModel.getNombreEsperado(),classModel.getNombreObtenido());		
		Assert.assertEquals(classModel.getCantidadEsperada(), classModel.getCantidadObtenida());
		//System.out.println(classModel.getNombre()+classModel.getCantidad());
		
		
		
		
		
	}

}

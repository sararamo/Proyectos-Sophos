package com.totto.co.qa.screenplaytotto.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TottoPaginaProducto extends PageObject {

	public static final Target Seleccionar_Producto = Target.the("Seleccionar Producto")
            .located(By.xpath("//div[@class='vitrine resultItemsWrapper']/div[@class='prateleira vitrine']/div/ul/li[2]"));
	
//	public static final Target lblSeleccionar_Producto(int numero) {
//		return Target.the("Seleccionar Producto")
//	            .located(By.xpath("//div[@class='vitrine resultItemsWrapper']/div[@class='prateleira vitrine']/div/ul/li["+numero+"]"));
		
	//}
}

package com.totto.co.qa.screenplaytotto.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://co.totto.com/")
public class TottoPaginaInicio extends PageObject {
	
	public static final Target Boton_Buscar = Target.the("boton buscar")
            .located(By.xpath("//a[@class='__searchBtn icon icon-search']"));
	
	
	public static final Target Barra_Buscar = Target.the("la barra de busqueda")    		
            .located(By.xpath("//input[@id='top_search']"));
    
}

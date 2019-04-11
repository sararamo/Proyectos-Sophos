package com.totto.co.qa.screenplaytotto.utils;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Utility {
	
	
public static WebElementFacade listaProductos(Actor actor) {
	List<WebElementFacade>listaElementos = BrowseTheWeb.as(actor).findAll("//div[@class='main']//div[@class=\"hightlight-wrapper\"]");
	int posicion = (int)(Math.random()*listaElementos.size());
	return listaElementos.get(posicion);
}
	

}

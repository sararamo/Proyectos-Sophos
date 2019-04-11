package com.totto.co.qa.screenplaytotto.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TottoAgregaAlCarro extends PageObject {
	public static final Target Agregar_Carrito = Target.the("Agregar al carrito de compras")
            .located(By.xpath("//a[@class='buy-button buy-button-ref active']"));
	public static final Target lblProductoCarrito = Target.the("El texto del producto en el carro")
            .located(By.xpath("//span[@class='mr-prod-name']"));

}

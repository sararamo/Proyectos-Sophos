package com.totto.co.qa.screenplaytotto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.totto.co.qa.screenplaytotto.userinterfaces.TottoPaginaInicio.Boton_Buscar;
import static com.totto.co.qa.screenplaytotto.userinterfaces.TottoPaginaInicio.Barra_Buscar;
import org.openqa.selenium.Keys;
import com.totto.co.qa.screenplaytotto.models.TottoModels;



public class BusquedaProducto implements Task {
	
	public static final int PRODUCTO_INDICE=0;
	
	private String palabra1;
	private String palabra2;

	public BusquedaProducto(String palabra1,String palabra2) {
		this.palabra1= palabra1;
		this.palabra2 = palabra2;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
					Click.on(Boton_Buscar),
					Enter.theValue(palabra1+" "+palabra2).into(Barra_Buscar).thenHit(Keys.ENTER)
					);
				
	}
	/*
	public static BusquedaProducto composedOfTheWords(String nombre, String caracteristica) {
		return instrumented(BusquedaProducto.class,nombre,caracteristica);
	}
	*/
	public static BusquedaProducto composedOfTheWords(TottoModels tottoModels) {
		return instrumented(BusquedaProducto.class,tottoModels.getPalabra1(),tottoModels.getPalabra2());
	}

	

}

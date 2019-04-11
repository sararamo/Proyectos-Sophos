package com.totto.co.qa.screenplaytotto.tasks;

import static com.totto.co.qa.screenplaytotto.userinterfaces.TottoAgregaAlCarro.Agregar_Carrito;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregaAlCarrito implements Task{
	
	public AgregaAlCarrito() {
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
					Click.on(Agregar_Carrito)
					
					
				);
									
	}
	public static AgregaAlCarrito agregarProducto(Actor actor) {
		return instrumented(AgregaAlCarrito.class,actor);
	}

}

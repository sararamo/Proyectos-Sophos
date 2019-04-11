package com.totto.co.qa.screenplaytotto.interactions;

import com.totto.co.qa.screenplaytotto.utils.Utility;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class Clic implements Interaction {
	
	public Clic() {
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(Utility.listaProductos(actor)));
	}
	
	public static Clic clicProductoEncontrado(Actor actor) {
		return instrumented(Clic.class,actor);
	}
	
}

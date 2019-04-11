package co.com.google.screenplaydatatable.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.google.screenplaydatatable.userinterfaces.PaginaGoogleInicio.BarraBuscar;
import static co.com.google.screenplaydatatable.userinterfaces.PaginaGoogleInicio.BotonBuscar;

public class BuscarPalabra implements Task{
	
	private String phrase;
	
	public BuscarPalabra(String phrase) {
		this.phrase = phrase;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(phrase).into(BarraBuscar),
				Click.on(BotonBuscar)
				);
		
	}
	
	public static BuscarPalabra composedOfTheWords(String palabraUno, String palabraDos) {
		
		return instrumented(BuscarPalabra.class, palabraUno +" "+ palabraDos);
			
	}
	

}

package co.com.google.screenplaydatatable.questions;

import co.com.google.screenplaydatatable.userinterfaces.PaginaResultadoGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("validar resultado")
public class LaPalabra implements Question<String>  {
	
	public LaPalabra() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answeredBy(Actor actor) {

		return PaginaResultadoGoogle.BarraBuscar.resolveFor(actor).waitUntilVisible().getValue();
	}
	
	public static LaPalabra searched() {
		return new LaPalabra();
	}
	

}

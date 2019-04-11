package com.totto.co.qa.screenplaytotto.questions;

import com.totto.co.qa.screenplaytotto.userinterfaces.TottoAgregaAlCarro;
import com.totto.co.qa.screenplaytotto.utils.Utility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Validar el producto encontrado")
public class ElProducto implements Question<Boolean> {
	
	public ElProducto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		// TODO Auto-generated method stub
		return TottoAgregaAlCarro.lblProductoCarrito.resolveFor(actor).waitUntilVisible().isVisible();
	}
	
	public static ElProducto Buscado() {
		return new ElProducto();
	}
}

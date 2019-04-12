package com.totto.co.qa.screenplaytotto.stepsdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import com.totto.co.qa.screenplaytotto.exceptions.NoEncontrado;
import com.totto.co.qa.screenplaytotto.interactions.Clic;
import com.totto.co.qa.screenplaytotto.models.TottoModels;
import com.totto.co.qa.screenplaytotto.questions.ElProducto;
import com.totto.co.qa.screenplaytotto.tasks.AgregaAlCarrito;
import com.totto.co.qa.screenplaytotto.tasks.BusquedaProducto;
import com.totto.co.qa.screenplaytotto.userinterfaces.TottoPaginaInicio;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.hamcrest.core.StringContains;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;


public class BuscarEnTottoStepDefinitions {
	
	public  static final int FraseActual = 0;
	TottoPaginaInicio tottoHomePage;
	
	@Managed(driver = "chrome") 
	private WebDriver Buscador;	
    private Actor saray = Actor.named("Saray");
    
    @Before
	 public void actorCanBrowseTheWeb() {
    	saray.can(BrowseTheWeb.with(Buscador));
    	}
	
	@Given("^Saray esta en la pagina de totto$")
	public void sarayEstaEnLaPaginaDeTotto() throws Exception {
		saray.wasAbleTo(Open.browserOn().the(tottoHomePage));
	    
	}

	@When("^Ella busca el producto deseado$")
	public void ellaBuscaElProductoDeseado(List<TottoModels> posicion) {
		saray.attemptsTo(BusquedaProducto.composedOfTheWords(posicion.get(FraseActual)));
		saray.attemptsTo(Clic.clicProductoEncontrado(saray));
		saray.attemptsTo(AgregaAlCarrito.agregarProducto(saray));
	}

	@Then("^Ella verifica que el carrito tenga un producto$")
	public void ellaVerificaQueElCarritoTengaUnProducto() throws Exception {
		saray.should(seeThat(ElProducto.Buscado(),is(true))); 
		
	
	}


}

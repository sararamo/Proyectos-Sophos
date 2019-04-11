package co.com.google.certificacion.miprimerscreenplay.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.google.certificacion.miprimerscreenplay.models.Phrase;
import co.com.google.certificacion.miprimerscreenplay.questions.ThePhrase;
import co.com.google.certificacion.miprimerscreenplay.tasks.LookUpPhrase;
import co.com.google.certificacion.miprimerscreenplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class BusquedaEnGoogleStepsDefinitions {
	
	public  static final int CURRENT_FRASE = 0;	
	GoogleHomePage googleHomePage;
	
	@Managed(driver = "chrome")
	    private WebDriver hisBrowser;
	    private Actor saray = Actor.named("Saray");
	    
	@Before
	 public void actorCanBrowseTheWeb() {
		saray.can(BrowseTheWeb.with(hisBrowser));
	   }
	
	@Given("^Saray esta en el sitio de google$")
	public void arthurEstaEnElSitioDeGoogle()  {
		saray.wasAbleTo(Open.browserOn().the(googleHomePage));
	  
	}

	@When("^ella busca la frase compuesta$")
	public void elBuscaLaFraseCompuesta(List<Phrase> phrases){
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		saray.attemptsTo(LookUpPhrase.composedOfTheWords(phrases.get(CURRENT_FRASE)));
	}

	@Then("^ella verifica que la palabra \\\"([^\\\"]*)\\\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado)  {
	    
		saray.should(seeThat(ThePhrase.searched(), is(resultadoEsperado))); 
	}



}


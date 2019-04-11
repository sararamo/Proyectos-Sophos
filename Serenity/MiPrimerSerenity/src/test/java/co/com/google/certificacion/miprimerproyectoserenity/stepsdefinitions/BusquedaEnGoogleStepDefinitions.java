package co.com.google.certificacion.miprimerproyectoserenity.stepsdefinitions;

import co.com.google.certificado.miprimerproyectoserenity.steps.EndUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaEnGoogleStepDefinitions {
	
	@Steps
	EndUserStep user;
	

	@Given("^El usuario esta en el sitio de google$")
	public void elUsuarioEstaEnElSitioDeGoogle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    user.is_the_home_page();
	}

	@When("^Busca la palabra \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void buscaLaPalabraCompuesta(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		user.looks_for(arg1+" "+arg2);
	    
	}

	@Then("^Verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void verificaQueLaPalabraEsteEnLosResultados(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}

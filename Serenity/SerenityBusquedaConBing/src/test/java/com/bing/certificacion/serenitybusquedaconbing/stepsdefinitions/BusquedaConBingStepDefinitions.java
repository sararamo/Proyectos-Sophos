package com.bing.certificacion.serenitybusquedaconbing.stepsdefinitions;

import com.bing.certificacion.serenitybusquedaconbing.steps.EndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaConBingStepDefinitions {
	
	@Steps
	EndUserSteps Saray;
	
	@Given("^El usuario esta en el sitio de Bing$")
	public void el_usuario_esta_en_el_sitio_de_Bing() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Saray.is_the_home_page();
	}


	@When("^Busca la palabra \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void busca_la_palabra_compuesta(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Saray.looks_for(arg1+" "+arg2);
	}

	@Then("^Verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void verifica_que_la_palabra_este_en_los_resultados(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}

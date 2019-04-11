package co.com.google.certificacion.miprimerproyectoserenity.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/feature",
        glue = { "co.com.google.certificacion.miprimerproyectoserenity.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  

public class BusquedaEnGoogleRunner {

}

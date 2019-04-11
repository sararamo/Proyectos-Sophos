package com.bing.certificacion.serenitybusquedaconbing.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "com.bing.certificacion.serenitybusquedaconbing.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  

public class BusquedaEnBingRunner {

}

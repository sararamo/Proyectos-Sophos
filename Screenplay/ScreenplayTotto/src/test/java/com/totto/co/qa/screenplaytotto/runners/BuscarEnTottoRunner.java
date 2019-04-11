package com.totto.co.qa.screenplaytotto.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "com.totto.co.qa.screenplaytotto.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  

public class BuscarEnTottoRunner {

}


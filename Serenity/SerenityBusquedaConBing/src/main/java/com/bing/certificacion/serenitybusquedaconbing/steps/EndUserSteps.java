package com.bing.certificacion.serenitybusquedaconbing.steps;

import com.bing.certificacion.serenitybusquedaconbing.pages.BingHomePage;

import net.thucydides.core.annotations.Step;

public class EndUserSteps {
	
    BingHomePage bingHomePage;
    

    @Step
    public void is_the_home_page() {
    	bingHomePage.open();
    }


    @Step
    public void enters(String keyword) {
    	bingHomePage.enter_keywords(keyword);
    }

    @Step
    public void startsSearch() {
    	bingHomePage.lookup_terms();
    
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        startsSearch();
    
    }
}

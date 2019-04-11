package co.com.google.certificado.miprimerproyectoserenity.steps;

import co.com.google.certificado.miprimerproyectoserenity.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;


public class EndUserStep {
	
    GoogleHomePage googlePage;
    

    @Step
    public void is_the_home_page() {
        googlePage.open();
    }

    
    @Step
    public void enters(String keyword) {
        googlePage.enter_keywords(keyword);
    }

    @Step
    public void startsSearch() {
    	googlePage.lookup_terms();
    
    }


    @Step
    public void looks_for(String term) {
        enters(term);
        startsSearch();
    
    }
}

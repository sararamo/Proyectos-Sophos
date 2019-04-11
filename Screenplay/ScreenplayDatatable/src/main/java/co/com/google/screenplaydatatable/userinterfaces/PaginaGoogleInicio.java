package co.com.google.screenplaydatatable.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")

public class PaginaGoogleInicio extends PageObject {
    public static final Target BarraBuscar = Target.the("la barra de busqueda")    		
            .located(By.name("q"));
    
    public static final Target BotonBuscar = Target.the("boton buscar")
            .located(By.name("btnK"));
}



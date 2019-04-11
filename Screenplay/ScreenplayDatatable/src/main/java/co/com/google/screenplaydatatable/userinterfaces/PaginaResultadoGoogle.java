package co.com.google.screenplaydatatable.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaResultadoGoogle extends PageObject {
	   public static final Target BarraBuscar = Target.the("la barra de busqueda")    		
	            .located(By.name("q"));
	   public static final Target Resultado = Target.the("lista de resultados")    		
	            .located(By.id("resultStats"));

}



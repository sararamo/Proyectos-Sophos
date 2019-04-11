package jExcel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import jxl.*;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Leer 
{

	public static void main(String[] args) throws IOException, BiffException, WriteException
	{
		
		Workbook workbook = Workbook.getWorkbook(new File("C:\\Selenium\\Datos.xlt")); //Pasamos el excel que vamos a leer
		WritableWorkbook newbook  = Workbook.createWorkbook(new File("C:\\Selenium\\Datos2.xls"),workbook); //copia del archivo 
		Sheet sheet = newbook.getSheet(0); //Seleccionamos la hoja que vamos a leer
		String nombre;
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//inicializa	
		driver.manage().window().maximize();//maximizar la ventana	
		
		
		for (int fila = 0; fila < sheet.getRows(); fila++) 
			{   //recorremos las filas
				driver.get("http://www.google.com.uy");//va a la url
			for (int columna = 0; columna < sheet.getColumns(); columna++) 
				{   
				if(columna == 0) 
				{
					//recorremos las columnas
					nombre = sheet.getCell(columna, fila).getContents(); //setear la celda leida a nombre
					driver.findElement(By.name("q")).sendKeys(nombre);
					driver.findElement(By.name("btnK")).submit();
					
					ExpectedCondition<Boolean> HasResult; //ExpectedCondition<Boolean> tipo de variable
					String mensaje ="no encontrado"; 
					try
					{
					 HasResult = ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Resultados de búsqueda')]")));
					 if(HasResult != null ) 
		             {
		            	  	 
		            	 mensaje = "Encontrado";
		             }
					 
					}catch (Exception e)
					{
						
					}
				
					
	            	 WritableCell cell = ((WritableSheet) sheet).getWritableCell(columna+1, fila);
	            	 Label l = (Label) cell; 
	            	 l.setString(mensaje);
					
				}
          			
			    }
			
			}
		try
		{
		 newbook.write(); 
		 newbook.close();
		 workbook.close();
		}catch (Exception e)
		{
			
		}
		
	}
	
	



}


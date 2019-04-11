package com.sophos.leermysql;

import  java.sql.Connection;		
import  java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;

public class  BuscarG {				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
    		
	    		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    		WebDriver driver = new ChromeDriver();
	    		driver.get("http://www.google.com");
	    		
                String dbUrl = "jdbc:mysql://localhost:3306/db_busqueda";					

				//Database Username		
				String username = "root";	
                
				//Database Password		
				String password = "mysql";				

				//Query to Execute		
				String query = "select Nombre,Encontrado from datos;";	
                
         	    //Load mysql jdbc driver		
           	    Class.forName("com.mysql.jdbc.Driver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);							
         
         		// While Loop to iterate through all data and print results		
				while (rs.next())
				{
			        		String palabraBuscar = rs.getString("Nombre");								        					                               
                            System. out.println(palabraBuscar);
                            
                            
                            driver.findElement(By.name("q")).sendKeys(palabraBuscar);
                            driver.findElement(By.name("btnK")).submit();
                            
                            try 
                            {
								if (ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Resultados de búsqueda')]")))!=null) 
								{
									rs.updateString("Encontrado", "Si");
									rs.updateRow();
									driver.get("http://www.google.com");
								}
							} catch (Exception e) 
                            {
								rs.updateString("Encontrado", "No");
								rs.updateRow();
								driver.get("http://www.google.com");
								
							}
                                    		
                    		
                    }		
      			 // closing DB Connection		
      			con.close();
      			driver.close();
      			
      			
		}
}
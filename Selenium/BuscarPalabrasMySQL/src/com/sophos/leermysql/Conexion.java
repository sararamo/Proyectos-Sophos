package com.sophos.leermysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion 
{
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/db_busqueda";
    private static final String USUARIO = "root";
    private static final String CLAVE = "mysql";
    
    static {
    	try {
    		Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cagar el controlador");
			e.printStackTrace();
		}
    }
	
	public Connection Conectar() 
	{
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("Conexión establecida");
		}catch(SQLException e)
		{
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
}

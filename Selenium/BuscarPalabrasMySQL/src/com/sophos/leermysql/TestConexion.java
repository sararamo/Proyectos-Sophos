package com.sophos.leermysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestConexion 
{
	public static void main(String[] args) 
	{
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;	
		ResultSet rs = null;
		try {
			cn = conexion.Conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM datos");
				
				while (rs.next())
				{
					String nombre = rs.getString(1);
					String estado = rs.getString(2);
					System.out.println(nombre+"-"+ estado);
				}
							
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}finally {
			try {
				if (rs!=null)
				{
					rs.close();
				}
				if(stm != null)
				{
					stm.close();
				}
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}

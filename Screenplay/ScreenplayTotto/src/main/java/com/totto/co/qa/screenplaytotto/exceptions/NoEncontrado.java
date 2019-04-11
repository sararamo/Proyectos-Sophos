package com.totto.co.qa.screenplaytotto.exceptions;

public class NoEncontrado extends AssertionError{
	
	private static final String NoEncontroProducto ="Producto no encontrado";
			
		
		public NoEncontrado(String message, Throwable cause) {
			super(message,cause);
		}
		
	}



package com.unimagdalena.logica;

import java.util.regex.Pattern;

public class Expresion {
	
	String cadena;
	public String getExpresion() {
		return cadena;
	}
	public void setExpresion(String expresion) {
		this.cadena = expresion;
	}
	public Expresion(int cont, String expresion) {
		super();
		this.cadena = expresion;
	}
	public Expresion() {
		super();
	}
	
	
	public boolean validar() {
		String regexp = "[a-b]+";
		if(Pattern.matches(regexp, this.cadena)) {
			return true;
		}
		return false;
	}
}

package com.unimagdalena.logica;

import java.util.Scanner;

public class Main {

	static int cont;
	public static void main(String[] args) {
		Expresion expresion = new Expresion();
		Scanner leer = new Scanner (System.in);	
		
		do {
			System.out.println("Ingrese la cadena a evaluar (solo debe contener 'a' y/o 'b'):");			
			expresion.cadena = leer.next();					
		}while(!expresion.validar());
		leer.close();
		
		cont=0;
		Main.inicio(expresion);
	}
	
	public static void inicio(Expresion exp) {
		if(cont<exp.cadena.length()) {
			if(exp.cadena.charAt(cont)=='a'){
				StringBuilder nueva_cadena = new StringBuilder(exp.cadena);
				nueva_cadena.setCharAt(cont, 'a');
				exp.setExpresion(nueva_cadena.toString());
				cont++;
				System.out.println("Lee 'a', escribe 'a' y el cabezal se mueve a la derecha");
				System.out.println(exp.cadena);
				q0(exp);
			}else if(exp.cadena.charAt(cont)=='b') {
				StringBuilder nueva_cadena = new StringBuilder(exp.cadena);
				nueva_cadena.setCharAt(cont, 'a');
				exp.setExpresion(nueva_cadena.toString());
				cont++;	
				System.out.println("Lee 'b', escribe 'a' y el cabezal se mueve a la derecha");
				System.out.println(exp.cadena);
				q0(exp);
			}
		}
	}
	
	public static void q0(Expresion exp) {
		if(cont<exp.cadena.length()) {
			if(exp.cadena.charAt(cont)=='a'){
				StringBuilder nueva_cadena = new StringBuilder(exp.cadena);
				nueva_cadena.setCharAt(cont, 'a');
				exp.setExpresion(nueva_cadena.toString());
				cont++;
				System.out.println("Lee 'a', escribe 'a' y el cabezal se mueve a la derecha");
				System.out.println(exp.cadena);
				q0(exp);
			}else if(exp.cadena.charAt(cont)=='b') {
				StringBuilder nueva_cadena = new StringBuilder(exp.cadena);
				nueva_cadena.setCharAt(cont, 'a');
				exp.setExpresion(nueva_cadena.toString());
				cont++;	
				System.out.println("Lee 'b', escribe 'a' y el cabezal se mueve a la derecha");
				System.out.println(exp.cadena);
				q0(exp);
			}
		}else {
			System.out.println("Lee vacío y se pasa a estado final");
		}
	}

}

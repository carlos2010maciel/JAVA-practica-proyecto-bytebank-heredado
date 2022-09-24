package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {
	
	public static void main(String[] args) {
		String nombre = "Alura"; //En el caso de String esta es la forma de asignar valor a la variable
		
		//No utilizada en el mundo real
		//String nombre2 = new String("Alura");
		
		/*
		 * Inmutabilidad
		 * TodoString es inmutable
		 */
		System.out.println("Antes de replace: " + nombre);
		nombre = nombre.replace("A", "a");
		System.out.println("Después de replace: " + nombre);
		nombre = nombre.concat(" cursos online");
		System.out.println("Después de concat: " + nombre);
		nombre = nombre.toUpperCase();
		System.out.println("Después de toUpperCase: " + nombre);
		nombre = nombre.toLowerCase();
		System.out.println("Después de toLowerCase: " + nombre);
		
		//alura -> 01234
		//char devuelve el caracter de un índice
		char letra = nombre.charAt(3);
		System.out.println("Caracter encontrado con charAt: " + letra);

		//indexOf devuelve el índice de un caracter
		//indexOf es un método sobrecargado
		int indice = nombre.indexOf("e"); //la opción mas usada
		System.out.println("índice encontrado con indexOf: " + indice);
		
		String nombre2 = "AUTO";
		CharSequence cs = new StringBuilder("au");

		nombre2 = nombre2.replace("AU", cs);

		System.out.println("Después de StringBuilder: " + nombre2);
		
		printLine(nombre);
		printLine(letra); 
		printLine(indice);
		printLine(new CuentaAhorros(200, 300));
	}
	
		/*
		 * Lo de abajo no es una buenas práctica
		
		public static void printLine(int valor) {
			System.out.println(valor);
		}
		
		
		//En el casod e una letra imprime el valor en código ASCII
		public static void printLine(String valor) {
			System.out.println(valor);
		}
		
		public static void printLine(char valor) {
			System.out.println(valor);
		}
		
		*/
	
		/*
		 * FORMA CORRECTA
		 * Llamando a la clase Object (Padre) 
		 * 
		 */
		public static void printLine(Object valor) {
			System.out.println(valor);
		}

}

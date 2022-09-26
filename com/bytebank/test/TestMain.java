package com.bytebank.test;

public class TestMain {
	
	/*
	 * public: modificador de acceso
	 * static: indica que este objeto está localizado en una sección específica de la memoria HEAP
	 * void: indica que es método que no retorna valor
	 * main: indica que es el método principal
	 * String: un tipo de objeto que almacena una secuencia de caracteres
	 * Los Corchetes:
	 * args: argumentos
	 */
	public static void main(String[] args) {
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//Los índices siempre incian en cero
		//Quiero agruparlas en una sola referencia
		int[] edades = new int[5];
		edades[2] = 30;
		System.out.println(edades[2]);
		System.out.println(edades[0]);
		
		int tamanioArray = edades.length;
		//Imprimo la longitud del Array
		System.out.println("La longitud del array es " + tamanioArray);
		
		//imprimo todos los valores del array
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}
	}

}

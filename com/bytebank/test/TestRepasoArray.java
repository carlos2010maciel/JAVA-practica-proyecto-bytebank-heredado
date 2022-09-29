package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	
	public static void main(String[] args) {
		
		//primitivo ----> representa el valor
		int [] numeros = new int[10];
		
		int numero = 40;
		
		//WRAPPER//Deprecated
		//Integer numeroObjeto = new Integer(40);
		Integer numeroObjeto = Integer.valueOf(40);
		
		List<Integer> lista = new ArrayList();
		// primitivo != object
		lista.add(numero); //autoboxing: mapea automáticamente el valor del primitivo y crea una instancia
		//Es lo mismo que autoboxing
		lista.add(Integer.valueOf(40));
		lista.add(numeroObjeto);
		
		//unboxing
		int valorPrimitivo = numeroObjeto;
		//Extrae el valor numérico del objeto y lo guarda en el primitivo
		//int valorPrimitivo = numeroObjeto.intValue();
		
		byte byteInteger = numeroObjeto.byteValue();
		double doublleInteger = numeroObjeto.doubleValue();
		float floatInteger = numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE); //bits
		System.out.println(Integer.BYTES); // 4
		
	}

}

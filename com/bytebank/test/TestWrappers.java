package com.bytebank.test;

public class TestWrappers {

	public static void main(String[] args) {
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        
        Double numeroDouble = 33.0; //autoboxing
        Boolean verdadero = true; //autoboxing
        
        Double numeroDouble2 = Double.valueOf(33);
        
        System.out.println(numeroDouble2);
        
        String numeroString = "43"; //autoboxing
        
        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);
        
        System.out.println(stringToDouble);
        System.out.println(stringToInteger);
        
        Number numero = Integer.valueOf(5);
        double numeroDoublePrim = numero.doubleValue(); //unboxing
        
        //No es una variable sino una consstante
        // Boolean falso = Boolean.FALSE;
	}

}

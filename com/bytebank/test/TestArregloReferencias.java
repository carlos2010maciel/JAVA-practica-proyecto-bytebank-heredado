package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
	
	public static void main(String[] args) {
		
		//defino la longitud del array
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		
		CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        CuentaCorriente cc2 = new CuentaCorriente(33, 44);
        
        //asigno valores a las posiciones 0 y 1
		cuentas[0] = cc1;
		cuentas[1] = cc2;
		
		
		System.out.println(cc1);
		System.out.println(cuentas[1]);
		
		//Le asigno un nuevo valor a la posición [0]
		cuentas[0] = new CuentaCorriente(11, 99);
		System.out.println(cuentas[0]);
		
		//imprimo todo el array
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
	}

}

package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
	
	public static void main(String[] args) {
		
		//defino la longitud del array
		//Cuenta[] cuentas = new Cuenta[5];
		//Puedo definir como Object en lugar de Cuenta
		//Object es el mas absorbente de todos los objetos
		
		Object[] referencias = new Object[5];
				
		CuentaCorriente cc = new CuentaCorriente(55, 66);
		
		
		referencias[1] = cc;
		
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
		//Cast: Le indico que el objeto es del tipo Cliente
		Cliente obtenido = (Cliente) referencias[4];
		System.out.println(obtenido);
		
		//creo una CuentaAhorros y le asigno la posición 3
		CuentaAhorros ca = new CuentaAhorros(44, 55);
		referencias[3] = ca;
		
		//CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        //CuentaCorriente cc2 = new CuentaCorriente(33, 44);
        
        //asigno valores a las posiciones 0 y 1
		//cuentas[0] = cc1;
		//cuentas[1] = cc2;
		
		
		//System.out.println(cc1);
		//System.out.println(cuentas[1]);
		
		//Le asigno un nuevo valor a la posición [0]
		referencias[0] = new CuentaCorriente(11, 99);
		System.out.println(referencias[0]);
		
		//Cast: obligo a que el valor cuentas sea una CuentaCorriente
		CuentaCorriente  cuenta = (CuentaCorriente) referencias[1];
		System.out.println(cuenta);
		
		//imprimo todo el array
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
	}

}

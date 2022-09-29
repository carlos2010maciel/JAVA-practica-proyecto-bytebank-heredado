package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();

	    Cuenta cc1 = new CuentaCorriente(11, 22);
	    Cuenta cc2 = new CuentaCorriente(33, 44);

	    lista.add(cc1);
	    
	    //Pruebo si la listaa tiene una cuenta
	    boolean existe = lista.contains(cc2); //nuevo

	    System.out.println("Ya existe? " + existe);

	    for(Cuenta cuenta : lista){
	        System.out.println(cuenta);
	    }
	    
	    //creación de cuentas omitidas
	    boolean igual = cc1.equals(cc2);
	    System.out.println(igual); //debe imprimir true
	}

}

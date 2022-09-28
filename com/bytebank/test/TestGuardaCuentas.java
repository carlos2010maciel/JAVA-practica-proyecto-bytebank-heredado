package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardadorDeCuentas;

public class TestGuardaCuentas {
	
	public static void main(String[] args) {
		
		/*
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaCuentas.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaCuentas.adicionar(cc2);
		
		guardaCuentas.obtener(1);
		
		System.out.println(guardaCuentas.obtener(0));
		System.out.println(guardaCuentas.obtener(1));
		*/
		
		 GuardadorDeCuentas guardador = new GuardadorDeCuentas();

        Cuenta cc = new CuentaCorriente(22, 11);
        guardador.adicionar(cc);

        Cuenta cc2 = new CuentaCorriente(22, 22);
        guardador.adicionar(cc2);

        int tamano = guardador.getCantidadDeElementos();
        System.out.println(tamano);

        Cuenta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
	}

}

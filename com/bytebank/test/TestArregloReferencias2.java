package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias2 {

	public static void main(String[] args) {
		
		// alterando el tipo
		
        Cuenta[] cuentas = new Cuenta[5];
        CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        cuentas[0] = cc1;

        // crea instancia de CuentaAhorro
        CuentaAhorros ca2 = new CuentaAhorros(22, 22);
        cuentas[1] = ca2;    

        System.out.println(cuentas[1].getNumero());

        // no compila
        // CuentaCorriente ref = cuentas[0];
        
        
        // Compila
        CuentaCorriente ref = (CuentaCorriente) cuentas[0];
        System.out.println(cc1.getNumero());
        System.out.println(ref.getNumero());
        
        CuentaAhorros ref1 = (CuentaAhorros) cuentas[1];
        System.out.println(ca2.getNumero());
        System.out.println(ref1.getNumero());

	}

}

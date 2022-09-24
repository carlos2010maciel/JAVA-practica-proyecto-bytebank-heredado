package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(22, 33);
		CuentaAhorros ca = new CuentaAhorros(33, 22);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		System.out.println(cc);
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println(ca);
		System.out.println("Saldo: " + ca.getSaldo());
	}

}

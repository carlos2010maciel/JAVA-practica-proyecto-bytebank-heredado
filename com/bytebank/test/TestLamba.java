package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestLamba {
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Cuenta ca2 = new CuentaAhorros(33, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Guilermo");
		ca2.setTitular(clienteCC2);
		ca2.deposita(444.0);

		Cuenta cc3 = new CuentaCorriente(44, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Cuenta ca4 = new CuentaAhorros(11, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Ana");
		ca4.setTitular(clienteCC4);
		ca4.deposita(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(ca2);
		lista.add(cc3);
		lista.add(ca4);
		
		System.out.println("Antes de ordenar");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		//Implementación del método compare usando LAMBA
		//Interfaz funcional
		// -> Lamba
		lista.sort((Cuenta c1, Cuenta c2) ->
				Integer.compare(c1.getNumero(), c2.getNumero())
		);
		
		System.out.println("Después de ordenar");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		//Implementación del método compareTo usando LAMBA
		Collections.sort(lista, (c1, c2) ->
				c1.getTitular().getNombre()
					.compareTo(c2.getTitular().getNombre())
		);
		
		System.out.println("Después de ordenar por nombre del titular");
//		for (Cuenta cuenta: lista) {
//			System.out.println(cuenta);
//		}
		//Consumer --- Interfaz funcional
		//Envío un solo parámetro
		lista.forEach(cuenta -> System.out.println(cuenta));

		Collections.sort(lista);

		System.out.println("Después de ordenar por orden natural");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		Collections.reverse(lista);
		
		System.out.println("Después de invertir el orden");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		Collections.shuffle(lista);
		
		System.out.println("Después de mezclar la lista");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		Collections.rotate(lista, 2);
		
		System.out.println("Después de rotar 2 posiciones");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}	
	}
}

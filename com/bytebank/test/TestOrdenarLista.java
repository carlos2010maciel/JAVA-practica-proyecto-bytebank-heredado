package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {
	
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
		
		//Ordenar las cuentas
		//Formanormal desde Java 8
		//				Cualquier clase hija de Cuenta
		//Comparator c? extend Cuenta> c 
		//Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta(); //Implementación de la interfaz
		//lista.sort(comparator);
		//Llamada al método compare
		//CLSE ANÓNIMA
		lista.sort(new Comparator<Cuenta>(){ 
			@Override
			public int compare(Cuenta c1, Cuenta c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		});
		
		
		//Algoritmo de ordenación por número de cuenta
		System.out.println("Después de ordenar");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		//Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
		//lista.sort(new OrdenadorPorNombreTitular()); //Interfaz funcional
		
		//Forma antigua
//		Collections.sort(lista, new OrdenadorPorNombreTitular());
				
		//CLASE ANÓNIMA porque no vemos ninguna clase
		//JAVA crea una clase en el momento que compila, imlementa y la llama
		Collections.sort(lista, new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta c1, Cuenta c2) {
				return c1.getTitular().getNombre()
					.compareTo(c2.getTitular().getNombre());
			}
		}); 
		
		
		//Algoritmo de ordenación por nombre de titular
		System.out.println("Después de ordenar por nombre del titular");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		//Método sobrecargado
		/*
		 * También podemos forzar el orden natural
		 * pasando null como parámetro en nuestra list.sort(null).
		 */
		Collections.sort(lista); //Orden natural

		System.out.println("Después de ordenar por orden natural");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		Collections.reverse(lista); //invertir
		
		System.out.println("Después de invertir el orden");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		Collections.shuffle(lista); //mezclar
		
		System.out.println("Después de mezclar la lista");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		Collections.rotate(lista, 2); //rotar 2 posiciones
		
		System.out.println("Después de rotar 2 posiciones");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		
	}
}


//Estas clases no son un objeto
//class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {
	
//	Método para ordenar
//	@Override
//	public int compare(Cuenta c1, Cuenta c2) {
		//Forma básica
//		if (c1.getNumero() == c2.getNumero()) {
//			return 0;
//		} else if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		} else {
//			return -1;
//		}
		
		//Forma Intermedia
//		return c1.getNumero() - c2.getNumero();
		
		//Forma Wrapper
//		return Integer.compare(c1.getNumero(), c2.getNumero());
//	}
//}


//class OrdenadorPorNombreTitular implements Comparator<Cuenta> {
//	@Override
////	public int compare(Cuenta c1, Cuenta c2) {
////    String nombreC1 = c1.getTitular().getNombre();
////    String nombreC2 = c2.getTitular().getNombre();
////    return nombreC1.compareTo(nombreC2);
//	public int compare(Cuenta c1, Cuenta c2) {
//		return c1.getTitular().getNombre()
//				.compareTo(c2.getTitular().getNombre());
//	}
//}
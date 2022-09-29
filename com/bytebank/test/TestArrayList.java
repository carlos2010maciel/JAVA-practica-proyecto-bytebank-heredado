package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		//<> Forzando a que acepte un solo tipo de cuenta
		//<> operador diamante
		//<Cuenta> se denomina generic
		//List<Cliente> listaClientes = new LinkedList<>();
		
		//Usando cualquiera de ellos el código funciona
		//TODAS las implementaciones son listas
		//List<Cuenta> lista = new ArrayList<Cuenta>(); //usa array por debajo
        //List<Cuenta> lista = new LinkedList<Cuenta>(); //lista linkeada
        //List<Cuenta> lista = new Vector<Cuenta>(); //usa array por debajo, pero también es threadsafe
		
		
		//Interfaz				LinkedList
		//List<Cuenta> lista = new LinkedList<>();
		
		//Especifico el tipo de dato Cuenta
		//En el primer <> es obligatorio
		//En el segundo <> NO es obligatorio
		//No puedo extender directamente de Collection
		List<Cuenta> lista = new ArrayList<>();
		
		//Uso de Vector 	----->>> Ya casi que no se usa
		//El Vector es Thread Safe
		//List<Cuenta> lista = new Vector<Cuenta>();
		
		//Referencia		//Objeto --->HEAP
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		//Método para agregar
		lista.add(cc);
		lista.add(cc2);
		
		//No puedo adicionar un cliente a una lista de objetos del tipo Cuenta
		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		
		//En ArrayLis todos los elementos se guardan en orden
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		//for
		//recorro todo el ArrayList
		//El método .size e retorna la cantidad de parámetos del ArrayList
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(1));
		}
		
		// for each --> hace lo mismo que el for anterior
		//Por cada cuenta en la lista: imprime la lista
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		//Pregunto si el ArrayList contiene la referencia al objeto
		boolean contiene = lista.contains(cc3);
		//Comparo por referencias
		if (contiene) {
			System.out.println("Sí, es igual con equals");
		}
		
		/*
		 * Este método no utilizo porque lo mismo hace equals
		//Comparo por valores
		if (cc.esIgual(cc3)) {
			System.out.println("Sí, son iguales");
		}
		*/
	}

}

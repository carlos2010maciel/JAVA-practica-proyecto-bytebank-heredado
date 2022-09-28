package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		//<> Forzando a que acepte un solo tipo de cuenta
		//<> operador diamante
		//<Cuenta> se denomina generic
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		
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
		//El método .size e retorna la cantidad de paámetos del ArrayList
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(1));
		}
		
		// for each --> hace lo mismo que el for anterior
		//Por cada cuenta en la lista: imprime la lista
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}

}

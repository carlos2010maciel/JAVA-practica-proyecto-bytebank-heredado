package com.bytebank.test;

import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

public class TestReferencias {
	
	public static void main(String[] args) {
		//Elemento mas genérico puede ser adaptado
		//al elemento mas específico
		//Genérico: Funcionario
		//Específico: Gerente
		//Todos los gerentes son funcionarios
		//Todos los funcionarios no son gerentes
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("_adadddd");
	}

}

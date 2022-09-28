package com.bytebank.modelo;

	//Crear un objeto para guardar muchas cuentas
	//Debe permitir agregar cuentas con un método
	//guardaCuentas.adiciona(cuenta)
	//obtener, remover, etc

public class GuardaReferencias {
	Object[] referencia = new Object[10];
	int indice = 0;

	//Método adicionar
	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice++;
	}
	
	//Método obtener
	public Object obtener(int indice) {
		return referencia[indice];
	}

}

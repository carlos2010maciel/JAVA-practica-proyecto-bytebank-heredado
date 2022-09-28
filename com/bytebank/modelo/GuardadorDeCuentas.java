package com.bytebank.modelo;

public class GuardadorDeCuentas {
	
	//Crear un objeto para guardar muchas cuentas
	//Debe permitir agregar cuentas con un método
	//guardaCuentas.adiciona(cuenta)
	//obtener, remover, etc
	
	/*
	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;

	//Método adicionar
	public void adicionar(Cuenta cc) {
		cuenta[indice] = cc;
		indice++;
	}
	
	//Método obtener
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
	*/
	
	private Cuenta[] referencias;
    private int posicionLibre;

    public GuardadorDeCuentas() {
        this.referencias = new Cuenta[10];
        this.posicionLibre = 0;
    }

    public void adicionar(Cuenta ref) {
        referencias[this.posicionLibre] = ref;
        this.posicionLibre++;
    }

    public int getCantidadDeElementos() {
        return this.posicionLibre;
    }

    public Cuenta getReferencia(int pos) {
        return this.referencias[pos];
    }

}

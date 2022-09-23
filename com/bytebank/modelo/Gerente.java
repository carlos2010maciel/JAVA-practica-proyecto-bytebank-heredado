package com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable{
	
	//Sobreescritura de método porque usa la misma firma del método.
	//Exactamente la misma firma ddel método.
	//Super permite acceder a los métodos de la clase padre
	
	private AutenticacionUtil util;
	
	public Gerente() {
		this.util = new AutenticacionUtil();
	}
		
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		
		// ELIMINO ESTA LINEA SOLO A LOS FINES DE EVITAR ERROR DE COMPILACION
		//return super.getSalario() + this.getSalario() * 0.05;
		
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
}

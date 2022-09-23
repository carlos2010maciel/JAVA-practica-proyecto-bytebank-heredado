package com.bytebank.modelo;

public interface Autenticable {
	
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);
	//Una interfaz no puede extender de una clase
	//Puede extender de otra interfaz, SÍ
	
	//En las interfaces todos los métodos son abstractos
	//Son abstractos porque no están implementados
	//Puede tener métodos implementados
	//Al declarar el método no uso la palabra reservada "abstract" porque
	//por defecto todos los métodos son abstractos
	
	//Las interfaces NO pueden tener variables
	//Las interfaces NO pueden tener atributos privados
	//La interfaz NO puede tener constructor porque no es un objeto en sí, es un TIPO
	
	//La interfaz NO puede tener métodos implementados, solo tiene la firma de método
	//la implementación ya es problema de cada objeto que implemente esa interfaz
	
	//La interfaz es como un sello, un rótulo
	//La interfaz no representa un nivel jerárquico
	//No representa una relación de PADRE e HIJO
}

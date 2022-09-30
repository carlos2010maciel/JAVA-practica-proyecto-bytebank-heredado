package com.bytebank.modelo;

/*
 * Comentario en bloque
 */

// Comentario de una sola línea

//Lo de abajo es javadoc
/**
 * Cuenta va a crear nuevas instancias de CuentaCorriente
 * @version 1.0
 * @author Horacio
 *
 */
public abstract class Cuenta implements Comparable<Cuenta> {
	
	//MODIFICADORES DE ACCESO -> Delimita el alcance
	// public -> accesible en todos lados
	// protected -> default + clases hijas
	// default -> accesible dentro del paquete
	// private -> accesible solo desde la misma clase
	
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente(); //Composición de objeto. Es como un objeto dentro de otro.

    private static int total;
    
    /**
     * Instancia una nueva cuenta sin parametros
     */
    //Constructor por defecto
    public Cuenta() {
    	
    }

    /**
     * Instancia una cuenta usando agencia y numero
     * @param agencia
     * @param numero
     */
    public Cuenta(int agencia, int numero) {
    	
    	/*
    	Verifico los valores en el constructor de la clase
    	Si es incorrecto lanzo la excepción
    	IllegalArgumentException
    	*/
        if (agencia < 1) {
        	throw new IllegalArgumentException("Agencia Inválida");
        }
        
        if(numero < 1) {
            throw new IllegalArgumentException("Número de cuenta inválido");
        }
        
    	this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }

	public abstract void deposita(double valor);

    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error devuelve una excepcion
     * @param valor
     * @throws SaldoInsuficienteException
     */
	public void saca(double valor) throws SaldoInsuficienteException {
    	if (this.saldo < valor) {
    		throw new SaldoInsuficienteException("No tienes saldo");
    	}
            this.saldo -= valor;
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            try {
				this.saca(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
    
    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + 
        			", Titular: " + this.titular.getNombre();
    }
    
    /*
     * No utilizo este método porque en su lugr uso equals
    public boolean esIgual(Cuenta cuenta) {
    	return this.agencia == cuenta.getAgencia() &&
    			this.numero == cuenta.getNumero();
    }
    */
    
    
    //equals hace lo mismo que el método esIgual
    /*
    @Override
    public boolean equals(Object obj) {
    	//Comparación basada en valores y no en referencias
    					//Cast
    	Cuenta cuenta = (Cuenta) obj;
    	return this.agencia == cuenta.getAgencia() &&
    			this.numero == cuenta.getNumero();
    }
    */
    
    // verifica si una cuenta es igual a otra
    @Override
    public boolean equals(Object ref){
    	
    	Cuenta otra = (Cuenta) ref;

        if(this.agencia != otra.agencia){
            return false;
        }

        if(this.numero != otra.numero){
            return false;
        }

        return true;
    }
    
    //compareTo() ----> Método de la interfaz Comparable
	@Override
	public int compareTo(Cuenta c) {
		// Orden natural: Número de Agencia
		return Integer.compare(this.agencia, c.getAgencia());
		//Orden natural: Saldo
		//return Double.compare(this.getSaldo(), c.getSaldo());
	}

}

package com.bytebank.modelo;

public abstract class Cuenta {
	
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
    
    //Constructor por defecto
    public Cuenta() {
    	
    }

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
				// TODO Auto-generated catch block
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

}

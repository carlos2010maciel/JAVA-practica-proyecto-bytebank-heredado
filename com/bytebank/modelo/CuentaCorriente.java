package com.bytebank.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion{

	public CuentaCorriente(int agencia, int numero) {
		//SUPER accede a los métodos de la clase padre
		//Llama al constructor de la clase padre
		super(agencia, numero); 
	}
	
	//No se debe borrar la palabra @Override
	//método sobreescrito de la clase padre
	@Override 
	public void saca(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		//this.saldo = this.saldo + valor;
	}
	
	@Override
    public double getValorImpuesto() {
        return super.saldo * 0.01;
    }
	
	@Override
	public String toString() {
	    return "CuentaCorriente: " + super.toString();
	}

}

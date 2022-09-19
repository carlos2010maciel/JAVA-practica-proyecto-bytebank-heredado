
public class CuentaCorriente extends Cuenta implements Tributacion{

	public CuentaCorriente(int agencia, int numero) {
		//SUPER accede a los métodos de la clase padre
		//Llama al constructor de la clase padre
		super(agencia, numero); 
	}
	
	//No se debe borrar la palabra @Override
	//método sobreescrito de la clase padre
	@Override 
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		//this.saldo = this.saldo + valor;
	}
	
	@Override
    public double getValorImpuesto() {
        return super.saldo * 0.01;
    }

}


public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		//SUPER accede a los métodos de la clase padre
		//Llama al constructor de la clase padre
		super(agencia, numero); 
	}
	
	@Override //No se debe borrar la palabra @Override
	//método sobreescrito de la clase padre
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}

}

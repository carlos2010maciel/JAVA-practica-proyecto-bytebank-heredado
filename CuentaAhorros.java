
public class CuentaAhorros extends Cuenta {
	//Toda clase que extiende de una clase abstraca
	//debe implemntar los métodos abstractos de esa clase abstracta
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor; //Accede a la clase protected saldo de la Clase Cuenta
	}

}

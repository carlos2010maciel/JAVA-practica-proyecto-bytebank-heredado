
public class ControlBonificacion {
	private double suma;
	
	//Aplicando POLIMORFISMO
	//Funcionario es genérico
	//Gerente y Contador heredan de Funcioanrio
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Cálculo actual: " + this.suma);
		return this.suma;
	}
	
	//Sobrecarga del método
	//public double registrarSalario(Gerente gerente) {
	//	this.suma = gerente.getBonificacion() + this.suma;
	//System.out.println("Cálculo actual: " + this.suma);
	//return this.suma;
	//}
	
	//public double registrarSalario(Contador contador) {
	//this.suma = contador.getBonificacion() + this.suma;
	//System.out.println("Cálculo actual: " + this.suma);
	//return this.suma;
	//}

}

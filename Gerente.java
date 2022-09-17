
public class Gerente extends Funcionario{
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnLine";
	}
	
	//Sobreescritura de método porque usa la misma firma del método.
	//Exactamente la misma firma ddel método.
	//Super permite acceder a los métodos de la clase padre
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		return super.getSalario() + this.getSalario() * 0.05;
	}
}

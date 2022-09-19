
public abstract class Funcionario { //abstract indica que Funcionario es una clase abstracta
	
	//La clase abstracta puede tener atributos privados
	//La clase puede tener variables
	//La clase abstracta puede tener constructor
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	
	//Constructor
	public Funcionario() {
		
	}
	
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacion();

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}

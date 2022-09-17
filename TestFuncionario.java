
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Contador(); //Contador es una representación física del objeto. Funcionario no puede ser instanciado pero Contador Sí.
		diego.setNombre("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);
		diego.setTipo(0); //Indica que es tipo Funcionario
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion()); //imprime la bonificación que es el 10% del salario
		
	}
}

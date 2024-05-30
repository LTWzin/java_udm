package entidade;

public class Funcionario {
	
	public String nome;
	public Double salarioBruto;
	public Double imposto;

	public double SalarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void salarioAlmentado(double porcentagem) {
		salarioBruto *= (porcentagem / 100) + 1;
	}

}

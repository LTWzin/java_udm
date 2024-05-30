package aplicacao;
import java.util.Scanner;
import java.util.Locale;
import entidade.Funcionario;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario pessoa = new Funcionario();
		
		System.out.println("Dados do funcionario:");
		System.out.print("Digite o nome do funcionario: ");
		pessoa.nome = sc.nextLine();
		System.out.print("Digite o salário bruto: ");
		pessoa.salarioBruto = sc.nextDouble();
		System.out.print("Digite o imposto a ser cobrado: ");
		pessoa.imposto = sc.nextDouble();
		
		System.out.printf("Funcionário: %s\n", pessoa.nome);
		System.out.printf("Salário: R$ %.2f\n", pessoa.SalarioLiquido());
		
		System.out.println("Qual a porcentagem de almento do salário? ");
		double almento = sc.nextDouble();
		pessoa.salarioAlmentado(almento);
		
		System.out.printf("Salário pós almento: R$ %.2f", pessoa.SalarioLiquido());
		sc.close();
	}

}

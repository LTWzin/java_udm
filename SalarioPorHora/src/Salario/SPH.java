package Salario;

import java.util.Scanner;
import java.util.Locale;

public class SPH {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horas, salarioPorHora, salarioTotal;
		
		System.out.print("Digite o numero do funcionario: ");
		int num = sc.nextInt();
		System.out.print("Digite a quantia de horas trabalhadas pelo funcionario: ");
		horas = sc.nextDouble(); 
		System.out.print("Digite o valor recebido por hora trabalhada: ");
		salarioPorHora = sc.nextDouble();
		
		
		salarioTotal = (horas * salarioPorHora);
		
		System.out.printf("Numero do funcionario: %d%n", num);
		System.out.printf("Salario total do funcionario: R$%.2f%n", salarioTotal);
		sc.close();
	}

}


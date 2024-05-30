package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import entidade.Aluno;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno pessoa = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		pessoa.name = sc.nextLine();
		System.out.printf("Digite a primeira nota de %s: ", pessoa.name);
		pessoa.nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		pessoa.nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		pessoa.nota3 = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("ALUNO: %s\n", pessoa.name);
		System.out.printf("NOTA FINAL: %.2f\n", pessoa.notaFinal());
		if (pessoa.notaFinal() < 60) {
			System.out.println("REPROVADO!");
			System.out.printf("PONTOS NECESSÁRIOS PARA APROVADO: %.2f", pessoa.pontosFaltando());
		}
		else {
			System.out.println("APROVADO!");
		}
	}
}

package diferenca;

import java.util.Scanner;

public class ABCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int pri = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int seg = sc.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int ter = sc.nextInt();
		System.out.print("Digite o quarto numero: ");
		int qua = sc.nextInt();
		int diferenca = (pri * seg) - (ter * qua);
		
		System.out.printf("A diferença entre o produto de %d x %d e %d x %d é de %d", pri, seg, ter, qua, diferenca);
	
		sc.close();
		
	}

}

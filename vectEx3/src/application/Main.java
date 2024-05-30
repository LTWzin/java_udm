package application;

import java.util.Locale;
import java.util.Scanner;
import entities.People;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Encontra o mais alto dentre um vetor de "pessoas". Encontra pessoas com idade menor que 16.
		System.out.print("How many people will be entered?  ");
		int quantia = sc.nextInt();
		
		People[] vect = new People[quantia];  //Vetor de uma classe.
		
		for (int i=0;i<vect.length;i++) {
			System.out.printf("Type the %do people name:  ", i+1);
			String name = sc.next();
			System.out.printf("Type the %s's age:  ", name);
			int age = sc.nextInt();
			System.out.printf("Type the %s's height:  ", name);
			double height = sc.nextDouble();
			vect[i] = new People(name, age, height);
		}
		double percentage  = 0;
		double averageH = 0;
		for (int i=0;i<vect.length;i++) {
			averageH += vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				percentage++;
			}
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.printf("Average height: %.2f", (averageH / quantia));
		System.out.printf("\nPeople under 16: (%.1f", People.rot(percentage, quantia));
		System.out.print("%)\n");
		
		for (int i=0;i<vect.length;i++) {
			if (vect[i].getIdade()<16) {
			System.out.print(vect[i].getNome() + " ");
			}
		}
		sc.close();
	}

}

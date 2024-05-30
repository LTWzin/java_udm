package password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 1471;
		int tentativa;
		
		System.out.print("Type the password to enter:  ");
		tentativa = sc.nextInt();
		if (tentativa != senha) {
			System.out.println("Incorrect password!");
		}
		
		while (tentativa != 0) {
			System.out.print("Type the password again:  ");
			tentativa = sc.nextInt();
			if (tentativa != senha) {
				System.out.println("Incorrect password!");
			}
			else {
				break;
			}
		}
		System.out.println("Correct password! Preparing access.");
		
		sc.close();
	}
	
}

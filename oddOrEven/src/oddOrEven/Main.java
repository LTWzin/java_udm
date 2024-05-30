package oddOrEven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num; 
		
		System.out.print("Enter a number:  ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			
			System.out.println("The number entered it's EVEN!");
		}
		else {
			
			System.out.println("The number entered it's ODD!");
		}
		
		sc.close();

	}

}

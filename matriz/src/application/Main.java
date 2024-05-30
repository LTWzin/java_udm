package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter how many lines the matrix will have: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int x=0;x<matriz.length;x++) {
			System.out.printf("Enter the %o line elements:\n", x+1);
			for (int y=0;y<matriz[x].length;y++) {
				matriz[x][y] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Main diagonal: ");
		for (int x=0; x<matriz.length;x++) {
			System.out.print(matriz[x][x] + " ");
		}
		
		System.out.println();
		int negatives = 0;
		for (int x=0;x<matriz.length;x++) {
			for (int y=0;y<matriz[x].length;y++) {
				if (matriz[x][y] < 0) {
					negatives++;
				}
			}
		}
		System.out.printf("Negative numbers = %d", negatives);
		sc.close();
	}
}

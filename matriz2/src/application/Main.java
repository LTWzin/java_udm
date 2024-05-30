package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount of lines: ");
		int line = sc.nextInt();
		System.out.print("Amount of columns: ");
		int column = sc.nextInt();
		
		int[][] mat = new int[line][column];
		
		for (int x=0;x<mat.length;x++) {
			System.out.printf("Elements in line %d: ", x+1);
			for (int y=0;y<mat[x].length;y++) {
				mat[x][y] = sc.nextInt();
			}
		}
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		for (int x=0;x<mat.length;x++) {
			for (int y=0;y<mat[x].length;y++) {

				if (mat[x][y] == number) {
					System.out.print("\n=-=-=-=-=-=-=-=-=");
					System.out.print("\nPosition: ");
					System.out.print(x + ", " + y + ":");
					if (y != 0) {
						System.out.print("\nLeft: " + mat[x][y-1]);
					}
					if (y != mat[x].length - 1) {
						System.out.print("\nRight: " + mat[x][y+1]);
					}
					if (x != 0) {
						System.out.print("\nUp: " + mat[x-1][y]);
					}
					if (x != mat.length - 1) {
						System.out.print("\nDown: " + mat[x+1][y]);
					}
				}
				
			}
		}
		sc.close();
	}

}

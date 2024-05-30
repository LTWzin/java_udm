package application;

import java.util.Scanner;
import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Type the triangle 'x' measure:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Type the triangle 'y' measure:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();

		System.out.printf("TRIANGLE X: %.4f %n", areaX);
		System.out.printf("TRIANGLE Y: %.4f %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}

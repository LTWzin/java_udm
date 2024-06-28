package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FisicalPerson;
import entities.LegalPerson;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Taxpayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.printf("Tax payer #%d data:\n", i+1);
			System.out.print("Individual or company (i/c)?  ");
			String taxType = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (taxType.charAt(0) == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new FisicalPerson(name, anualIncome, healthExpenditures));
			}
			else {
			System.out.print("Number of employees: ");
			int employeeNumber = sc.nextInt();
			list.add(new LegalPerson(name, anualIncome, employeeNumber));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		double totalTax = 0;
		for (Taxpayer x : list) {
			totalTax += x.tax();
			System.out.printf("%s: $ %.2f\n", x.getName(), x.tax());
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f", totalTax);
		
	sc.close();
	}
}

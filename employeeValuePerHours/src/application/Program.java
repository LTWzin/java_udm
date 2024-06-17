package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of emplyees: ");
		int employeeQuantity = sc.nextInt();
		
		for (int i=0;i<employeeQuantity;i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n)?  ");
			String Outsourced = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hours: ");
			double valuePerHours = sc.nextDouble();
			
			if (Outsourced.charAt(0) == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				OutsourcedEmployee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
				list.add(outsourcedEmployee);
			}
			else {
				Employee employee = new Employee(name, hours, valuePerHours);
				list.add(employee);
			}
			
		}
		
		
		System.out.println("\nPAYMENTS:")	;
		for (Employee x : list) {
			System.out.println(x);
		}
		
	sc.close();	
	}
}

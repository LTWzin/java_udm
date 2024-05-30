package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Data;

public class Main {

	public static void main(String[] args) {
		
		List<Data> list = new ArrayList<>();  //Lista vazia
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Main parte 1: registro dos empregados;
		
		System.out.print("Type how many employees will be registered:  ");
		int quantity = sc.nextInt();
		for (int i=0;i<quantity;i++) {  //Quantia de trabalhadores
			System.out.println();
			System.out.printf("Employee #%d\n", i+1);
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			while (hasId (list, id) != null) {   //Não permitido a repetição de ID's
				System.out.print("Id already taken. Try again:  ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			list.add(new Data(id, name, salary));   //Instanciando lista de oo
		}
		//Main parte 2: Almento do salário de um dos empregados;
		
			System.out.println();
			System.out.print("Enter the employee ID that will have salary increased: ");
			int idIncrease = sc.nextInt();
			Integer position = hasId(list, idIncrease);
			
			if (position == null) {
				System.out.println("This ID doesn't exist!");
			}
			else {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextInt();
				list.get(position).increaseSalary(percentage);
			}
			
			//Main parte 3: Lista atualizada com dados dos empregados;
			
			System.out.println();
			System.out.println("Employee's list: ");
			for (Data employee : list) {
				System.out.println(employee);
			}
			sc.close();
	}
	
	//Metodo hasId retorna a posição do id procurado, caso não tenha na lista retorna null;
	
	public static Integer hasId(List<Data> list, int id) {
		for (int i=0;i<list.size();i++) {
			if (list.get(i).getId() == id ) {
				return i;
			}
		}
		return null;
	}	
}

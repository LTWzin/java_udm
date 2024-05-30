package application;

import java.util.ArrayList;		//Classe que implementa a interface
import java.util.List;			//Import da lista
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();		//Expreção para instanciar a lista
		
		list.add("João");		//adicionar elemento a lista
		list.add("Maria");
		list.add("Ricardo");
		list.add("Neymar");
		
		System.out.println(list);		//Imprimir lista '[]'
		for (String x : list) {			//Imprimir valores da lista	
			System.out.println(x);
		}
		
		System.out.print("Tamanho da lista: ");
		System.out.println(list.size());		//Tamanho da lista
		System.out.println("=-=-=-=-=-=-=-=-=");
		
		list.remove("Maria");		//Remover elemento da lista (posição ou elemento)
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("=-=-=-=-=-=-=-=-=");
		list.removeIf(x -> x.charAt(0) == 'J');		//Remover elemento com base em um predicado
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("=-=-=-=-=-=-=-=-=");
		
		System.out.println("Index of Ricardo: " + list.indexOf("Ricardo"));  		//Encontrar posição de um elemento
		System.out.println("Index of Neymar: " + list.indexOf("Neymar"));			//Retorna (-1) se não encontrar o elemento
		
		list.add("Luan");
		list.add("Jonatan");
		list.add(0, "Irelia");			//Adionar elemento na posição escolhida
		
		System.out.println("=-=-=-=-=-=-=-=-=");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'I').collect(Collectors.toList()); 		//Filtrar elementos da lista com base em um predicado	
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("=-=-=-=-=-=-=-=-=");
		String name = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);		//Encontrar o primeiro elemento de uma lista com base em um predicado
		System.out.println(name);		//Retorna 'null' se não encontrado
	}
}

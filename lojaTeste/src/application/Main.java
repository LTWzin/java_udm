package application;

import entities.quantity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lolja> list = new ArrayList<>();

        int infinit = 0;
        System.out.println("Digite 0 para parar");

        while (infinit == 0) {
            System.out.println("Digite o codigo do produto: ");
            Integer codigo = sc.nextInt();
            if (codigo == 0) {
                break;
            }
            else {
                System.out.println("Digite o preco do produto: ");
                Double price = sc.nextDouble();
                System.out.println("Digite quantos destes produtos serão comprados: ");
                Integer quantity = sc.nextInt();
                list.add(codigo, price, quantity);  
            }
            
        }

        for (Lolja x : list) {
            System.out.println(x.toString())
            System.out.println("Horario da venda: ");
        }
        sc.close();
    }
}

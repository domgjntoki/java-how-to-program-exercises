package C07Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExercicio7_3 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Insira um número, se não tiver digitado"
                    + " eu irei mostrar:  ");
            int numero = input.nextInt();
            
            if(! (numeros.contains(numero)))
                System.out.printf("Seu número: %d%n", numero);
            numeros.add(numero);
            
        }
        System.out.println("\nSeus números: ");
        for(int valor : numeros)
            System.out.println(valor);
    }
}

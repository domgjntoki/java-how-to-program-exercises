package C16Colecoes.exercicios;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Fredson Sumi
 */
public class LinkedListOrdemNumeros {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();
        for(int i = 0; i < 25; i++){
            int numero = new SecureRandom().nextInt(100) + 1;
            numeros.add(numero);
        }
        System.out.printf("Lista: %s%n", numeros);
        int total = 0;
        for(int numero: numeros)
            total += numero;
        System.out.printf("Total: %d%nMédia: %,.2f%n", 
                total, (double) total / numeros.size());
    }
   
}

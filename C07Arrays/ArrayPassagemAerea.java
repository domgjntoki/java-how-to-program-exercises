package C07Arrays;

import java.util.Scanner;
import java.security.SecureRandom;

public class ArrayPassagemAerea {
    public static void main(String[] args) {
        boolean[] assentos = new boolean[10];
        Scanner input = new Scanner(System.in);
        SecureRandom assentoAleatorio = new SecureRandom();
        System.out.print("Por favor digite 1 para Primeira Classe e "
                + "digite 2 para Classe Econômica: ");
        int classe = input.nextInt();
        
        switch (classe) {
            case 1:
                int assento = assentoAleatorio.nextInt(5);
                assentos[assento] = true;
                System.out.printf("Classe primeira classe, assento: %d%n", 
                        assento);
                break;
                
            case 2:
                assento = 5 + assentoAleatorio.nextInt(5);
                System.out.printf("Classe econômica, assento: %d%n",
                        assento);
                assentos[assento] = true;
                break;
                
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        
    }
}

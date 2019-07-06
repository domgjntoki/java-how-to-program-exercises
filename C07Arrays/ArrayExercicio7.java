package C07Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExercicio7 {
    public static void main(String[] args) {
        /*
        Escreva instruções Java para realizar cada uma das seguintes tarefas:
        a) Exiba o valor do elemento 6 do array f.
        b) Inicialize cada um dos cinco elementos de array de inteiros unidimensional g como 8.
        c) Some os 100 elementos do array de ponto flutuante c.
        d) Copie o array a de 11 elementos para a primeira parte de array b, que contém 34 elementos.
        e) Determine e exiba os maiores e menores valores contidos no array de ponto flutuante w de 99 elementos.
        */
        
        //a) Exiba o valor do elemento 6 do array f.
        int[] f = new int[7];
        System.out.printf("5º valor de f: %d%n", f[5]);
        
        int[] g = new int [5];
        
        // b) Inicialize cada um dos cinco elementos de array de inteiros 
        // unidimensional g como 8.
        Arrays.fill(g, 8);
        System.out.printf("g preenchida com 8: ");
        for( int value : g)
            System.out.printf("%d ", value);
        System.out.println("");
        // c) Some os 100 elementos do array de ponto flutuante c.
        double[] c = new double [100];
        Arrays.fill(c, 0.5);
        
        double soma = 0;
        for (int i = 0; i < c.length; i++)
            soma += c[i];
        System.out.printf("A soma dos 100 elementos de c é %.0f%n", soma);
        
        // d) Copie o array a de 11 elementos para a primeira parte de array b, 
        // que contém 34 elementos.
        int[] a = {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10, 11};
        int[] b = new int [34];
        
        System.out.println("Valores de b antes da cópia:");
        for(int value : b)
            System.out.printf("%d ", value);
        
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println("\nValores de b depois da cópia:");
        for(int value : b)
            System.out.printf("%d ", value);
        System.out.println("");
        
        // e) Determine e exiba os maiores e menores valores contidos no array 
        // de ponto flutuante w de 99 elementos.
        double[] w = new double[99];
        
        w[5] = 34.01;
        w[34] = 57.78;
        w[88] = 11.05;
        w[14] = 10.59;
        w[98] = 57.34;
        
        Arrays.sort(w);
        System.out.printf("Menor número de w: %.2f%n", w[0]);
        System.out.printf("Maior número de w: %.2f%n", w[w.length - 1]);
        
    }
}

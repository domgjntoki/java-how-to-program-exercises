package C07Arrays;

import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        
        // classifica doubleArray em ordem crescente
        double[] array = {1, 2 ,3, 0.1, 0.4, 1.8, 91, 91.7};
        Arrays.sort(array);
        
        for( double value : array)
            System.out.printf("%.1f -> ", value);
        System.out.println("");
        
        // preenche o array de 10 elementos com 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");
        
        // copia array intArray em array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");
        
        // verifica a igualdade de intArray e intArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        
        System.out.printf("%n%nintArray %s intArrayCopy%n", b ? "==" : "!=");
        
        // verifica a igualdade de intArray e filledIntArray
        b = Arrays.equals(filledIntArray, intArray);
        System.out.printf("intArray %s filledIntArray%n", b ? "==" : "!=");
        
        // pesquisa o valor 5 em intArray
        int location = Arrays.binarySearch(intArray, 5);
        
        if (location >= 0)
            System.out.printf("5 encontrado no elemento %d de intArray%n", 
                    location);
        else
            System.out.printf("5 não encontrado em intArray%n");
        
        // pesquisa o valor 8763 em intArray
        location = Arrays.binarySearch(intArray, 8763);
        
        if (location >= 0)
            System.out.printf("8763 achado no elemento %d de intArray%n", 
                    location);
        else
            System.out.printf("8763 não encontrado em intArray%n");
    }
    
    public static void displayArray(int[] array, String arrayName){
        System.out.printf("%n%s: ", arrayName);
        
        for (int value: array)
            System.out.printf("%d ", value);
    }

}

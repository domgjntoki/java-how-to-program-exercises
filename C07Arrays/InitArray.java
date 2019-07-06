package C07Arrays;

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGHT = 10;
        int[] array = new int [ARRAY_LENGHT];
        
        for (int pares = 0; pares < array.length; pares++)
            array[pares] = 2 + 2 * pares;
        
        
        System.out.printf("%s%8s%n","Index", "Valor");
        for (int index = 0; index < array.length; index++) {
            System.out.printf("%5d%8d%n", index, array[index]);
        }
    }
}

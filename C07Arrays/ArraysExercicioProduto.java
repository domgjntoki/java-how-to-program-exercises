package C07Arrays;

public class ArraysExercicioProduto {
    public static void main(String[] args) {
        produto(2);
        produto(2, 3);
        produto(5, 5, 5, 5);
        produto(5, 4, 3, 2, 1);
    }
    
    public static void produto (int... numeros){
        int produto = 1;
        for(int numero : numeros)
            produto *= numero;
        System.out.println("O produto é " + produto);
    }
}

package C07Arrays;

public class ArrayLinhaComando {
    public static void main(String[] args) {
        int[] array;
        int tamanho;
        if (args.length == 0){
            array = new int[10];
        }
        
        else{
            tamanho = Integer.parseInt(args[0]);
            array = new int[tamanho];
        }
        
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int i = 0; i < array.length; i++)
            System.out.printf("%5d%8d%n", i, array[i]);
    }
}

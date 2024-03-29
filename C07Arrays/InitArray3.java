package C07Arrays;
public class InitArray3 {
    public static void main(String[] args) {
        // verifica número de argumentos de linha de comando
        if (args.length != 3)
            System.out.printf(
                "Error: Please re-enter the entire command, including%n" +
                "an array size, initial value and increment.%n");
        
        
        else{
            // obtém o tamanho do array a partir do primeiro argumento de 
            // linha de comando
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];
            
            // obtém o valor inicial e o incrementa a partir dos argumentos de 
            // linha de comando
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            
            // calcula valor de cada elemento do array
            for(int i = 0; i < array.length; i++)
                array[i] = initialValue + increment * i;
            
            // exibe o valor e o índice de array
            for (int i = 0; i < array.length; i++)
                System.out.printf("%5d%8d%n", i, array[i]); 
        }
    }
}

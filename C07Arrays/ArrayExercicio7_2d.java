package C07Arrays;

public class ArrayExercicio7_2d {
    public static void main(String[] args) {
        //Considere um array de inteiros dois por três t.
        // a) Escreva uma instrução que declara e cria t.
        int[][] t = new int[2][3];
        /*
        0 0 0
        0 0 0
        */
        // b) Quantas linhas tem t? R: 2
        // c) Quantas colunas tem t? R: 3
        // d) Quantos elementos tem t? R: 6
        // e) Escreva expressões de acesso para todos os elementos na linha 1 de t.
        for(int value : t[0])
            System.out.printf("%d ", value);
        System.out.println("\n");
        // f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
        for (int[] t1 : t)
            System.out.printf("%d ", t1[1]);
        System.out.println("");
        // g) Escreva uma única instrução que configura o elemento de t na linha 
        // 0 e na coluna 1 como zero.
        t[0][1] = 0;
        
        // h) Escreva instruções individuais para inicializar cada elemento de t para zero.
        
        //  i) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.
        
        //  j) Escreva uma instrução for aninhada que insere os valores para os 
        // elementos de t a partir do usuário.
        //   k) Escreva uma série de instruções que determina e exibe o valor menor em t.
        //  l) Escreva uma única instrução printf que exibe os elementos da primeira linha de t.
        //  m) Escreva uma instrução que soma os elementos da terceira coluna de t. 
        // Não utilize repetição.
        //  n) Escreva uma série de instruções que exibe o conteúdo de t no 
        // formato tabular. Liste os índices de coluna como títulos na parte superior
        //  e liste os índices de linha à esquerda de cada linha.
        
        
        
    }
}

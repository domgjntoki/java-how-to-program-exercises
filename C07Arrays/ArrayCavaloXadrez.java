package C07Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayCavaloXadrez {
        public static int tabuleiro[][] = new int[8][8];
        public static int casasVisitadas[][] = new int[8][8];
        public static int linhaAtual = 3;
        public static int colunaAtual = 4;
        public static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        public static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int movimento;
        boolean erro;
        tabuleiro[3][4] = 1;
        
        mostrarTabuleiro();
        zerar();
        do {
            System.out.print("Insira um movimento para o cavalo "
                    + "(-1 para parar): ");
            movimento = input.nextInt();
            if(casasVisitadas[linhaAtual][colunaAtual] == 1)
                System.out.println("Você já visitou essa casa.");
            erro = movimento(movimento);
            mostrarTabuleiro();
            
            if(erro == false)
                zerar();
        } while (movimento != -1);
                
    }
    public static boolean movimento(int movimento){
        boolean erro;
        try{
            linhaAtual += vertical[movimento];
            colunaAtual += horizontal[movimento];

            tabuleiro[linhaAtual][colunaAtual] = 1;
            casasVisitadas[linhaAtual][colunaAtual] = 1;
            erro = false;
            }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("O movimento sairá dos limites do tabuleiro, "
                    + "tente outro tipo de movimento.");
            erro = true;
            }
        return erro;   
    };    
    
    public static void mostrarTabuleiro(){
        for (int [] posicaoY : tabuleiro){
            for(int posicaoX : posicaoY){
                System.out.print(posicaoX);
            }
            System.out.println("");
        }
    }
    
    public static void zerar(){
        for(int i = 0; i < tabuleiro[0].length; i++)
            Arrays.fill(tabuleiro[i], 0);
    }
}

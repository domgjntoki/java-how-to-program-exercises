package C08;
import java.util.Arrays;
import java.util.Scanner;


public class C08JogoDaVelha {
    private enum QUADRADO { X, O, EMPTY };
    public boolean[] situacao = new boolean[4];
    private QUADRADO[][]jogo = new QUADRADO[3][3];
    private boolean X = true;
    
    public static void main(String[] args) {
        C08JogoDaVelha a = new C08JogoDaVelha();
        boolean continua = true;
        Scanner input = new Scanner(System.in);
        a.mostrarJogo();
        while (continua) {
            try {
                System.out.print("Marque sua posição, ex: A1: ");
                String marcacao = input.next();
                a.marcar(marcacao);
                a.mostrarJogo();
                a.checarJogo();
                if (a.situacao[0])
                    System.out.println("Velha");
                else if (a.situacao[1])
                    System.out.println("Vitória do X");
                else if (a.situacao[2])
                    System.out.println("Vitória do O");
                continua = a.situacao[3];
            } catch(IllegalArgumentException e) {
                System.out.println("Jogada Inválida, tenta novamente: " 
                        + e.getMessage());
            }
        }
    }
    
    public C08JogoDaVelha(){
        QUADRADO[][]jogo = new QUADRADO[3][3];
        for (int i = 0; i < 3; i++){
            Arrays.fill(jogo[i], QUADRADO.EMPTY);
        }
        this.jogo = jogo;
    }
   
    
    
    public void mostrarJogo(){
        // EMPTY | EMPTY | EMPTY |
        System.out.printf("%6s%8s%8s%n", "A", "B", "C");
        for(int i = 0; i < 3; i++){
            System.out.print((i + 1) + "  ");
            for(int j = 0; j < jogo.length; j++){
                if(jogo[i][j] == QUADRADO.EMPTY)
                    System.out.printf("%5s | ", " ");
                else
                    System.out.printf("%5s | ", jogo[i][j]);
                
                if(j == 2)
                    System.out.println("   \n   -----------------------");
            }
        }
        System.out.printf("%nVez do " + (X ? "X%n" : "O%n"));
    }
    
    public void marcar(String posicao){
        posicao = posicao.toUpperCase();
        int x;
        int y;
        char letra = posicao.charAt(0);
        String numero = "" + posicao.charAt(1);
        
        try{
            int posicaoNum = Integer.parseInt(numero);
            y = posicaoNum;
        }
        
        catch(NumberFormatException e){
            throw new IllegalArgumentException("código inválido");
        }
        
        switch(letra){
            case 'A':
                x = 0;
                break;
            case 'B':
                x = 1;
                break;
            case 'C':
                x = 2;
                break;
            default:
                throw new IllegalArgumentException("código inválido");
        }
        QUADRADO xO = jogo[y - 1][x];
        if(xO == QUADRADO.EMPTY){
            if(X == true)
                jogo[y-1][x] = QUADRADO.X;

            else
                jogo[y-1][x] = QUADRADO.O;
        }
        
        else
            throw new IllegalArgumentException("Jogada inválida, X ou O no local.");
        
        X = !X;
    }
    
    public void checarJogo(){
        boolean continua = true;
        boolean velha = false;
        boolean vitoriaX = false;
        boolean vitoriaO = false;
        
        QUADRADO[][] vitoriaaX = new QUADRADO[3][3];
        QUADRADO[][] vitoriaaO = new QUADRADO[3][3];
        
        // encher com O e X os novos QUADRADOS
        for (int i = 0; i < 3; i++){
            Arrays.fill(vitoriaaX[i], QUADRADO.X);
            Arrays.fill(vitoriaaO[i], QUADRADO.O);
        }
        
        // testando se o jogo deu velha
        int testes = 0;
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (jogo[i][j] != QUADRADO.EMPTY)
                    testes++;
            }
        }
        if(testes == 9){
            velha = true;
            continua = false;
        }
        
                
        // testando vitorias retas
        for (int i = 0; i < 3; i++) {
            // vitoria horizontal
            if(Arrays.equals(jogo[i], vitoriaaX[i])){
                vitoriaX = true;
                continua = false;
                break;
            }
            if(Arrays.equals(jogo[i], vitoriaaO[i])){
                vitoriaO = true;
                continua = false;
                break;
            }
            
            // vitoria vertical
            if(jogo[0][i] == vitoriaaX[0][i]){
                if(jogo[1][i] == vitoriaaX[1][i]){
                    if(jogo[2][i] == vitoriaaX[2][i]){
                        vitoriaX = true;
                        continua = false;
                    }
                }
            }
                
            if(jogo[0][i] == vitoriaaO[0][i]){
                if(jogo[1][i] == vitoriaaO[1][i]){
                    if(jogo[2][i] == vitoriaaO[2][i]){
                        vitoriaO = true;
                        continua = false;
                    }
                }
            }
        }
            
            // vitoria diagonal principal
            if(jogo[0][0] == vitoriaaX[0][0]){
                if(jogo[1][1] == vitoriaaX[1][1]){
                    if(jogo[2][2] == vitoriaaX[2][2]){
                        vitoriaX = true;
                        continua = false;
                    }
                }
            }
            
            if(jogo[0][0] == vitoriaaO[0][0]){
                if(jogo[1][1] == vitoriaaO[1][1]){
                    if(jogo[2][2] == vitoriaaO[2][2]){
                        vitoriaO = true;
                        continua = false;
                    }
                }
            }
            
            // vitoria diagonal secundária
            if(jogo[0][2] == vitoriaaX[0][2]){
                if(jogo[1][1] == vitoriaaX[1][1]){
                    if(jogo[2][0] == vitoriaaX[2][0]){
                        vitoriaX = true;
                        continua = false;
                    }
                }
            }
            
            if(jogo[0][2] == vitoriaaO[0][2]){
                if(jogo[1][1] == vitoriaaO[1][1]){
                    if(jogo[2][0] == vitoriaaO[2][0]){
                        vitoriaO = true;
                        continua = false;
                    }
                }
            }
        this.situacao = new boolean[]{velha, vitoriaX, vitoriaO, continua};
    }

}

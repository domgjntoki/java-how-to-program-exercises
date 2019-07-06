package C07Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayGraficosTartaruga {
    public static void main(String[] args) {
       
        /*
        Comando Significado
        1 Caneta para cima
        2 Caneta para baixo
        3 Vira para a direita
        4 Vira para a esquerda
        5, 10 Avance 10 espaços (substitua 10 por um número diferente de espaços)
        6 Exiba o array 20 por 20
        9 Fim dos dados (sentinela)
        */
        Scanner input = new Scanner(System.in);
        int[][] floor = new int[20][20];
        
        int x = 0;
        int xInicial;
        int y = 0;
        int yInicial;
        boolean direita = true;
        boolean esquerda = false;
        boolean baixo = false;
        boolean cima = false;
        int acao;
        
        boolean caneta = false;
        System.out.print("[1] Caneta para cima\n" +
                         "[2] Caneta para baixo\n" +
                         "[3] Vira para a direita\n" +
                         "[4] Vira para a esquerda\n" +
                         "[5,10] Avance 10 espaços (substitua 10 por um número diferente de espaços)\n" +
                         "[6] Exiba o array 20 por 20\n" +
                         "[9] Fim dos dados (sentinela)\n");
        do {
            System.out.print("Ação: ");
            acao = input.nextInt();
            
            switch(acao){
                case 1: // Caneta para cima
                    caneta = false;
                    break;
                case 2: // Caneta para baixo
                    caneta = true;
                    break;
                case 3: // Vira para direita
                    if (direita == true){
                        baixo = true;
                        direita = false;
                    }
                    
                    else if (esquerda == true){
                        cima = true;
                        esquerda = false;
                    }
                    
                    else if (baixo == true){
                        esquerda = true;
                        baixo = false;
                    }
                    
                    else if (cima == true){
                        direita = true;
                        cima = false;
                    }
                    break;
                    
                case 4: // Vira para esquerda
                    if (direita == true){
                        cima = true;
                        direita = false;
                    }
                    
                    else if (esquerda == true){
                        baixo = true;
                        esquerda = false;
                    }
                    
                    else if (baixo == true){
                        direita = true;
                        baixo = false;
                    }
                    
                    else if (cima == true){
                        esquerda = true;
                        cima = false;
                    }
                    break;
                case 5: // Espaços
                    
                    System.out.print("Casas: ");
                    int casas = input.nextInt();
                    xInicial = x;
                    yInicial = y;
                    
                    try{
                    if (direita == true){
                        if (caneta == true)
                            for(x = xInicial; x <= xInicial + casas; x++){
                                floor[yInicial][x] = 1;
                        }
                        if (xInicial + casas <= 19)
                            x = xInicial + casas;
                        else
                            x = 19;
                    }
                    
                    else if (esquerda == true){
                        if (caneta == true)
                            for(x = xInicial; x >= xInicial - casas; x--){
                                floor[yInicial][x] = 1;
                            }
                        if (xInicial - casas >= 0)
                            x = xInicial - casas;
                        else
                            x = 0;
                    }
                    
                    else if(baixo == true){
                        if (caneta == true)
                            for (y = yInicial; y <= yInicial + casas; y++){
                                floor[y][xInicial] = 1;
                            }
                        
                        if(yInicial + casas <= 19)
                            y = yInicial + casas;
                        else
                            y = 19;
                    }
                    
                    else if (cima == true){
                        if (caneta == true)
                            for (y = yInicial; y >= yInicial - casas; y--){
                                floor[y][xInicial] = 1;
                            }
                        if (yInicial - casas >= 0)
                            y = yInicial - casas;
                        else
                            y = 0;
                    }
                    }
                    catch (ArrayIndexOutOfBoundsException e){}
                    
                    break;
                case 6: // Mostrar array
                    mostrarArray(floor);
                    break;
                case 9: // Parar
                    break;  
                default:
                    System.out.println("\033[31;1mOpção inválida\033[m");
            } 
        } while (acao != 9);
        
    }
    
    public static void mostrarArray(int[][] array){
        int i = 0;
        for (int[] linhas : array)
            for(int colunas:  linhas){
                System.out.print(colunas);
                i++;
                if(i % 20 == 0)
                    System.out.println("");
            }
    }
}

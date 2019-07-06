package C07Arrays;
import java.security.SecureRandom;
public class TartaturugaLebre {
        private static int tartaruga = 1;
        private static int lebre = 1;
    public static void main(String[] args){
        int ultimaTartaruga = 1;
        int ultimaLebre = 1;
        String acaoTartaruga = "";
        String acaoLebre = "";
        while(ultimaLebre < 70 && ultimaTartaruga < 70){    
            while(ultimaLebre != lebre || ultimaTartaruga != tartaruga){
                for(int posicao = 1; posicao <= 70; posicao ++){
                    // Mostra a situação do jogo
                    mostrarJogo(posicao, ultimaLebre, ultimaTartaruga,
                            acaoTartaruga, acaoLebre);
                    
                }
                
                
                
                
                
                if(lebre - ultimaLebre > 0)
                    ultimaLebre++; 
                else if(lebre - ultimaLebre < 0)
                    ultimaLebre--;

                if(tartaruga - ultimaTartaruga > 0)
                    ultimaTartaruga++;

                else if(tartaruga - ultimaTartaruga < 0)
                    ultimaTartaruga--;
                
                // esperar 10s
                try{Thread.sleep(333);} catch(InterruptedException e){}
                System.out.println("\n\n\n");
            }
            
            ultimaTartaruga = tartaruga;
            ultimaLebre = lebre;
            
            // move a tartaruga e a lebre
            SecureRandom movimento = new SecureRandom();
            int movTartaruga = movimento.nextInt(10) + 1; // gera numeros 1 - 10
            int movLebre = movimento.nextInt(10) + 1; // gera numeros 1 - 10
            
            // Altera valores de tartaruga
            acaoTartaruga = movTartaruga(movTartaruga);
            
            // Altera valores de lebre
            acaoLebre = movLebre(movLebre);
            

        }
        
        if(tartaruga >= 70)
            System.out.println("\033[32;37;1mVitória da tartaruga!!!!\033[m");
        else if(lebre >= 70)
            System.out.println("\033[33;37;1mVitória da lebre... nem sabe dar fp\033[m");
           
    }
    
    public static void pista(int posicao){
        if(posicao % 15 == 0 || posicao == 70){
            if(posicao % 15 == 0){
                System.out.print("\033[34;1m | \n\033[m");
                for(int i = 0; i < 3; i++)
                    System.out.print("\033[34;1m=-=-=-=-=-=-=-=\033[m");
                System.out.println();
            }

            if(posicao == 70){
                System.out.print("\033[34;1m | CHEGADA \033[m\n");
                for(int i = 0; i < 2; i++)
                    System.out.print("\033[34;1m=-=-=-=-=-=-=-=\033[m");
                System.out.println();
            }
        }
    }
    
    public static String movTartaruga(int movTartaruga){
        String acao;
        // caminhada rápida
            if(movTartaruga <= 5){
                tartaruga += 3;
                acao = "Caminhada rápida, +3 pontos";
            }
            
            // escorregão
            else if(movTartaruga <= 8){
                tartaruga -= 6;
                
                if(tartaruga < 1)
                    tartaruga = 1;
                acao = "Escorregão, -6 pontos";
            }
            // caminhada lenta
            else{
                tartaruga += 1;
                acao = "Caminhada lenta, +1 ponto";
            }
            
            return acao;
    }
    
    public static String movLebre(int movLebre){
        String acao;
        // dormir
        if(movLebre <= 2){acao = "Dormir, parado";} // nada

        // salto grande
        else if(movLebre <= 4){
            lebre += 9;
            acao = "Salto grande, +9 pontos";
        }
        // escorregão grande
        else if (movLebre == 5){
            lebre -= 9;
            if (lebre < 1){
                lebre = 1;
            }
            
            acao = "Escorregão grande, -9 pontos";
        }

        // salto pequeno
        else if(movLebre <= 8){
            lebre += 1;
            acao = "Salto pequeno, +1 ponto";
        }

        // escorregão pequeno 
        else{
            lebre -= 2;

            if(lebre < 1)
                lebre = 1;
            
            acao = "Escorregão pequeno, -2 pontos";
        }
        
        return acao;
    }
    
    public static void mostrarJogo(int posicao, int lebre, int tartaruga,
            String acaoTartaruga, String acaoLebre){
        // primeira pista
        if(posicao == 1){
            System.out.printf("BANG !!!!!\n" +
                                "E LÁ VÃO ELES !!!!!%n%s%s%n%s%s%n",
                    "Tartaruga: ", acaoTartaruga,
                    "Lebre: ", acaoLebre);
            
            for(int i = 0; i < 3; i++)
                System.out.print("\033[34;1m=-=-=-=-=-=-=-=\033[m");
            System.out.println("");
        }


        if(posicao == lebre || posicao == tartaruga){
            if(posicao == lebre && posicao == tartaruga)
                System.out.print("\033[41;37;1mAI!\033[m");

            else if(posicao == tartaruga)
                System.out.print("\033[42;37;1m T \033[m");

            else if(posicao == lebre)
                System.out.print("\033[43;37;1m H \033[m");
        } else
              System.out.printf("%02d ", posicao);

        // pistas
        pista(posicao);
    }
}

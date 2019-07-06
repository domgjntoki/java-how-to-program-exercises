package C07Arrays;

import java.security.SecureRandom;

public class ArrayCraps {
    public static void main(String[] args) { 
        /*
        (Jogo de dados Craps) Escreva um aplicativo que executa 1.000.000 de 
        partidas do jogo de dados craps (Figura 6.8) e responda às seguintes
        perguntas:
        a) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?
        b) Quantos jogos são perdidos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?
        c) Quais são as chances de ganhar no jogo de dados? [Observação: você deve descobrir que o craps é um dos jogos mais comuns de cassino.
        O que você supõe que isso significa?]
        d) Qual é a duração média de um jogo de dados craps?
        e) As chances de ganhar aumentam com a duração do jogo?
        
        // Ganhar de primeira: 7 ou 11
        // Perder de primeira: 2, 3 ou 12
        // Ganhar na 2ª: pegar mesmo ponto que a segunda rolada
        // Perder de 2ª ou +: 7
        */
        SecureRandom dado = new SecureRandom();
        int soma;
        int[] vitorias = new int[21];
        int[] derrotas = new int[21];
        int ponto;
        int tentativas;
        for (int i = 0; i < 1000000; i++) {
            soma = 2 + dado.nextInt(6) + dado.nextInt(6);
            // Se a primeira soma for 7 ou 11, adicionar a 
            // vitória de primeira (vitorias[0])
            if (soma == 7 || soma == 11)
                ++vitorias[0];
            
            // Se a primeira soma for 2, 3 ou 12, adicionar a  
            // derrota de primeira (derrotas[0])
            else if (soma == 2 || soma == 3 || soma == 12)
                ++derrotas[0];
            
            //Se não for nenhum, continuar jogo
            else{
                // Definir o ponto do jogador
                ponto = 2 + dado.nextInt(6) + dado.nextInt(6);
                
                // Definir tentativas como 0
                tentativas = 0;
                while (true){
                    soma = 2 + dado.nextInt(6) + dado.nextInt(6);
                    // Para cada loop em while adicionar 1 a tentativas
                    tentativas++;
                    try {
                        // Se for 7 acabar o jogo como derrota
                        if (soma == 7){
                            ++derrotas[tentativas];
                            break;
                        }
                        // Se for ponto acabar o jogo como vitória
                        else if (soma == ponto){
                            ++vitorias[tentativas];
                            break;
                        }
                    }
                    // Se for + de 21 tentativas, adicionar a posição 20
                    catch (ArrayIndexOutOfBoundsException e) {
                        if (soma == 7){
                            ++derrotas[20];
                            break;
                        }
                        else if (soma == ponto){
                            ++vitorias[20];
                            break;
                        }
                    }
                }
                
            }
        }
        // Demostrando as vitórias por rolagem
        System.out.println("Vitórias:");
        System.out.printf("%s%12s%n", "Rolagem", "Frequencia");
        for (int i = 0; i < vitorias.length; i++) {
            if (i == 20)
                System.out.printf("    21+ %d%n", vitorias[i]);
            else
                System.out.printf("%7d %d%n", i + 1, vitorias[i]);
        }
        
        // Demostrando as derrotas por rolagem
        System.out.println("\nDerrotas:");
        System.out.printf("%s%12s%n", "Rolagem", "Frequencia");
        for (int i = 0; i < derrotas.length; i++) {
            if (i == 20)
                System.out.printf("    21+ %d%n", derrotas[i]);
            else
                System.out.printf("%7d %d%n", i + 1, derrotas[i]);
        }
        // Chance de vitória: 
        double total = 0;
        for (int value : vitorias)
            total += value;
        System.out.printf("Chance de vitória: %.2f%s%n", 
                total * 100 / 1000000, "%");
        
        //Duração média: 
        
        // Criando uma array com a soma de vitorias e derrotas
        int[] vitoriasDerrotas = new int[21];
        for (int i = 0; i < vitoriasDerrotas.length; i++)
            vitoriasDerrotas[i] = vitorias[i] + derrotas[i];
        
        double duracao = 0;
        for (int i = 0; i < vitoriasDerrotas.length; i++){
            // Calculando o peso de cada rolagem.
            duracao += (double) (i + 1) * (double) vitoriasDerrotas[i] / 1000000;
        }
        System.out.printf("Duração média: %.3f partidas.%n", duracao);
        
    }
    
}

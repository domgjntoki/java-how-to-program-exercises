package C07Arrays;

import java.util.ArrayList;

public class ArrayListColections {
    public static void main(String[] args) {
        // cria um novo ArrayList de strings com uma capacidade inicial de 10
        ArrayList<String> itens = new ArrayList<>();
        
        itens.add("red"); // anexa um item à lista
        itens.add(0, "yellow"); // insere "yellow" no índice 0
        
        // cabeçalho
        System.out.print("Mostrar o conteúdo da lista a partir de um loop: ");
        
        for (int i = 0; i < itens.size(); i++)
            System.out.printf(" %s", itens.get(i));
        
        // exibe as cores usando for aprimorada no método display
        display(itens, "%nMostrar conteúdo a partir de um for aprimorado "
                + "utilizando o método display(): ");
        
        itens.add("green"); // adiciona "green" ao fim da lista
        itens.add("yellow"); // adiciona "yellow" ao fim da lista
        
        display(itens, "Lista com dois novos elementos: ");
        
        itens.remove("yellow");
        display(itens, "Remove o primeiro yellow:");
        
        itens.remove(1); // remove o item no índice 1
        display(itens, "Remove segundo elemento da lista (green):");
        
        // verifica se um valor está na List
        System.out.printf("\"black\"%s está na lista%n",
                itens.contains("black") ? "" : " não");
        
        // exibe o número de elementos na List
        System.out.printf("Tamanho: %s%n", itens.size());
    }
    
    public static void display(ArrayList<String> itens, String header){
        System.out.printf(header); // exibe o cabeçalho
        
        for (String item : itens)
            System.out.printf(" %s", item);
        
        System.out.println("");
    }
}

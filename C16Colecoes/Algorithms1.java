package C16Colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
public class Algorithms1 {
    public static void main(String[] args) {
        // crie e exibe uma List<Character>
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);
        
        // inverte e exibe uma List<Character>
        Collections.reverse(list);
        System.out.printf("%nAfter calling reverse, list contains:");
        output(list);
        
        // cria CopyList de um array de 3 caracteres
        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);
        
        // copia o conteúdo da lista para CopyList
        Collections.copy(copyList, list);
        System.out.printf("%nAfter copying, copyList contains:%n");
        output(copyList);
        
        // preenche a lista com Rs
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    }

    private static void output(List<Character> list) {
        System.out.print("The list is: ");
        for(Character element : list)
            System.out.printf("%s ", element);
        System.out.printf("%nMax: %s", Collections.max(list));
        System.out.printf("%nMin: %s%n", Collections.min(list));
    }
}

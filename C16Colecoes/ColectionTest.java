package C16Colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
public class ColectionTest {
    public static void main(String[] args) {
        // adiciona elementos no array colors a listar
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();
        
        for(String color : colors)
            list.add(color);
        
        // adiciona elementos no array removeColors em removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();
        
        for(String removeColor : removeColors)
            removeList.add(removeColor);
        
        // gera saída do conteúdo da lista
        System.out.println("ArrayList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }
        
        // remove da lista as cores contidas em removeList
        removeColors(list, removeList);
        
        // gera saída do conteúdo da lista
        System.out.printf("%n%nArrayList after calling removeColors:%n");
        for (String color : list)
            System.out.printf("%s ", color);
        System.out.println("");
        
    }
    
    public static void removeColors(Collection<String> collection1,
            Collection<String> collection2){
        Iterator<String> iterator = collection1.iterator();
        
        // loop enquanto a coleção tiver itens
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next()))
                iterator.remove();
            
        }
        
    }
    
}

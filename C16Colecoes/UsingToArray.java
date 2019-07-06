package C16Colecoes;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Fredson Sumi
 */
public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        
        links.addLast("red");
        links.add("pink");
        links.add(3, "green");
        links.addFirst("cyan");
        
        // obtém elementos LinkedList como um array
        colors = links.toArray(new String[links.size()]);
        
        System.out.println("Colors: ");
        for(String color : colors) {System.out.println(color);}
        
    }
}

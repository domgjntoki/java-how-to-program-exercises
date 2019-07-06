package C16Colecoes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author Fredson Sumi
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties table = new Properties();
        
        // configura propriedades
        table.setProperty("color", "blue");
        table.setProperty("width", "200");
        
        System.out.println("After setting properties");
        listProperties(table);
        
        // substitui o valor de propriedade
        table.setProperty("color", "red");
        
        System.out.println("After replacing properties");
        listProperties(table);
        
        savePropertites(table);
        table.clear();
        
        System.out.println("After clearing properties");
        listProperties(table);
        
        loadProperties(table);
        
        // obtém valor de cor da propriedade
        Object value = table.getProperty("color");
        
        // verifica se o valor está na tabela
        System.out.printf("Property color value %s", (value != null) ?
                ("is " + value + ".\n" ) : "is not in the table");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        table.list(System.out);
    }
    
    public static void savePropertites(Properties props) {
        try {
            try (FileOutputStream output = new FileOutputStream(
                    "src\\C16Colecoes\\props.dat")) {
                props.store(output, "Sample properties");
            }
            System.out.println("After saving properties");
            listProperties(props);
        } catch (IOException e) {
            System.err.println("Error saving file.");
        }
    }
    public static void loadProperties(Properties props) {
        try {
            try (FileInputStream input = new FileInputStream(
                    "src\\C16Colecoes\\props.dat")) {
                props.load(input);
            }
            System.out.println("After loading properties");
            listProperties(props);
            
        } catch (IOException e) {
            System.err.println("Error loading file.");
        }
    }
    // gera saída de valores de propriedade
    private static void listProperties(Properties props) {
        Set<Object> keys = props.keySet();
        
        // gera saída de pares nome/valor
        for(Object key : keys)
            System.out.printf("%s\t%s%n", key, props.getProperty((String) key));
        
        System.out.println();
    }
}

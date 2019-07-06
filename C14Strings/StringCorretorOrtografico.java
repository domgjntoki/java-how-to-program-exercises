package C14Strings;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author Fredson Sumi
 */
public class StringCorretorOrtografico {
    private static BufferedReader file;

    public static void corretor(String palavra) throws FileNotFoundException, IOException {
            file = new BufferedReader(new FileReader(
                    "C:\\Users\\giorgio\\Desktop\\words2.txt"));
            
            int correspondencias;
            double semelhanca;
            String word;
            Map<String, Integer> palavraCorrespondencia = new LinkedHashMap<>(235919);
            
            palavra = palavra.toLowerCase();
            while((word = file.readLine()) != null){
                word = word.toLowerCase();
                semelhanca = verificarSemelhanca(palavra, word);
                correspondencias = (int) (Math.floor(semelhanca + 0.5));
                if(word.equals(palavra)){
                    System.out.println("Word spelled correctly");
                    System.exit(0);
                }
                correspondencias += 100;
                
                if(Math.abs(palavra.length() - word.length()) <= 2)
                    correspondencias += 60;

                if(correspondencias > 0)
                    palavraCorrespondencia.put(word, correspondencias);
            
            }
            
            
            
            Integer[] valores = 
                    palavraCorrespondencia.values().toArray(new Integer[0]);
            ArrayList<Integer> valoresArray = 
                    new ArrayList<>(Arrays.asList(valores));
            int maiorCorrespondencia = Collections.max(valoresArray);

            
            palavraCorrespondencia.entrySet().stream()
                .filter((entry) -> (entry.getValue() == maiorCorrespondencia))
                .forEachOrdered((entry) -> {
                    System.out.printf("Do you mean %s?%n", entry.getKey());
                });
                
            System.out.println();
        
    }

    private static double verificarSemelhanca(String s1, String s2){
        List<Character> s1C = new ArrayList<>();
        List<Character> s2C = new ArrayList<>();

        char[] aStr1 = s1.toCharArray();
        char[] aStr2 = s2.toCharArray();
        int maiorTamanho = Math.max(s1.length(), s2.length());
        for(int i = 0; i < maiorTamanho; i++) {
            if(i < aStr1.length)
                s1C.add(aStr1[i]);
            if(i < aStr2.length)
                s2C.add(aStr2[i]);
        }

        // verifica a ordem escrita
        double ordem = 0;
        // verifica caracteres em comum
        double recorrencias = 0;
        // verifica se é igual com -1 letra
        double equalidade = 0;
        // para de verificar se é igual com -1 letra
        boolean continuarEqualidades = true;
        for (int i = 0; i < maiorTamanho; i++) {
            try{
                if(continuarEqualidades){
                    String ns1 = s1.substring(0, i) + s1.substring(i + 1);
                    String ns2 = s2.substring(0, i) + s2.substring(i + 1);
                    if(s1.equals(ns2) || s2.equals(ns1) || ns1.equals(ns2)){
                        equalidade = 100;
                        continuarEqualidades = false;
                    }
                }
                if(s1C.contains(s2C.get(i)) || s2C.contains(s1C.get(i)))
                    recorrencias++;
                if(s1.charAt(i) == s2.charAt(i))
                    ordem++;
            }
            catch (IndexOutOfBoundsException e){}
            
        }
        
        return (recorrencias * 30 + ordem * 70) / maiorTamanho + equalidade;
    }
 
}

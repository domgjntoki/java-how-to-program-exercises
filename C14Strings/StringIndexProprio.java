package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringIndexProprio{
    public String word;
    
    public StringIndexProprio(String word){
        this.word = word;
    }
    
    
    public int indexOfProprio(String caracter){
        int index = -1;
            
        for(int i = 0; i < word.length() - (caracter.length() - 1); i++){
            
            if(word.substring(i, caracter.length() + i).equals(caracter)){
                index = i;
                break; // para no primeiro caractere encontrado
            }
            
        }
        return index;
    }
    public int indexOfProprio(String caracter, int position){
        int index = -1;
            
        for(int i = position; i < word.length() - (caracter.length() - 1); i++){
            
            if(word.substring(i, caracter.length() + i).equals(caracter)){
                index = i;
                break; // para no primeiro caractere encontrado
            }
        }
        return index;
    }
    
    public int lastIndexOfProprio(String caracter){
        int index = -1;
            
        for(int i = 0; i < word.length() - (caracter.length() - 1); i++){
            
            if(word.substring(i, caracter.length() + i).equals(caracter))
                index = i;

        }
        return index;
    }
}


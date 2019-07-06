package C07Arrays;

import javax.swing.JPanel;

public class ArrayLinhaComandoSoma {
    public static void main(String[] args) {
        double soma = 0;
        
        for(String numero: args){
            soma += Double.parseDouble(numero);
        }
        System.out.println(soma);
    }
    
}

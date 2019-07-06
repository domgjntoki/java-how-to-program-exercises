package C12GUI;
import javax.swing.JOptionPane;
/**
 *
 * @author Fredson Sumi
 */
public class Addition {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Insira o primeiro número:");
        String n2 = JOptionPane.showInputDialog("Insira o segundo número");
        
        try{
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
        
            JOptionPane.showMessageDialog(null, "A soma é " + (num1 + num2),  
                "Soma dos dois números", JOptionPane.PLAIN_MESSAGE);
        }
        
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por favor insira inteiros",
                    "Valor inválido!", JOptionPane.ERROR_MESSAGE);
        }
    }
}

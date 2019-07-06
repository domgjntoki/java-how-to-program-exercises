package C12GUI;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import  java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
/**
 *
 * @author Fredson Sumi
 */
public class CheckBoxFrame extends JFrame{
    private final JTextField textField;
    private final JCheckBox boldJCheckBox;
    private final JCheckBox italicJCheckBox;
    
    public CheckBoxFrame(){
        super("JCheckBox Text");
        setLayout(new FlowLayout());
        
        // configura JTextField e sua fonte
        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);
        
        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
              
        add(boldJCheckBox); // adiciona caixa de seleção de estilo negrito ao JFrame
        add(italicJCheckBox); // adiciona caixa de seleção de itálico ao JFrame
        
        
        // listeners registradores para JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
    }
    
    // classe interna private para tratamento de evento ItemListener
    private class CheckBoxHandler implements ItemListener{
        // responde aos eventos de caixa de seleção
        @Override
        public void itemStateChanged(ItemEvent event){
            Font font = null;
            
            if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            
            else if(boldJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            
            else if(italicJCheckBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            
            else
                font = new Font("Serif", Font.PLAIN, 14);
            
            // Altera a fonte de textField
            textField.setFont(font);
        }
    }   
}

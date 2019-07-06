package C12GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
/**
 *
 * @author Fredson Sumi
 */
public class RadioButtonFrame extends JFrame{
    private final JTextField textField;
    private final Font plainFont;
    private final Font boldFont;
    private final Font italicFont;
    private final Font italicBondFont;
    private final JRadioButton plainJRadioButton;
    private final JRadioButton boldJRadioButton;
    private final JRadioButton italicJRadioButton;
    private final JRadioButton boldItalicJRadioButton;
    private final ButtonGroup radioGroup;
    
    public RadioButtonFrame(){
        super("RadioButton Test");
        setLayout(new FlowLayout());
        
        textField = new JTextField("Watch font change", 25);
        add(textField);
        
        // cria botões de opção
        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Italic & Bond", false);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);
        
        // cria relacionamento lógico entre JRadioButtons
        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);
        
        // cria fonte objetos
        plainFont = new Font("Serif", Font.PLAIN, 42);
        boldFont = new Font("Serif", Font.BOLD, 42);
        italicFont = new Font("Serif", Font.ITALIC, 42);
        italicBondFont = new Font("Serif", Font.ITALIC + Font.BOLD, 42);
        textField.setFont(plainFont);
        
        // registra eventos para JRadioButtons
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(
                    new RadioButtonHandler(italicBondFont));
    }
    
    private class RadioButtonHandler implements ItemListener{
        
        private final Font font; // fonte associada com esse listener
        
        public RadioButtonHandler(Font f) {font = f;}
        
        // trata eventos de botão de opção
        @Override
        public void itemStateChanged(ItemEvent event){
            textField.setFont(font);
        }
    }
}

package C12GUI;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
/**
 *
 * @author Fredson Sumi
 */
public class TextFieldFrame extends JFrame{
    private final JTextField jTextField1;
    private final JTextField jTextField2;
    private final JTextField jTextField3;
    private final JPasswordField passwordField;
    
    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());
        
        // cria campo de texto com 10 colunas
        jTextField1 = new JTextField(10);
        add(jTextField1);
        
        // cria campo de texto com texto padrão
        jTextField2 = new JTextField("Enter text here");
        add(jTextField2);
        
        // cria campo de texto com texto padrão e 21 colunas
        jTextField3 = new JTextField("Uneditable text field", 21);
        jTextField3.setEditable(false);
        jTextField1.setToolTipText("You can't change anything");
        add(jTextField3);
        
        // cria campo de senha com texto padrão
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);
        
        // rotinas de tratamento de evento registradoras
        TextFieldHandler handler = new TextFieldHandler();
        jTextField1.addActionListener(handler);
        jTextField2.addActionListener(handler);
        jTextField3.addActionListener(handler);
        passwordField.addActionListener(handler);
        
    }
    
    private class TextFieldHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String string = "";
            
            // usuário pressionou Enter no JTextField textField1
            if(event.getSource() == jTextField1){
                string = String.format("textField1: %s", 
                        event.getActionCommand());
            }
            
            // usuário pressionou Enter no JTextField textField2
            else if (event.getSource() == jTextField2){
                string = String.format("textField2: %s", 
                        event.getActionCommand());
            }
            
            // usuário pressionou Enter no JTextField textField3
            else if (event.getSource() == jTextField3){
                string = String.format("textField3: %s", 
                        event.getActionCommand());
            }
            
            // usuário pressionou Enter no JTextField passwordField
            else if (event.getSource() == passwordField){
                string = String.format("passwordField: %s", 
                        event.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null, string);
        }
    }
    
}

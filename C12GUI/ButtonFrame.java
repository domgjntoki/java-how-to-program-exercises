package C12GUI;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Fredson Sumi
 */
public class ButtonFrame extends JFrame{
    private final JButton plainJButton;
    private final JButton fancyJButton;
    
    public ButtonFrame(){
        super("Testing buttons");
        setLayout(new FlowLayout());
        
        plainJButton = new JButton("Plain Button");
        add(plainJButton); // adiciona plainJButton ao JFrame
        
        Icon icon1 = new ImageIcon(getClass().getResource("section-fail.png"));
        Icon icon2 = new ImageIcon(getClass().getResource("section-pass.png"));
        
        fancyJButton = new JButton("Fancy Button", icon1); // configura imagem
        fancyJButton.setRolloverIcon(icon2); // configura imagem de rollover
        add(fancyJButton); // adiciona fancyJButton ao JFrame
        
        // cria novo ButtonHandler de tratamento para tratamento 
        // de evento de botão
        
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this, 
                    String.format("You pressed: %s", event.getActionCommand()));
        }
    }
}

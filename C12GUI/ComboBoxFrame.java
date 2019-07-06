package C12GUI;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Fredson Sumi
 */
public class ComboBoxFrame extends JFrame{
    private final JComboBox<String> imagesJComboBox;
    private final JLabel label;
    
    private static final String[] WAIFUS = 
            {"/DokiDoki/Monika.png", "/DokiDoki/Natsuki.png", "/DokiDoki/Sayori.png",
                "/DokiDoki/Yuri.png"};
    private static final String[] WAIFUS_NOMES = 
            {"Monika", "Natsuki", "Sayori","Yuri"};
    
    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(WAIFUS[0])),
        new ImageIcon(getClass().getResource(WAIFUS[1])),
        new ImageIcon(getClass().getResource(WAIFUS[2])),
        new ImageIcon(getClass().getResource(WAIFUS[3]))};
    
    // construtor ComboBoxFrame adiciona JComboBox ao JFrame
    public ComboBoxFrame(){
        super("Testing JComboBox");
        setLayout(new FlowLayout());
        imagesJComboBox = new JComboBox<>(WAIFUS_NOMES);
        imagesJComboBox.setMaximumRowCount(4);
        imagesJComboBox.setFont(new Font("Arial", Font.BOLD, 30));
        label = new JLabel(icons[0]);
        imagesJComboBox.addItemListener((ItemEvent ie) -> {
            // determina se o item está selecionado
            
            
            // Muda a imagem
            if(ie.getStateChange() == ItemEvent.SELECTED){
                label.setIcon(icons[
                        imagesJComboBox.getSelectedIndex()]);
                
                // Buga e escreve JUST MONIKA se a selecionada não for
                // Monika
                if(imagesJComboBox.getSelectedIndex() != 0){
                    JOptionPane.showMessageDialog(null, "JUST MONIKA",
                            "JUST MONIKA" ,JOptionPane.ERROR_MESSAGE);
                    label.setIcon(icons[0]);
                }
            }
        });
        
        add(imagesJComboBox);
        add(label);
    }
    
}

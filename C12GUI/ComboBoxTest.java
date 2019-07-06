package C12GUI;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Fredson Sumi
 */
public class ComboBoxTest {
    public static void main(String[] args) {
        
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | 
                InstantiationException | IllegalAccessException e) {}
        
        ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
        //icone
        ImageIcon icone = new ImageIcon(ComboBoxTest.class.getResource(
                "/DokiDoki/icone.png"));
        comboBoxFrame.setIconImage(icone.getImage());
        
        comboBoxFrame.getContentPane().setBackground(Color.DARK_GRAY);
        comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBoxFrame.setSize(1366, 768);
        comboBoxFrame.setVisible(true);
        }
}

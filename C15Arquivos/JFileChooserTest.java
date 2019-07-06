package C15Arquivos;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Fredson Sumi
 */
public class JFileChooserTest {
    public static void main(String[] args) throws IOException {
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | 
                InstantiationException | IllegalAccessException e) {}
        JFileChooserDemo fileChooser = new JFileChooserDemo();
        fileChooser.setSize(400, 400);
        fileChooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fileChooser.setVisible(true);
    }
}

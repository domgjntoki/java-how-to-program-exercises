package C12GUI;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Fredson Sumi
 */
public class MultipleSelectionTest {
    public static void main(String[] args) {
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (ClassNotFoundException | IllegalAccessException | 
                InstantiationException | UnsupportedLookAndFeelException e) {}
        
        MultipleSelectionFrame multipleSelectionFrame = 
                new MultipleSelectionFrame();
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setVisible(true);
    }
}

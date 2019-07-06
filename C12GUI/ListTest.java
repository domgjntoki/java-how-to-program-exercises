package C12GUI;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Fredson Sumi
 */
public class ListTest {
    public static void main(String[] args) {
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (ClassNotFoundException | IllegalAccessException | 
                InstantiationException | UnsupportedLookAndFeelException e) {}
        ListFrame listFrame = new ListFrame();
        listFrame.setSize(350, 150);
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setVisible(true);
    }
}

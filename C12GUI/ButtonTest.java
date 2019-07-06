package C12GUI;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Fredson Sumi
 */
public class ButtonTest {
    public static void main(String[] args) {
        
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(700, 500);
        buttonFrame.setVisible(true);
    }
}

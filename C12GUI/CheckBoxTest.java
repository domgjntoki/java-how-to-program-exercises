package C12GUI;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
/**
 *
 * @author Fredson Sumi
 */
public class CheckBoxTest {
    public static void main(String[] args) {
        // icone
        ImageIcon kawaii = new ImageIcon(CheckBoxTest.class.getResource(
                "mode-osu.png"));
        
        CheckBoxFrame checkBox = new CheckBoxFrame();
        checkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBox.setSize(275, 100);
        checkBox.setIconImage(kawaii.getImage());
        checkBox.setVisible(true);
    }
}

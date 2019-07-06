package C12GUI;

import javax.swing.JFrame;

/**
 *
 * @author Fredson Sumi
 */
public class MouseTrackerTest {
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(350, 150);
        mouseTrackerFrame.setVisible(true);
    }
}

package C12GUI;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicListUI;
/**
 *
 * @author Fredson Sumi
 */
public class ListFrame extends JFrame{
    private final JList<String> colorJList;
    
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
        "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", 
        "Red", "White", "Yellow"};
    
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, 
        Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, 
        Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, 
        Color.YELLOW};
    
    public ListFrame(){
        super("List Test");
        setLayout(new FlowLayout());
        
        colorJList = new JList<>(colorNames);
        colorJList.setVisibleRowCount(5);
        
        // não permite múltiplas seleções
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // adiciona um JScrollPane que contém JList ao frame
        add(new JScrollPane(colorJList));
        
        colorJList.addListSelectionListener(
            new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    getContentPane().setBackground(colors[
                            colorJList.getSelectedIndex()]);
                }
            }
        );
        
        
    }
}

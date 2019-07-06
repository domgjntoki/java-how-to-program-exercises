package C12GUI;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
/**
 *
 * @author Fredson Sumi
 */
public class MultipleSelectionFrame extends JFrame{
    private final JList<String> colorJList;
    private final JList<String> copyJList;
    private Button copyJButton;
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
        "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", 
        "Red", "White", "Yellow"};
    
    
    public MultipleSelectionFrame(){
        super("Multiple selection lists");
        setLayout(new FlowLayout());
        
        colorJList = new JList<>(colorNames);
        colorJList.setVisibleRowCount(5);
        
        
        // não permite múltiplas seleções
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        // adiciona um JScrollPane que contém JList ao frame
        add(new JScrollPane(colorJList));
        
        copyJButton = new Button("Copy >>>");
        copyJButton.addActionListener(
            new ActionListener(){
                // trata evento de botão
                @Override
                public void actionPerformed(ActionEvent event){
                    // coloca valores selecionados na copyJList
                    copyJList.setListData(
                            colorJList.getSelectedValuesList().toArray(
                                    new String[0]));
                }
            }
        );
        add(copyJButton);
        
        copyJList = new JList<>();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100);
        copyJList.setFixedCellHeight(15);
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));
    }
}

package C12GUI;
import java.awt.FlowLayout; // especifica como os componentes são organizados
import javax.swing.JFrame; // fornece recursos básicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // constantes comuns utilizadas com Swing
import javax.swing.Icon; // interface utilizada para manipular imagens
import javax.swing.ImageIcon;
/**
 *
 * @author Fredson Sumi
 */
public class LabelFrame extends JFrame{
    private final JLabel label1; // JLabel apenas com texto
    private final JLabel label2; // JLabel construído com texto e ícone
    public final JLabel label3; // JLabel com texto e ícone adicionados
    
    public LabelFrame(){
        super("Testing label");
        setLayout(new FlowLayout()); // configura o layout de frame
        
        
        // Construtor JLabel com um argumento de string
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);
        
        // construtor JLabel com string, Icon e argumentos de alinhamento
        Icon kawaii = new ImageIcon(getClass().getResource("mode-osu.png"));
        label2 = new JLabel("Label with text and icon", 
                kawaii, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(kawaii);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
        
    }
    
}

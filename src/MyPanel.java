import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel{
    MyPanel(LayoutManager layout, Dimension dimension){
        setLayout(layout);
        setPreferredSize(dimension);
    }
}

import javax.swing.JPanel;
import java.awt.*;
// import javax.swing.*;

public class MyPanel extends JPanel{
    MyPanel(LayoutManager layout, Dimension dimension){
        setLayout(layout);
        setPreferredSize(dimension);
    }

    // protected void addComponent(Component c){
    //     super.add(c);
    // }
}

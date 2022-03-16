import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.*;

public class MyButton extends JButton{
    MyButton(String text, Font font, Color color, Color fg){
        super(text);
        super.setFont(font);
        super.setBackground(color);
        super.setBorder(BorderFactory.createLineBorder(new Color(0x00000), 1, true));
        super.setFocusable(false);
        super.setForeground(fg);
    }
}

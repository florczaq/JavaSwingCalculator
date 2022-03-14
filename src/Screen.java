import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Screen extends MyPanel{
    private String result = "0";
    private MyLabel display;

    Screen(int width, int height){
        super(new BorderLayout(), new Dimension(width, height));
        display = new MyLabel(result, new Font("Arial", 0, 40), JLabel.RIGHT);
        
        super.add(display, BorderLayout.CENTER);
        super.setBackground(new Color(0xf1f1f1f1));
        super.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
    }

    public void setText(String text){
        display.setText(text);
    }

}

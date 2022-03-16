import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Screen extends MyPanel {
    private String result = "0";
    private MyLabel display;

    Screen(int width, int height) {
        super(new BorderLayout(), new Dimension(width, height));
        display = new MyLabel(result, new Font("Arial", 0, 60), JLabel.RIGHT);
        display.setForeground(new Color(0x686868));
        super.add(display, BorderLayout.CENTER);
        super.setBackground(new Color(0x1F1F1F1F));
        super.setForeground(new Color(0xFFFF));
        super.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
    }

    public void setText(String text) {
        display.setText(text);
    }
}

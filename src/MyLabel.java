import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    MyLabel(String text, Font font) {
        super(text);
        setFont(font);
    }

    MyLabel(String text, Font font, int aligment){
        this(text, font);
        setHorizontalAlignment(aligment);
    }
}

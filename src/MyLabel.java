import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    MyLabel(String text, Font font) {
        super(text);
        setFont(font);
    }

    MyLabel(String text, Font font, int aligment) {
        this(text, font);
        setHorizontalAlignment(aligment);
    }

    public void setTextColor(Color color){
        setForeground(color);
    }

    public void setCharSize(int size) {
        setFont(new Font(getFont().getFamily(), 0, size));
    }

    public final int getFontCharSize() {
        return super.getFont().getSize();
    }

    public final int getLabelWidth() {
        return super.getSize().width;
    }

    public final int getTextWidth(){
        return super.getFontMetrics(super.getFont()).stringWidth(super.getText());
    }


}

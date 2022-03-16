// import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Keyboard extends MyPanel {
    private ArrayList<MyButton> buttons = new ArrayList<MyButton>();

    private void initButtons() {
        final String keys[] = {
                "7", "8", "9", "*", " ",
                "4", "5", "7", "+", " ",
                "1", "2", "3", "-", " ",
                "C", "0", "/", "=", "."
        };

        for (String s : keys) {
            buttons.add(new MyButton(s, new Font("Arial", 0, 20), new Color(0xF0F0F0F0)));
            super.add(buttons.get(buttons.size() - 1));
        }
    }

    Keyboard(int width, int height) {
        super(new GridLayout(4, 4), new Dimension(width, height));
        initButtons();
    }

    public MyButton getButton(int index){
        try {
            return buttons.get(index);
        } catch(Exception e){
            System.out.println("Wrong index!!");
            return buttons.get(0);
        }
    }

    public final String getButtonText(int index){
        try {
            return buttons.get(index).getText();
        } catch(Exception e){
            System.out.println("Wrong index!! [Keyboard.java]");
            return buttons.get(0).getText();
        }
    }

    public final int getButtonsListSize(){
        return buttons.size();
    }
}
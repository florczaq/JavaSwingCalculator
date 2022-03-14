import javax.script.ScriptException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    Calculations calc = new Calculations();
    Screen screen;
    Keyboard keyboard;
    String result = "";

    JPanel mainPanel() {
        JPanel panel = new JPanel();
        screen = new Screen(0, 200);
        keyboard = new Keyboard(0, 400);
        for (int i = 0; i < keyboard.getButtonsListSize(); i++)
            keyboard.getButton(i).addActionListener(this);
        panel.setLayout(new BorderLayout());
        panel.add(screen, BorderLayout.NORTH);
        panel.add(keyboard, BorderLayout.CENTER);
        return panel;
    }

    MyFrame(int width, int height, String title, int x, int y) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(x, y, width, height);
        setLayout(new BorderLayout());
        add(mainPanel(), BorderLayout.CENTER);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i < keyboard.getButtonsListSize(); i++) {
            if (event.getSource() == keyboard.getButton(i)) {
                if (keyboard.getButtonText(i) == "C")
                    result = " ";
                else if (keyboard.getButtonText(i) == "=") {
                    try {
                        result = calc.calculate(result);
                    } catch (ScriptException e) {}
                } else
                    result += keyboard.getButtonText(i);
                screen.setText(result);
            }
        }
    }
}

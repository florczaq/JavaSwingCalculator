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
        getContentPane().setBackground(new Color(0x000));
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
                switch (keyboard.getButtonText(i)) {
                    case "C":
                        result = " ";
                        screen.setDefaultTextSize();
                        break;

                    case "=":
                        try {
                            if ((int) result.charAt(result.length() - 1) >= 48)
                                result = calc.calculate(result);
                        } catch (ScriptException e) {
                            System.out.println(e);
                        }
                        break;

                    case ".":
                        if ((int) result.charAt(result.length() - 1) >= 48)
                            result += keyboard.getButtonText(i);
                        break;

                    default:
                        if (keyboard.getButtonText(i) != " ")
                            result += keyboard.getButtonText(i);
                        break;
                }
                screen.setText(result);
            }
        }
    }
}
import java.awt.*;
import java.io.IOException;

public class App {
    private static Dimension dSize = Toolkit.getDefaultToolkit().getScreenSize();;
    private static Dimension size = new Dimension(400, 600);

    public static void main(String[] args) throws Exception {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProcessBuilder("clear").inheritIO().start();
                } catch (IOException e) {
                }
                new MyFrame((int) size.getWidth(), (int) size.getHeight(), "Calculator",
                        (int) (dSize.getWidth() / 2 - size.getWidth() / 2),
                        (int) (dSize.getHeight() / 2 - size.getHeight() / 2));

            }
        });
    }
}

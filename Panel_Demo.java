import java.awt.*;
import java.awt.event.*;

public class Panel_Demo {

    public static void main(String[] args) {

        Frame frame = new Frame("Panel Demo");
        Panel panel = new Panel();

        panel.setBackground(Color.RED);

        frame.setSize(500, 500);
        frame.add(panel);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
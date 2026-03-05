import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayout_Demo {

    Frame frame;
    Panel panel;

    public BorderLayout_Demo(){

        frame = new Frame("BorderLayout Example");

        panel = new Panel();
        panel.setLayout(new BorderLayout());

        panel.add(new Button("North"), BorderLayout.NORTH);
        panel.add(new Button("South"), BorderLayout.SOUTH);
        panel.add(new Button("East"), BorderLayout.EAST);
        panel.add(new Button("West"), BorderLayout.WEST);
        panel.add(new Button("Center"), BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(400, 300);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayout_Demo();
    }
}
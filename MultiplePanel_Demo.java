import java.awt.*;
import java.awt.event.*;

public class MultiplePanel_Demo {

    Frame frame;
    Panel topPanel;
    Panel bottomPanel;

    public MultiplePanel_Demo(){

        frame = new Frame("Multiple Panel Example");
        frame.setLayout(new BorderLayout());

        topPanel = new Panel();
        bottomPanel = new Panel();

        topPanel.setBackground(Color.LIGHT_GRAY);
        bottomPanel.setBackground(Color.CYAN);

        topPanel.add(new Button("Button 1"));
        topPanel.add(new Button("Button 2"));

        bottomPanel.add(new Button("OK"));
        bottomPanel.add(new Button("Cancel"));

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);

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
        new MultiplePanel_Demo();
    }
}
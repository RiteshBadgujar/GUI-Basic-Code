import javax.swing.*;
import java.awt.*;

public class JPanel_Demo {

    JFrame frame;
    JPanel panel;

    public JPanel_Demo() {

        frame = new JFrame("JPanel Example");

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JTextField(10));

        frame.add(panel);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JPanel_Demo();
    }
}
import javax.swing.*;
import java.awt.*;

public class MultiPanel_Swing {

    JFrame frame;
    JPanel top, center, bottom;

    public MultiPanel_Swing(){

        frame = new JFrame("Multi Panel Example");
        frame.setLayout(new BorderLayout());

        // Top Panel
        top = new JPanel();
        top.add(new JLabel("Login Form"));

        // Center Panel (Form)
        center = new JPanel();
        center.setLayout(new GridLayout(2,2));

        center.add(new JLabel("Username:"));
        center.add(new JTextField(10));

        center.add(new JLabel("Password:"));
        center.add(new JPasswordField(10));

        // Bottom Panel (Buttons)
        bottom = new JPanel();

        bottom.add(new JButton("Login"));
        bottom.add(new JButton("Reset"));

        // Add Panels to Frame
        frame.add(top, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new MultiPanel_Swing();
    }
}
import javax.swing.*;
import java.awt.event.*;

public class Swing_Basic_Demo implements ActionListener {

    JFrame frame;
    JTextField text;
    JButton button;
    JLabel label;

    public Swing_Basic_Demo(){

        frame = new JFrame("Swing Example");
        frame.setLayout(null);

        text = new JTextField();
        text.setBounds(100,100,200,30);

        button = new JButton("Click");
        button.setBounds(150,150,100,30);

        label = new JLabel();
        label.setBounds(100,200,250,30);

        button.addActionListener(this);

        frame.add(text);
        frame.add(button);
        frame.add(label);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        label.setText("Hello " + text.getText());
    }

    public static void main(String[] args){
        new Swing_Basic_Demo();
    }
}
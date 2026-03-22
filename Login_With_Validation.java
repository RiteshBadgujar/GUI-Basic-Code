import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_With_Validation implements ActionListener {

    JFrame frame;
    JPanel top, center, bottom;

    JTextField user;
    JPasswordField pass;
    JButton login, reset;
    JLabel msg;

    public Login_With_Validation(){

        frame = new JFrame("Login");
        frame.setLayout(new BorderLayout());

        // Top Panel
        top = new JPanel();
        top.add(new JLabel("Login Form"));

        // Center Panel
        center = new JPanel(new GridLayout(2,2));

        center.add(new JLabel("Username:"));
        user = new JTextField(10);
        center.add(user);

        center.add(new JLabel("Password:"));
        pass = new JPasswordField(10);
        center.add(pass);

        // Bottom Panel
        bottom = new JPanel();

        login = new JButton("Login");
        reset = new JButton("Reset");
        msg = new JLabel("");

        login.addActionListener(this);
        reset.addActionListener(this);

        bottom.add(login);
        bottom.add(reset);
        bottom.add(msg);

        // Add Panels
        frame.add(top, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String u = user.getText();
        String p = new String(pass.getPassword());

        if(e.getSource() == login){

            if(u.equals("") || p.equals("")){
                msg.setText("Fields cannot be empty");
            }
            else if(u.equals("ritesh") && p.equals("123")){
                msg.setText("Login Successful");
            }
            else{
                msg.setText("Invalid Login");
            }
        }

        if(e.getSource() == reset){
            user.setText("");
            pass.setText("");
            msg.setText("");
        }
    }

    public static void main(String[] args){
        new Login_With_Validation();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_To_Dashboard implements ActionListener {

    JFrame loginFrame;
    JTextField user;
    JPasswordField pass;
    JButton login;

    public Login_To_Dashboard(){

        loginFrame = new JFrame("Login");
        loginFrame.setLayout(new FlowLayout());

        user = new JTextField(15);
        pass = new JPasswordField(15);
        login = new JButton("Login");

        login.addActionListener(this);

        loginFrame.add(new JLabel("Username:"));
        loginFrame.add(user);
        loginFrame.add(new JLabel("Password:"));
        loginFrame.add(pass);
        loginFrame.add(login);

        loginFrame.setSize(300,200);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String u = user.getText();
        String p = new String(pass.getPassword());

        if(u.equals("ritesh") && p.equals("123")){

            loginFrame.dispose(); // close login

            // Dashboard Window
            JFrame dash = new JFrame("Dashboard");
            dash.setLayout(new FlowLayout());

            dash.add(new JLabel("Welcome " + u));
            dash.add(new JButton("Logout"));

            dash.setSize(300,200);
            dash.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(loginFrame,"Invalid Login");
        }
    }

    public static void main(String[] args){
        new Login_To_Dashboard();
    }
}
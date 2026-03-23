import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_Dashboard_Logout implements ActionListener {

    JFrame loginFrame, dashFrame;
    JTextField user;
    JPasswordField pass;
    JButton login, logout;

    public Login_Dashboard_Logout(){

        // Login Frame
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

        // LOGIN BUTTON
        if(e.getSource() == login){

            String u = user.getText();
            String p = new String(pass.getPassword());

            if(u.equals("admin") && p.equals("123")){

                loginFrame.dispose(); // close login

                // Dashboard Frame
                dashFrame = new JFrame("Dashboard");
                dashFrame.setLayout(new FlowLayout());

                JLabel welcome = new JLabel("Welcome " + u);
                logout = new JButton("Logout");

                logout.addActionListener(this);

                dashFrame.add(welcome);
                dashFrame.add(logout);

                dashFrame.setSize(300,200);
                dashFrame.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(loginFrame,"Invalid Login");
            }
        }

        // LOGOUT BUTTON
        if(e.getSource() == logout){

            dashFrame.dispose(); // close dashboard

            // reopen login
            new Login_Dashboard_Logout();
        }
    }

    public static void main(String[] args){
        new Login_Dashboard_Logout();
    }
}
import java.awt.*;
import java.awt.event.*;

public class LoginForm_Demo implements ActionListener {

    Frame frame;
    Label l1, l2, msg;
    TextField t1, t2;
    Button login;

    public LoginForm_Demo() {

        frame = new Frame("Login Form");
        frame.setLayout(new FlowLayout());

        l1 = new Label("Username:");
        l2 = new Label("Password:");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t2.setEchoChar('*');

        login = new Button("Login");
        msg = new Label("");

        login.addActionListener(this);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(login);
        frame.add(msg);

        frame.setSize(300,200);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if(t1.getText().equals("admin") && t2.getText().equals("123")){
            msg.setText("Login Successful");
        } else {
            msg.setText("Invalid Login");
        }
    }

    public static void main(String[] args) {
        new LoginForm_Demo();
    }
}
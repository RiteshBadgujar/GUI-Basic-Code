import java.awt.*;
import java.awt.event.*;

public class StudentForm implements ActionListener {

    Frame frame;

    Label title, nameL, ageL, cityL, msg;
    TextField nameT, ageT, cityT;
    Button submit, reset;

    public StudentForm(){

        frame = new Frame("Student Form");
        frame.setLayout(null);   // IMPORTANT

        // Title
        title = new Label("Student Registration Form");
        title.setBounds(150,50,250,30);

        // Name
        nameL = new Label("Name:");
        nameL.setBounds(100,100,80,30);

        nameT = new TextField();
        nameT.setBounds(200,100,150,30);

        // Age
        ageL = new Label("Age:");
        ageL.setBounds(100,150,80,30);

        ageT = new TextField();
        ageT.setBounds(200,150,150,30);

        // City
        cityL = new Label("City:");
        cityL.setBounds(100,200,80,30);

        cityT = new TextField();
        cityT.setBounds(200,200,150,30);

        // Buttons
        submit = new Button("Submit");
        submit.setBounds(150,260,80,30);

        reset = new Button("Reset");
        reset.setBounds(250,260,80,30);

        // Message Label
        msg = new Label("");
        msg.setBounds(150,320,250,30);

        // Events
        submit.addActionListener(this);
        reset.addActionListener(this);

        // Add Components
        frame.add(title);
        frame.add(nameL);
        frame.add(nameT);
        frame.add(ageL);
        frame.add(ageT);
        frame.add(cityL);
        frame.add(cityT);
        frame.add(submit);
        frame.add(reset);
        frame.add(msg);

        frame.setSize(500,400);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == submit){
            msg.setText("Submitted: " + nameT.getText());
        }

        if(e.getSource() == reset){
            nameT.setText("");
            ageT.setText("");
            cityT.setText("");
            msg.setText("Reset Done");
        }
    }

    public static void main(String[] args){
        new StudentForm();
    }
}
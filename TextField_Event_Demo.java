import java.awt.*;
import java.awt.event.*;

public class TextField_Event_Demo implements ActionListener {

    Frame frame;
    TextField text;
    Label label;
    Button btn;

    public TextField_Event_Demo(){

        frame = new Frame("TextField Example");
        frame.setLayout(null);   // IMPORTANT

        text = new TextField();
        text.setBounds(150,100,200,30);

        btn = new Button("Show");
        btn.setBounds(200,150,100,30);

        label = new Label();
        label.setBounds(150,200,250,30);

        btn.addActionListener(this);

        frame.add(text);
        frame.add(btn);
        frame.add(label);

        frame.setSize(500,400);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        label.setText("You entered: " + text.getText());
    }

    public static void main(String[] args){
        new TextField_Event_Demo();
    }
}
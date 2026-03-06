import java.awt.*;
import java.awt.event.*;

public class Button_Event_Demo implements ActionListener {

    Frame frame;
    Panel panel;
    Button button;
    Label label;

    public Button_Event_Demo(){

        frame = new Frame("Button Event Example");
        panel = new Panel();

        button = new Button("Click Me");
        label = new Label("Button not clicked");

        button.addActionListener(this);

        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setSize(400,200);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        label.setText("Button Clicked!");
    }

    public static void main(String[] args){
        new Button_Event_Demo();
    }
}
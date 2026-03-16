import java.awt.*;
import java.awt.event.*;

public class Calculator_UI {

    Frame frame;
    TextField display;

    public Calculator_UI(){

        frame = new Frame("Calculator");
        frame.setLayout(new BorderLayout());

        display = new TextField();
        frame.add(display, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4,4));

        String buttons[] = {
            "7","8","9","+",
            "4","5","6","-",
            "1","2","3","*",
            "0","=","C","/"
        };

        for(String b : buttons){
            panel.add(new Button(b));
        }

        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(300,400);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new Calculator_UI();
    }
}
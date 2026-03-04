import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.GridLayout;


public class GridLayout_Demo{
    
    Frame frame;
    Panel panel;

    public GridLayout_Demo(){

        frame = new Frame("Grid Layout Example");

        panel = new Panel();
        panel.setLayout(new GridLayout());   // Set FlowLayout

        panel.add(new Button("One "));
        panel.add(new Button("Two"));
        panel.add(new Button("Three"));

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);


    }
    public static void main(String[] args) {
        
        new GridLayout_Demo();
    }

}
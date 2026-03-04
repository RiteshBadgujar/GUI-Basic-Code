import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.FlowLayout;


public class FlowLayout_Demo{
    
    Frame frame;
    Panel panel;

    public FlowLayout_Demo(){

        frame = new Frame("FlowLayout Example");

        panel = new Panel();
        panel.setLayout(new FlowLayout());   // Set FlowLayout

        panel.add(new Button("One"));
        panel.add(new Button("Two"));
        panel.add(new Button("Three"));

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);


    }
    public static void main(String[] args) {
        
        new FlowLayout_Demo();
    }


}
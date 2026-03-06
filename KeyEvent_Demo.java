import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class KeyEvent_Demo {
    JFrame f;
    JPanel p;
    JLabel lbl;
    JTextField txt;
 
    public KeyEvent_Demo()
    {
        f = new JFrame();
        p = new JPanel();
        lbl = new JLabel("Enter the Value :");
        txt =new JTextField();
        f.add(p);
        p.setLayout(null);

        lbl.setBounds(50,50,150,50);
        p.add(lbl);

        txt.setBounds(50,100,100,30);
        p.add(txt);

        
        txt.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
            JOptionPane.showMessageDialog(null, "Key Press");
            }
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
            
        });

        f.setSize(500,500);
        f.setVisible(true);

    }
    public static void main(String[] args) {

        new KeyEvent_Demo();
        
    }
    
}

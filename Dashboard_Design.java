import javax.swing.*;
import java.awt.*;

public class Dashboard_Design {

    JFrame frame;
    JPanel sidePanel, mainPanel;

    public Dashboard_Design(){

        frame = new JFrame("Dashboard");
        frame.setLayout(new BorderLayout());

        // Menu Bar
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem logout = new JMenuItem("Logout");

        file.add(logout);
        mb.add(file);
        frame.setJMenuBar(mb);

        // Side Panel
        sidePanel = new JPanel();
        sidePanel.setLayout(new GridLayout(3,1));

        sidePanel.add(new JButton("Home"));
        sidePanel.add(new JButton("Profile"));
        sidePanel.add(new JButton("Settings"));

        // Main Panel
        mainPanel = new JPanel();
        mainPanel.add(new JLabel("Welcome to Dashboard"));

        // Add to Frame
        frame.add(sidePanel, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new Dashboard_Design();
    }
}
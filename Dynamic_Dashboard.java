import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dynamic_Dashboard implements ActionListener {

    JFrame frame;
    JPanel sidePanel, mainPanel;

    JButton home, profile, settings;

    public Dynamic_Dashboard() {

        frame = new JFrame("Dynamic Dashboard");
        frame.setLayout(new BorderLayout());

        // Side Panel
        sidePanel = new JPanel();
        sidePanel.setLayout(new GridLayout(3, 1));

        home = new JButton("Home");
        profile = new JButton("Profile");
        settings = new JButton("Settings");

        home.addActionListener(this);
        profile.addActionListener(this);
        settings.addActionListener(this);

        sidePanel.add(home);
        sidePanel.add(profile);
        sidePanel.add(settings);

        // Main Panel
        mainPanel = new JPanel();
        mainPanel.add(new JLabel("Welcome"));

        // Add Panels
        frame.add(sidePanel, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        mainPanel.removeAll(); // clear old content

        if (e.getSource() == home) {
            mainPanel.add(new JLabel("Home Screen"));
        }

        if (e.getSource() == profile) {
            mainPanel.add(new JLabel("Profile Screen"));
        }

        if (e.getSource() == settings) {
            mainPanel.add(new JLabel("Settings Screen"));
        }

        mainPanel.revalidate(); // refresh
        mainPanel.repaint(); // redraw
    }

    public static void main(String[] args) {
        new Dynamic_Dashboard();
    }
}
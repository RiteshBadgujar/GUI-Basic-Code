//import java.awt.*;
import javax.swing.*;

class GUIDemo1 {

    JFrame f;
    JPanel p;
    JLabel lblUsername, lblPassword;
    JTextField txtId, txtPassword;
    JButton bSubmit;
    JRadioButton rbMale, rbFemale, rbOther;
    ButtonGroup bg;
	JLabel lblDoc;
	JCheckBox chkPan,chkLc,chkAadhar,chkId;


    public GUIDemo1() {

        f = new JFrame();
        p = new JPanel();
        p.setLayout(null);

        lblUsername = new JLabel("Enter Username:");
        lblPassword = new JLabel("Enter Password:");

        txtId = new JTextField();
        txtPassword = new JTextField();

        bSubmit = new JButton("Login");

        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        rbOther = new JRadioButton("Other");

	lblDoc = new JLabel("Select The Document");

	chkAadhar = new JCheckBox("Aadhar");
	chkPan = new JCheckBox("Pan Card");
	chkLc = new JCheckBox("Lc");
	chkId = new JCheckBox("Id");

        bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);
        bg.add(rbOther);

        lblUsername.setBounds(50, 50, 100, 30);
        txtId.setBounds(50, 90, 150, 30);

        lblPassword.setBounds(50, 130, 150, 30);
        txtPassword.setBounds(50, 170, 150, 30);

        rbMale.setBounds(50, 210, 60, 30);
        rbFemale.setBounds(120, 210, 70, 30);
        rbOther.setBounds(200, 210, 70, 30);
	
	lblDoc.setBounds(50,250,150,50);
	
	chkAadhar.setBounds(50,310,70,50);
	chkId.setBounds(130,310,70,50);

	chkLc.setBounds(50,370,70,50);
	chkPan.setBounds(130,370,100,50);
	
	

        bSubmit.setBounds(160,430, 100, 30);

        // add components
        p.add(lblUsername);
        p.add(txtId);
        p.add(lblPassword);
        p.add(txtPassword);
        p.add(rbMale);
        p.add(rbFemale);
        p.add(rbOther);
	p.add(lblDoc);
	p.add(chkAadhar);
	p.add(chkLc);
	p.add(chkId);
	p.add(chkPan);
        p.add(bSubmit);


        f.add(p);
        f.setSize(500, 700);
        f.setLocation(300, 100);
        f.setTitle("GUI Demo");
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new GUIDemo1();
    }
}

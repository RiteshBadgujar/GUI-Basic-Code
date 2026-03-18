import java.awt.*;
import java.awt.event.*;

public class MenuBar_Demo {

    Frame frame;
    MenuBar mb;
    Menu file, edit, help;
    MenuItem open, save, exit;

    public MenuBar_Demo(){

        frame = new Frame("Menu Bar Demo");

        mb = new MenuBar();

        file = new Menu("File");
        edit = new Menu("Edit");
        help = new Menu("Help");

        open = new MenuItem("Open");
        save = new MenuItem("Save");
        exit = new MenuItem("Exit");

        file.add(open);
        file.add(save);
        file.add(exit);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        frame.setMenuBar(mb);

        frame.setSize(400,300);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new MenuBar_Demo();
    }
}

import javax.swing.*;

public class Q18_MenuBarDemo{

    public static void main(String[] args){

        JFrame f = new JFrame();

        JMenuBar bar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(open);
        file.add(save);
        file.add(exit);

        bar.add(file);
        bar.add(edit);

        f.setJMenuBar(bar);

        exit.addActionListener(e->System.exit(0));

        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

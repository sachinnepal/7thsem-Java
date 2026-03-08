
import javax.swing.*;

public class Q11_SwingComponents{
    public static void main(String[] args){

        JFrame f = new JFrame("Swing Demo");

        JPanel p = new JPanel();

        JLabel label = new JLabel("Name:");
        JTextField tf = new JTextField(10);
        JButton btn = new JButton("Submit");

        p.add(label);
        p.add(tf);
        p.add(btn);

        f.add(p);

        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

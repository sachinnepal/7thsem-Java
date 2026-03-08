
import javax.swing.*;
import java.awt.*;

public class Q15_GridBagLayoutDemo{
    public static void main(String[] args){

        JFrame f = new JFrame();
        f.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.gridx=0; c.gridy=0;
        f.add(new JButton("Button1"),c);

        c.gridx=1; c.gridy=0;
        f.add(new JButton("Button2"),c);

        c.gridx=0; c.gridy=1;
        c.gridwidth=2;
        f.add(new JButton("Wide Button"),c);

        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

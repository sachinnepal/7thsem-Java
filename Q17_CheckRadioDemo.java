
import javax.swing.*;
import java.awt.event.*;

public class Q17_CheckRadioDemo{

    public static void main(String[] args){

        JFrame f = new JFrame();

        JCheckBox java = new JCheckBox("Java");
        JCheckBox python = new JCheckBox("Python");

        JRadioButton c = new JRadioButton("C++");
        JRadioButton js = new JRadioButton("JavaScript");

        ButtonGroup g = new ButtonGroup();
        g.add(c); g.add(js);

        JLabel label = new JLabel();

        java.setBounds(50,50,100,30);
        python.setBounds(50,80,100,30);
        c.setBounds(50,110,100,30);
        js.setBounds(50,140,120,30);
        label.setBounds(50,180,200,30);

        ActionListener update = e->{
            label.setText("Selected");
        };

        java.addActionListener(update);
        python.addActionListener(update);
        c.addActionListener(update);
        js.addActionListener(update);

        f.add(java); f.add(python); f.add(c); f.add(js); f.add(label);

        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}

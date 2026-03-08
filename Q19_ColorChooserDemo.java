
import javax.swing.*;
import java.awt.*;

public class Q19_ColorChooserDemo{

    public static void main(String[] args){

        JFrame f = new JFrame();
        JPanel panel = new JPanel();

        JButton btn = new JButton("Choose Color");

        btn.addActionListener(e->{
            Color c = JColorChooser.showDialog(f,"Select Color",Color.WHITE);
            panel.setBackground(c);
        });

        panel.add(btn);
        f.add(panel);

        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

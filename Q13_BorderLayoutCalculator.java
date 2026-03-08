
import javax.swing.*;
import java.awt.*;

public class Q13_BorderLayoutCalculator{
    public static void main(String[] args){

        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());

        f.add(new JButton("North"),BorderLayout.NORTH);
        f.add(new JButton("South"),BorderLayout.SOUTH);
        f.add(new JButton("East"),BorderLayout.EAST);
        f.add(new JButton("West"),BorderLayout.WEST);
        f.add(new JButton("Center"),BorderLayout.CENTER);

        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

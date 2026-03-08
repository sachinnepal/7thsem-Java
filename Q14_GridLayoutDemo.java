
import javax.swing.*;
import java.awt.*;

public class Q14_GridLayoutDemo{
    public static void main(String[] args){

        JFrame f = new JFrame();
        f.setLayout(new GridLayout(3,3));

        for(int i=1;i<=9;i++){
            f.add(new JButton(""+i));
        }

        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

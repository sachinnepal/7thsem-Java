
import javax.swing.*;
import java.awt.*;

public class Q12_FlowLayoutDemo{
    public static void main(String[] args){

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());

        for(int i=1;i<=5;i++){
            f.add(new JButton("Button "+i));
        }

        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

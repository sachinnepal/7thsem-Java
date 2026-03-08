
import javax.swing.*;
import java.awt.event.*;

public class Q20_MouseAdapterDemo{

    public static void main(String[] args){

        JFrame f = new JFrame();
        JLabel label = new JLabel("Hover or Click Me");

        label.setBounds(100,80,200,30);

        label.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                label.setText("Mouse Clicked");
            }

            public void mouseEntered(MouseEvent e){
                label.setText("Mouse Entered");
            }
        });

        f.add(label);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}

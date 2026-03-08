
import javax.swing.*;
import java.awt.event.*;

public class Q21_CloseConfirmation{

    public static void main(String[] args){

        JFrame f = new JFrame();

        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                int result = JOptionPane.showConfirmDialog(f,"Exit?","Confirm",JOptionPane.YES_NO_OPTION);

                if(result==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });

        f.setVisible(true);
    }
}

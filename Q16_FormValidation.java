
import javax.swing.*;
import java.awt.event.*;

public class Q16_FormValidation{

    public static void main(String[] args){

        JFrame f = new JFrame("Form");

        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();
        JTextArea area = new JTextArea();

        JButton btn = new JButton("Submit");

        user.setBounds(50,30,200,30);
        pass.setBounds(50,70,200,30);
        area.setBounds(50,110,200,60);
        btn.setBounds(50,180,100,30);

        btn.addActionListener(e->{
            if(user.getText().isEmpty() || pass.getPassword().length==0 || area.getText().isEmpty()){
                JOptionPane.showMessageDialog(f,"Fields cannot be empty");
            }else{
                JOptionPane.showMessageDialog(f,"Submitted");
            }
        });

        f.add(user); f.add(pass); f.add(area); f.add(btn);

        f.setSize(320,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

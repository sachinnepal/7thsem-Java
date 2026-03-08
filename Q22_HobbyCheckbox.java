
import javax.swing.*;
import java.awt.event.*;

public class Q22_HobbyCheckbox{

    public static void main(String[] args){

        JFrame f = new JFrame();

        JCheckBox music = new JCheckBox("Music");
        JCheckBox sports = new JCheckBox("Sports");
        JCheckBox coding = new JCheckBox("Coding");

        JLabel label = new JLabel();

        music.setBounds(50,50,100,30);
        sports.setBounds(50,80,100,30);
        coding.setBounds(50,110,100,30);
        label.setBounds(50,150,200,30);

        ActionListener update = e->{
            String text="Hobbies: ";
            if(music.isSelected()) text+="Music ";
            if(sports.isSelected()) text+="Sports ";
            if(coding.isSelected()) text+="Coding ";
            label.setText(text);
        };

        music.addActionListener(update);
        sports.addActionListener(update);
        coding.addActionListener(update);

        f.add(music); f.add(sports); f.add(coding); f.add(label);

        f.setSize(300,220);
        f.setLayout(null);
        f.setVisible(true);
    }
}

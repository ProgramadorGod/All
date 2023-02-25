import javax.swing.*;
import java.awt.event.*;

public class Inzane extends JFrame implements ActionListener {
    JButton button1;
    public Inzane(){
        setLayout(null);
        button1 = new JButton("Close");
        button1.setBounds(300,250,100,30);
        add(button1);
        button1.addActionListener(this);
    }
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            System.exit(0);

        }
     };



    public static void main(String[] args) {
        Inzane Insane1 = new Inzane();
        Insane1.setBounds(0,0, 450,350);
        Insane1.setVisible(true);
        Insane1.setResizable(false);
        Insane1.setLocationRelativeTo(null);



    }


}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGB extends JFrame implements ActionListener,ItemListener{

    private JLabel Label1,Label2,Label3;
    private JButton Button1;
    private JComboBox Combo1,Combo2,Combo3;

    public RGB(){
        Label1 = new JLabel("RED: ");
        Label1.setBounds(10,10,100,25);
        add(Label1);
        Label2 = new JLabel("BLUE: ");
        Label2.setBounds(10,70,100,25);
        add(Label2);
        Label3 = new JLabel("YELLOW: ");
        Label3.setBounds(10,40,100,25);
        add(Label3);
        Button1 = new JButton("MIX");
        Button1.setBounds(10,100,75,25);
        add(Button1);
        Button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void itemStateChanged(ItemEvent e) {

    }

    public static void main(String[] args) {
        RGB a = new RGB();
        a.setLayout(null);
        a.setVisible(true);
        a.setResizable(false);
        a.setBounds(0,0,500,700);
        a.setLocationRelativeTo(null);

    }
}

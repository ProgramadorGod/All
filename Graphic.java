import javax.swing.*;
import java.awt.event.*;
public class Graphic extends JFrame implements ActionListener{
    JButton Button1,Button2,Button3;
    JLabel Label1;
    public Graphic() {
        setLayout(null);
        Button1 = new JButton("Button 1");
        Button1.setBounds(10,100,100,50);
        add(Button1);
        Button1.addActionListener(this);
        Button2 = new JButton("Button 2");
        Button2.setBounds(150,100,100,50);
        add(Button2);
        Button2.addActionListener(this);
        Button3 = new JButton("Button 3");
        Button3.setBounds(300,100,100,50);
        add(Button3);
        Button3.addActionListener(this);
        Label1 = new JLabel("YeahBuddy");
        Label1.setBounds(10,10,400,30);
        add(Label1);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == Button1){
            Label1.setText("You've Chosen Option 1");

        } else if (e.getSource()==Button2) {
            Label1.setText("You've Chosen Option 2");
        } else if (e.getSource()==Button3) {
            Label1.setText("You've Chosen Option 3");
        }
    }
    public static void main(String[] args) {
        Graphic a  = new Graphic();
        a.setBounds(0,0,450,300);
        a.setResizable(false);
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }

}

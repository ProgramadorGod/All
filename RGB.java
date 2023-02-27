import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RGB extends JFrame implements ActionListener,ItemListener{
    static int red=0,yellow =0,blue= 0;
    public static int[] RGB2 = new int[3];
    public ArrayList<Integer> List1 = new ArrayList<>();
    private JLabel Label1,Label2,Label3;
    private JButton Button1;
    private JComboBox<Integer> Combo1,Combo2,Combo3;

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
        Combo1 = new JComboBox<>();
        for (int i = 0; i < 256; i++) {
            Combo1.addItem(i);
        }
        Combo1.setBounds(100,10,100,25);
        Combo1.addItemListener(this);
        add(Combo1);
        Combo2 = new JComboBox<>();
        for (int i = 0; i < 256; i++) {
            Combo2.addItem(i);
        }
        Combo2.addItemListener(this);
        Combo2.setBounds(100,38,100,25);
        add(Combo2);
        Combo3 = new JComboBox<>();
        for (int i = 0; i < 256; i++) {
            Combo3.addItem(i);
        }
        Combo3.setBounds(100,69,100,25);
        Combo3.addItemListener(this);
        add(Combo3);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Button1){
            Color color1 = new Color(red,yellow,blue);

            Button1.setBackground(color1);

        }
    }

    public void itemStateChanged(ItemEvent e) {
        Object a = e.getSource();
        red = (int) Combo1.getSelectedItem();
        yellow = (int) Combo2.getSelectedItem();
        blue = (int) Combo3.getSelectedItem();
        RGB2[0] = red;
        RGB2[1] = yellow;
        RGB2[2] = blue;
//        System.out.print("RGB: " + RGB2[0] + RGB2[1] + RGB2[2]);
        Color color1 = new Color(RGB2[0],RGB2[1],RGB2[2]);





    }

    public static void main(String[] args) {
        RGB a = new RGB();
        a.List1.add(1);
        RGB2[0] = red;
        RGB2[1] = yellow;
        RGB2[2] = blue;


//        System.out.println(a.List1);
        a.setLayout(null);
        a.setVisible(true);
        a.setResizable(false);
        a.setBounds(0,0,500,700);
        a.setLocationRelativeTo(null);

    }
}

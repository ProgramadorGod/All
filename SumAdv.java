import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SumAdv extends JFrame implements ActionListener, ItemListener {
    private final JLabel Label1,Label2,Label3,Label4;
    private final JButton Button1;
    private final JTextField Field1,Field2;
    private final JComboBox<String> Combo1;

    public SumAdv(){
        Combo1 = new JComboBox<>();
        Combo1.setBounds(200,11,100,25);
        add(Combo1);
        Combo1.addItem("BLUE");
        Combo1.addItem("RED");
        Combo1.addItem("YELLOW");
        Combo1.addItemListener(this);
        Label1 = new JLabel("Number 1: ");
        Label1.setBounds(10,10,100,25);
        add(Label1);
        Label2 = new JLabel("Number 2: ");
        Label2.setBounds(10,40,100,25);
        add(Label2);
        Label3 = new JLabel("Result: ");
        Label3.setBounds(90,70,100,25);
        add(Label3);
        Label4 = new JLabel("");
        Label4.setBounds(140,70,100,25);
        add(Label4);
        Field1 = new JTextField();
        Field1.setBounds(80,11,100,25);
        add(Field1);
        Field2 = new JTextField();
        Field2.setBounds(80,39,100,25);
        add(Field2);
        Button1 = new JButton("CALC");
        Button1.addActionListener(this);
        Button1.setBounds(10,70,65,25);
        add(Button1);
        setTitle("CALCULATOR");

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Button1){
            int num1,num2,num3;
            num1 = Integer.parseInt(Field1.getText());
            num2 = Integer.parseInt(Field2.getText());
            num3 = num1+num2;
            Label4.setText(String.valueOf(num3));
        }
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == Combo1){
            String selection = Combo1.getSelectedItem().toString();
            setTitle(selection);
        }
    }

    public static void main(String[] args) {
        SumAdv S = new SumAdv();
        S.setLayout(null);
        S.setVisible(true);
        S.setBounds(0,0,340,150);
        S.setLocationRelativeTo(null);


    }

}


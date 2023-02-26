import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Area;

public class Scrolling extends JFrame implements ActionListener{
    private JTextField Field1;
    private JTextArea Area1;
    private JButton Button1;
    private JScrollPane Pane1;
    String Texxto = "",Texxto2 = "";

    public Scrolling(){
        setLayout(null);
        Field1 = new JTextField();
        Field1.setBounds(10,10,500,25);
        add(Field1);
        Area1 = new JTextArea();
        Pane1  = new JScrollPane(Area1);
        Pane1.setBounds(10,100,500,500);
        add(Pane1);
        Button1 = new JButton("INSERT DOWN");
        Button1.setBounds(160,42,200,50);
        Button1.addActionListener(this);
        add(Button1);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Button1){
            Texxto = Field1.getText();
            Texxto2 = Area1.getText();
            Area1.setText(Texxto2 + "\n" + Texxto);



        }

    }

    public static void main(String[] args) {
        Scrolling a  = new Scrolling();
        a.setLayout(null);
        a.setVisible(true);
        a.setResizable(false);
        a.setBounds(0,0,535,650);
        a.setLocationRelativeTo(null);

    }


}

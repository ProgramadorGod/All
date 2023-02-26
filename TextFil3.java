import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFil3 extends JFrame implements ActionListener{
    JTextField Field1;
    JButton Button1;
    JLabel Label1;
    public TextFil3(){
        setLayout(null);
        Field1 = new JTextField();
        Field1.setBounds(200,10,200,25);
        add(Field1);

        Label1 = new JLabel("Insert your text: ");
        Label1.setBounds(50,10,200,25);
        add(Label1);

        Button1 = new JButton("DONE");
        Button1.setBounds(50,60,200,25);
        Button1.addActionListener(this);
        add(Button1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Button1){
            String Texxt = "";
            Texxt = Field1.getText();
            setTitle(Texxt);
        }
    }


    public static void main(String[] args) {
        TextFil3 a = new TextFil3();
        a.setBounds(0,0,600,500);
        a.setLayout(null);
        a.setResizable(false);
        a.setVisible(true);
        a.setLocationRelativeTo(null);

    }

}

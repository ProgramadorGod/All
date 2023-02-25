import javax.swing.*;
import javax.swing.text.LabelView;


public class Formulary2 extends JFrame{
    private JLabel Label1;
    private JLabel Label2;

    public Formulary2(){
        setLayout(null);
        Label1 = new JLabel("YEAH BUDDYY");
        Label1.setBounds(0,0,100,100);
        add(Label1);
    };

    public static void main(String[] args) {
        Formulary2 formulary = new Formulary2();
        formulary.setBounds(0,0,400,550);
        formulary.setVisible(true);
        formulary.setLocationRelativeTo(null);
        formulary.setResizable(false);


    }

}

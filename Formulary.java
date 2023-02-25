import javax.swing.*;

public class Formulary extends JFrame{
    private JLabel Label1;
    public Formulary() {

        setLayout(null);
        Label1 = new JLabel("YEAHHHHHH BUDDY !! ");
        Label1.setBounds(10, 20, 200, 300);
        add(Label1);
    }

    public static void main(String[] args) {
        Formulary Formulary1 = new Formulary();
        Formulary1.setBounds(0,0,400,300);
        Formulary1.setVisible(true);
        Formulary1.setLocationRelativeTo(null);
    }

}
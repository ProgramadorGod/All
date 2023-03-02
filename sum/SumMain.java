package sum;
import java.util.Scanner;

public class SumMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me the first value: ");
        int a,b = 0;
        a = in.nextInt();
        System.out.print("Give me the second value: ");
        b = in.nextInt();

        Sum xd = new Sum(a,b);
        xd.Print();

    }
}


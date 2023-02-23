import java.sql.Array;
import java.util.*;

public class FibonacciZecuence {
    public static void main(String[] args){
        int num_1 = 1;
        int ChangeValue = 98;
        ArrayList<Integer> MyNewArray1 = new ArrayList<Integer>();

        int Fat = 0;


        for (int i = 0; i<204; i++){
            MyNewArray1.add(num_1);
            Fat = MyNewArray1.size();
//            System.out.println(Fat);
            if (Fat % 2 == 0){
                num_1 -= ChangeValue;
            }else{
                num_1+= ChangeValue;
            };
            ChangeValue-=1;
        }

        System.out.println("Random Succession: "+MyNewArray1 + "\n");
        System.out.println("FIBONACCI SUCCESSION: ");
        ArrayList<Integer> ARRAY2  = new ArrayList<Integer>();

        ARRAY2.add(0);
        int FIBO_1 = 0, FIBO_2 = 1;
        for (int i = 0; i<=30; i++){
            ARRAY2.add(FIBO_1+FIBO_2);
            Fat = ARRAY2.size();

            FIBO_1 = ARRAY2.get(Fat-1);
            FIBO_2 = ARRAY2.get(Fat-2);
//            System.out.println(FIBO_1);

            System.out.println(ARRAY2);

        }





    }
}

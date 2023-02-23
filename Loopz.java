import java.util.*;

public class Loopz {
    public static void main(String[] args){
        System.out.println("\n==================================================================");
        System.out.println("Welcome, this is a 'loops code', i'm just gonna practice a little ");
        System.out.println("==================================================================\n");
        ArrayList<String> myArrayList = new ArrayList<>();
        String xd = "Number : ";
        for (int i = 0; i<=5; i++){

            myArrayList.add(xd + i);
        }
        System.out.println("'For' Loop : \n"+myArrayList);
        System.out.println("\n");

        int a = 0;

        System.out.println("'While' Loop:  ");
        while (a<=10){

            System.out.println("'a' it's equal to : "+ a);
            a+=2;

        };

        System.out.println("\n'Do while' Loop:");

        int b = 50;
        ArrayList<Integer> myArrayList2;
        myArrayList2 = new ArrayList<Integer>();

        do{
            System.out.println("'B' it's equal to " + b);

            myArrayList2.add(b);
            b-=5;
        }while(b >= 30);

        System.out.println("B List  = " + myArrayList2);



    }

}

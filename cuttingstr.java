import java.util.*;
public class cuttingstr {

    public static void main(String[]args){
        String word ="AEIOU XDD", substrac ="";
        System.out.println("The string is: "+ word);
        System.out.println("\n");
        int fat = word.length();
        System.out.println("IMPORTANT: ");
        System.out.println("The string have "+ fat +" Characters");
        System.out.println("The range that u choose will be the result, the rest of the word it's gonna be deleted");
        System.out.println("The min range is 0 and the max is "+ fat );
        System.out.println("The since can't be bigger than the until");
        System.out.println("");
        System.out.print("SINCE which character do u wanna cut: ");
//        System.out.println("");
        Scanner in  = new Scanner(System.in);
        int since =0, til = 0;
        since = in.nextInt();
        System.out.print("UNTIL which character do u wanna cut: ");

        til = in.nextInt();
        substrac = word.substring(since,til);

        System.out.print(substrac);



    }
}

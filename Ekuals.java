import java.util.Scanner;

public class Ekuals {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        System.out.print("Please, insert the first name: ");
//        String Name_1 ="",Name_2 = "";
//        Name_1 = in.nextLine();
//        System.out.print("Please, insert the second name: ");
//        Name_2 = in.nextLine();
//
//        if (Name_1.equalsIgnoreCase(Name_2)){
//            System.out.println("The names are equals");
//        }else{
//            System.out.println("The names are different ");
//        };

        System.out.println("=======================================================");
        System.out.println("                THIS IS A LOGIN PROGRAM               ");
        System.out.println("=======================================================\n");

        String USER= "",PASSWORD = "";
        System.out.print("INSERT YOUR USERNAME: ");
        USER = in.nextLine();
        System.out.print("INSERT YOUR PASSWORD: ");
        PASSWORD = in.nextLine();

        String TRUEUS = "LUISGOD", TRUEPAS = "YEAHBUDDY";

        if(USER.equalsIgnoreCase(TRUEUS) && PASSWORD.equalsIgnoreCase(TRUEPAS)){
            System.out.println("YOU'VE LOGGED SUCCESSFULLY");

        } else if (USER.equalsIgnoreCase(TRUEUS)) {
            System.out.println("The password it's incorrect");

        }else{
            System.out.println("This user it's not registered");
        }




    }
}

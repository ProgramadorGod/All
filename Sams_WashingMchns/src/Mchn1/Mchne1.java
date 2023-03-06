package Mchn1;
import Library.SamsungWasher;

import java.util.Scanner;

public class Mchne1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("The clothes are white or color type: ");
        System.out.println("Give 1 - White Clothes, Give 2 - Color Clothes");
        int ClotheKind = in.nextInt();
        System.out.print("How much Kgs?: ");
        int Kgs = in.nextInt();


        SamsungWasher a = new SamsungWasher(Kgs, ClotheKind);
//        a.setClotheKind(2);
//        a.setKgs(a.getKgs()+1);
        a.CicleDone();







    }
}

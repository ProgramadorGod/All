package Homework;

import java.util.Scanner;

public class Dating {
    private String name, address, occupation, speciality;



    private int age, intermediate;

    public Dating(String name,int age, String address,String occupation){
        this.name = name;
        this.age = age;
        this.address = address;
        this.occupation = occupation;

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the kind of user: 1 (Patient) / 2(Doctor) ");
        intermediate = in.nextInt();

        if (intermediate == 1){
            occupation = "Patient";
        } else if (intermediate == 2) {
            occupation = "Doctor";
        }

        if (occupation == "Patient"){
            System.out.println("Inserting new patient...");
            Patient a = new Patient();
        }



    }


}

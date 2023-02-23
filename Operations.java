import java.text.DecimalFormat;

public class Operations {
    public static void main(String[] args) {

        DecimalFormat format1 = new DecimalFormat("#.##");
        float num_1 = 5, num_2 = 3;
        float result = 0;
        int parameter = 3;
        String Rta = "";

        switch(parameter){
            case 1: result = num_1+num_2;
            Rta = "La suma es: ";
                break;

            case 2: result = num_1-num_2;
            Rta  = "La resta es : ";
                break;

            case 3: result = num_1*num_2;
                Rta  = "La multiplicación es : ";
                break;

            case 4: result = num_1/num_2;
                Rta  = "La división es : ";
                break;

            default:
                System.out.println("ERROR! The option doesn't exist");
                break;
        }

        System.out.println(Rta + format1.format(result));




    }
}
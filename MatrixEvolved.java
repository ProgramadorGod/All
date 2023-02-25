import java.util.*;
public class MatrixEvolved {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("Matrix Creation Program");
        System.out.println("========================");

        Scanner in = new Scanner(System.in);
        System.out.print("Insert the rows of the matrix: ");
        int rows = 0,columns = 0, progression = 1;
        rows = in.nextInt();
        System.out.print("Insert the columns of the matrix: ");
        columns = in.nextInt();

        int[][] matrixx = new int[rows][columns];
        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < columns; j++) {
                matrixx[i][j] = progression;
                progression+=1;
                System.out.print(" [ " + matrixx[i][j] + " ] ");

            }
            System.out.println("");
        }









    }
}

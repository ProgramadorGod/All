public class Matriz{
    public static void main(String[] args) {
        int[][] nums = new int [2][2];
        nums[0][0] = 5;
        nums[0][1] = 3;
        nums[1][0] = 2;
        nums[1][1] = 4;
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                System.out.print("[ "+nums[i][j] + " ] ");


            }
            System.out.println("");

        }

    }

}
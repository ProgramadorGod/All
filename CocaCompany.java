import java.util.Scanner;

public class CocaCompany {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String Name ="";
		System.out.println("======================================================================================================");

		System.out.println("Welcome to CocaCola's Company Program, This program is to u know the vacations days u're able to get ");
		System.out.println("======================================================================================================");
		System.out.println("");

		System.out.println("Insert your name:");
		Name = in.nextLine();
		System.out.println("Which Department Do U Belong?\n"
				+ "1: Customer Support\n"
				+ "2: Logistic Department\n"
				+ "3: Gerency \n"
				+ "Write if it's option (1/2/3)");
		int Department = 0;
		int	YrsOld= 0;
		Department = in.nextInt();
		System.out.println("Insert how much years old have u been working in the company: ");
		YrsOld = in.nextInt();
		
		if (Department == 1) {
			if(YrsOld == 1) {
				System.out.println("Congratulations "+ Name + ", You've earned 6 days off. ");
			}
			else if (YrsOld >= 2 && YrsOld <= 6) {
				System.out.println("Congratulations "+ Name + ", You've earned 14 days off. ");
			}
			else if (YrsOld > 7) {
				System.out.println("Congratulations "+ Name + ", You've earned 20 days off. ");
			}
		}
		else if (Department == 2) {
			if(YrsOld == 1) {
				System.out.println("Congratulations "+ Name + ", You've earned 7 days off. ");
			}
			else if (YrsOld >= 2 && YrsOld <= 6) {
				System.out.println("Congratulations "+ Name + ", You've earned 15 days off. ");
			}
			else if (YrsOld > 7) {
				System.out.println("Congratulations "+ Name + ", You've earned 22 days off. ");
			}
		}
		else if (Department == 3) {
			if(YrsOld == 1) {
				System.out.println("Congratulations "+ Name + ", You've earned 10 days off. ");
			}
			else if (YrsOld >= 2 && YrsOld <= 6) {
				System.out.println("Congratulations "+ Name + ", You've earned 20 days off. ");
			}
			else if (YrsOld > 7) {
				System.out.println("Congratulations "+ Name + ", You've earned 30 days off. ");
			}
		}
		else {
			System.out.println("ERROR! The department's key doesn't exist.");
		}

		
	

		
		
		
		

	}
		
		
};

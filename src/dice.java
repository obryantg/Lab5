
import java.util.*;

public class dice {

	public static void main(String[] args) {
		// created my scanner and randomizer
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();

		//initialized my variables
		String reply = "yes";
		int sides = 1;
		
		
		//created by while loop for repeated games
		while (reply.equalsIgnoreCase("yes")) {
			System.out.println("Welcome to roll dice! Please enter how many sides:");
			sides = sc.nextInt();
			sc.nextLine();
			
			//created my 'roll' method using an if statement
			reply = getRoll(sc, rdm, reply, sides);
		} System.out.println("See ya later, sucker!");

		sc.close();
	}

	public static String getRoll(Scanner sc, Random rdm, String reply, int sides) {
		int result;
		int result2;
		if (sides > 0) {
			 result = getNumbers(rdm, sides);

			 result2 = getNumbers(rdm, sides);
			System.out.println("You rolled " + result + ", " + result2);
			System.out.println("Would you like to try again? Type yes or no:");
			reply = sc.next();

		}
		else
		{
			System.out.println("sides cannot be less than 1");
			
		}
		return reply;
	}

	public static int getNumbers(Random rdm, int sides) {
		//setting a number parameter on my randomizer based on the 
		//'sides' assignment
		int result;
		result = rdm.nextInt(sides) + 1;
		return result;
	}
}

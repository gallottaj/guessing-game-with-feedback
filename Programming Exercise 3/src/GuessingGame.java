import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String[] args) {
		Random r = new Random();
		int random_number = r.nextInt(10000); // random integer between 0 and 10000
//		System.out.print(random_number + " " + ""); // to test the random integer
		int user_guess = 0;
		int eligible_range_higher = random_number + 10;
		int eligible_range_lower = random_number - 10;

		do {
			System.out.print("Enter an integer between 1 and 10000:");
			Scanner in = new Scanner(System.in);
			user_guess = in.nextInt();

			if (user_guess > random_number) // too low
				System.out.println("HIGHER!" + " " + "Try a number between" + " " + eligible_range_lower + " " + "and"
						+ " " + eligible_range_higher);
			else if (user_guess < random_number) // too high
				System.out.println("LOWER!" + " " + "Try a number between" + " " + eligible_range_lower + " " + "and"
						+ " " + eligible_range_higher);
			else // winner
				System.out.println("WINNER!");
		} while (user_guess != random_number);
	}
}

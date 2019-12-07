import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String[] args) {
		Random r = new Random();
		int random_number = r.nextInt(10000); // random integer between 0 and 10000
		Scanner in = new Scanner(System.in);
		System.out.print(random_number);
		System.out.print("Enter an integer between 1 and 10000:");
		int input = in.nextInt();

		// You Win
		if (input == random_number) {
			System.out.print("you win!");
		}

		// Too high
		if (input > random_number) {
			int eligible_range_higher = random_number + 25;
			int eligible_range_lower = random_number - 25;

			System.out.print("Too high! Hint: Enter a number between" + " " + eligible_range_lower + " " + "and" + " "
					+ eligible_range_higher);

		}

		// Too Low

		if (input < random_number) {
			System.out.print("try again");
		}
	}

}

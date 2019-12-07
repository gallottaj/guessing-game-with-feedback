import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer between 1 and 10000:");
		int input = in.nextInt();
		System.out.println("Integer between 1 and 10000 = " + getRandomIntegerBetweenRange(1, 10000));

	}

	public static double getRandomIntegerBetweenRange(double min, double max) {
		double random_number = (int) (Math.random() * ((max - min) + 1)) + min;
		return random_number;
	}
}
import java.util.Scanner;

public class Program
{
	private static final int FORTY_TWO = 42;

	public static double square(double number) {
		double t;
		double squareroot = number / 2;
		do {
			t = squareroot;
			squareroot = (t + (number / t)) / 2;
		}
		while ((t - squareroot) != 0);
		return squareroot;
	}

	public static boolean isPrime(long number) {
		long root = (long) square(number);
		for (long i = 2; i <= root; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = 0;
		long sum = 0;
		int count = 0;
		while ((number = scanner.nextInt()) != FORTY_TWO) {
			sum = 0;
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			if (isPrime(sum)){
				++count;
			}
		}
		System.out.println("Count of coffee-request - " + count);
	}
}

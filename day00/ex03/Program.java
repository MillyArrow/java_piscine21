import javax.swing.*;
import java.util.Scanner;

class Program
{
	private static final int FORTY_TWO = 42;

	private static final int TOTAL_WEEKS = 18;

	private static final int MAX_SCORE = 9;

	private static final int MIN_SCORE = 1;

	public static long reverse(long number) {
		long result = 0;
		while (number != 0)
		{
			long digit = number % 10;
			result = result * 10 + digit;
			number /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long result = 0;
		int weak = 0;
		int score = 0;
		int count = 0;
		int cond = 0;
		while ((!scanner.next().equals("42")) &&
				(weak = scanner.nextInt()) != FORTY_TWO && cond < TOTAL_WEEKS) {
			int min = 9;
			for (int i = 0; i < 5 && (score = scanner.nextInt()) >= MIN_SCORE &&
					score <= MAX_SCORE; ++i) {
				if (score < min)
					min = score;
			}
			result = result * 10 + min;
			count = 0;
			++cond;
			count += weak;
			if (cond != count) {
				System.out.println("IllegalArgument");
				System.exit(-1);
			}
		}
		result = reverse(result);
		for (int i = 1; i <= TOTAL_WEEKS && result != 0; i++) {
			System.out.printf("Week %d ", i);
			for (int k = 0; k < result % 10; k++) {
				System.out.print('=');
			}
			System.out.print(">\n");
			result /= 10;
		}
	}
}

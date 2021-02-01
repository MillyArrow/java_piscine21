public class Program
{
	private static final int NUMBER = 479598;

	public static void main(String[] args) {
		int number = NUMBER;
		int result = number % 10 + (number / 10) % 10 + (number / 100) % 10 +
				(number / 1000) % 10 + (number / 10000) % 10 + (number / 100000) % 10;
		System.out.println(result);
	}
}

public class Program
{
	public static void main(String[] args) {
		int number = 479598;
		int new_number = 0;
			while (number > 1){
			new_number += number % 10;
			number /= 10;
		}
		System.out.print(new_number);
	}
}

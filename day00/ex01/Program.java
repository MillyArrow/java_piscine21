import java.util.Scanner;

public class Program
{
	public static double square(double number){
		double t;
		double squareroot = number / 2;
		do 
		{
			t = squareroot;
			squareroot = (t + (number / t)) / 2;
		}
		while ((t - squareroot) != 0);
		return squareroot;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num < 0 || num == 0 || num == 1){
			System.out.println("Illegal Argument");
			System.exit(-1);
		}
		int half = (int)square(num);
		int count = 1;
		boolean is_prime = true;

		for(int i = 2;i <= half;i++){
			if (num % i == 0){
				is_prime = false;
				break;
			}
			++count;
		}
		System.out.print(is_prime);
		System.out.println(" " + count);
		in.close();
	}
}
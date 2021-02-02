package ex00;

public class Program
{
	public static void main(String[] args)
	{
		User Alice = new User(1, "Alice", 400);
		User John = new User(3, "John", 300);
		Transaction transaction = new Transaction(Alice, John,
				TransferType.debits, 100);
		System.out.println("User1:");
		Alice.print();
		System.out.println("User2:");
		John.print();
		System.out.println("Transaction:");
		transaction.Transfer();
		transaction.print();
	}
}
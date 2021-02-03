public class Program {
	public static void main(String[] args) {
		User John = new User(2, "John", 5000);
		User Maria = new User(3, "Maria", 200);
		User Vadim = new User(1, "Vadim", 100);

		John.print();
		Maria.print();
		Vadim.print();
		UsersArrayList usersList = new UsersArrayList();
		System.out.println("Number of Users: " + usersList.numberOfUsers());
		for (int i = 0; i < 11; i++) {
			usersList.addUser(John);
		}
		usersList.addUser(Maria);
		usersList.addUser(Vadim);

		usersList.print();
		try {
			System.out.println("Array size after adding 13 users: " + usersList.getArraySize());
			System.out.println("Number of users: " + usersList.numberOfUsers());
			System.out.println("Get User by ID: " + "User Name: " + usersList.getUserByID(3).getName());
			System.out.println("Get User by Index: " + "User Name: " + usersList.getUserByIndex(12).getName());
		} catch (UserNotFoundException e) {
			System.err.println("user not found");
		}
	}
}
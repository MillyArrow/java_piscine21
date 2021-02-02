package ex01;

public class UserIdsGenerator {
	private static UserIdsGenerator instance;

	private UserIdsGenerator() { }
	public static UserIdsGenerator getInstance(){
		if (instance == null){
			instance = new UserIdsGenerator();
		}
		return instance;
	}
}

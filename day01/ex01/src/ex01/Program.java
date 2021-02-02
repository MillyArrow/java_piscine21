package ex01;
public class Program {
	public static void main(String[] args) {
		User a;
		for(int i = 0;i < 1000;++i){
			a = new User(1,"Alice",200);
			System.out.println("User ID:" + a.getIdentifier());
		}
	}
}

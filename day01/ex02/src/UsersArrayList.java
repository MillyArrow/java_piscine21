public class UsersArrayList {
	User[] users = new User[10];
	public void addUser(User user){
		for(int i = 0; i < users.length; i++){
			if (users[i] == null){
				users[i] = user;
				break;
			}
			if (i == users.length - 1){
				User[] new_users = new User[users.length + users.length / 2];
				for(int j = 0; j < users.length; j++){
					new_users[j] = users[j];
				}
				users = new_users;
			}
		}
	}
	User getUserByID(){

	}
	User getUserByIndex(){

	}
	public Integer numberOfUsers(){
		int i = 0;
		while (users[i] != null){
			++i;
		}
		return i;
	}
}

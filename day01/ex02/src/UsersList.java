interface UsersList {
	public void addUser(User user);

	User getUserByID(Integer id) throws UserNotFoundException;

	User getUserBtIndex(Integer index) throws UserNotFoundException;

	public Integer numberOfUsers();
}

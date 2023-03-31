package service;



import dao.UserDao;

public class UserService {

	public void createUser(String email, String userId, String password, String name, String nameKana) {

		UserDao userDao = new UserDao();

		userDao.createUser(email, userId, password, name, nameKana);
	}
	public void userList(String email, String userId, String password, String name, String nameKana) {
		
		UserDao userDao = new UserDao();
		userDao.userList(email, userId, password, name, nameKana);
		
	}
}
package service;

import dao.UserDao;

public class UserService {

	public void createUser(String email, String userId, String password, String name, String nameKana) {

		UserDao userDao = new UserDao();

		userDao.createUser(email, userId, password, name, nameKana);
	}
}
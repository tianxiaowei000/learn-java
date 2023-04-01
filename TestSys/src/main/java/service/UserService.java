package service;



import java.util.List;

import dao.UserDao;
import dto.UserDto;

public class UserService {

	public void createUser(String email, String userId, String password, String name, String nameKana) {

		UserDao userDao = new UserDao();

		userDao.createUser(email, userId, password, name, nameKana);
	}
	
	/**
	 * ユーザー情報全件取得
	 * @return
	 */
	public  List<UserDto> userList() {
		
		UserDao userDao = new UserDao();
		List<UserDto> list =userDao.userList();
		return list;
		
	}
}
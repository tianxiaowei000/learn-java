package service;



import java.util.List;

import dao.UserDao;
import dto.UserDto;

public class UserService {
	UserDao userDao = new UserDao();

	public void createUser(String email, String userId, String password, String name, String nameKana) {


		userDao.createUser(email, userId, password, name, nameKana);
	}
	
	/**
	 * ユーザー情報全件取得
	 * @return
	 */
	public  List<UserDto> userList() {
		
		List<UserDto> list =userDao.userList();
		return list;
		
	}
	public void changeUserInfo(String email, String userId, String password, String name, String nameKana) {


		

		userDao.changeUser(email, userId, password, name, nameKana);
	
	}
	
	
}
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import dto.UserDto;

public class UserDao {

	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;

	private static final String URL = "jdbc:postgresql://localhost:5432/letian";
	private static final String USER = "postgres";
	private static final String PASSWORD = "Dd345678";
	
	
	
	
	/**
	 * お客様情報新規登録
	 */
	public void createUser(String email, String userId, String password, String name, String nameKana) {

		try {
				
			Class.forName("org.postgresql.Driver");

			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			
			//最終追加日
			LocalDateTime createDateTime = LocalDateTime.now();
			//最終更新日
			LocalDateTime updateDateTime = createDateTime.plusYears(1);

			//select文実行するには　executeQueryメゾット！！！
			String sql = "INSERT "
					+ "INTO user_info( "
					+ "    email "
					+ "    , user_id "
					+ "    , password "
					+ "    , name "
					+ "    , name_kana "
					+ "    , del_flag "
					+ "    , date_created "
					+ "    , date_modified "
					+ ") "
					+ "VALUES ( "
					+ "    '" + email + "' "
					+ "    , '" + userId + "' "
					+ "    , '" + password + "' "
					+ "    , '" + name + "' "
					+ "    , '" + nameKana + "' "
					+ "    ,'" + 0 + "' "
					+ "    ,'" + createDateTime + "' "
					+ "    ,'" + updateDateTime + "'); ";
			stmt.executeUpdate(sql);

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ユーザー情報全件取得
	 * @return
	 */
	public List<UserDto> userList() {

		List<UserDto> list = new ArrayList<UserDto>();
		try {

			Class.forName("org.postgresql.Driver");

			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();

			//select文実行するには　executeQueryメゾット！！！
			String sql = "select email,user_id as userId,password,name,name_kana as nameKana FROM  user_info"
					+ " where" + " del_flag" + "=" + "'0'" + ";";

			rset = stmt.executeQuery(sql);
      
			while (rset.next()) {

				list.add(new UserDto(rset.getString("email"), rset.getString("userId"), rset.getString("password"),
						rset.getString("name"), rset.getString("nameKana")));

			}
			rset.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	public void changeUser(String email, String userId, String password, String name, String nameKana) {
		try {
			
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();

			String sql = "UPDATE user_info "
					 + "set user_id =" + "'" +  userId + "'" + ",\n"	
	                    + " password =" + "'" + password + "'" + ",\n"
	                    + " name =" + "'" + name + "'" + ",\n"
	                    + " name_kana =" + "'" + nameKana + "'" + "\n"
	                    + " where email =" + "'" + email + "'" + ";";
			stmt.executeUpdate(sql);

			
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

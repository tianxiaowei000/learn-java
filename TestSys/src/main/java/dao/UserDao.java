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

	private static final String URL  = "jdbc:postgresql://localhost:5432/letian";
	private static final String USER = "postgres";
	private static final String PASSWORD = "Dd345678";

	/**
	 * お客様情報新規登録
	 * @throws ClassNotFoundException 
	 */

	public  void createUser(String email, String userId, String password, String name, String nameKana) {  

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
					+ "    , '" + 0 + "' "
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
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	public void userList(String email, String userId, String password, String name, String nameKana) {
	
		
		
		try {
			
			
			
			
            Class.forName("org.postgresql.Driver");
            List<UserDto> list = new ArrayList<UserDto>();
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
          

			//select文実行するには　executeQueryメゾット！！！
			 String sql = "select * FROM  user_info"
	                    + " where" + " del_flag"+"="+"'0'" + ";";
	            
	            rset = stmt.executeQuery(sql);
	            
	            while (rset.next()) {
					 email = rset.getString("email");
					 userId = rset.getString("userId");
					 password = rset.getString("password");
					 name = rset.getString("name");
					 nameKana = rset.getString("nameKana");
					 
					list.add(new UserDto(email,userId,password,name,nameKana));
				}
	       
	            
            rset.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}

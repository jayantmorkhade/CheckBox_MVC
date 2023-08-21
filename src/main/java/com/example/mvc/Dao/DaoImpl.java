package com.example.mvc.Dao;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.mvc.Entity.Language;
import com.example.mvc.Entity.User;
import com.example.mvc.config.Daoconfig;

@Repository
public class DaoImpl implements DaoInf {

	public List<User> getUserByAge(int age) throws SQLException, PropertyVetoException {
		List<User> users = null;
//		User user=null;
//		Connection connection=Daoconfig.getConnection();
		String sql = "SELECT * FROM users WHERE age= ? ";
//		PreparedStatement prst=connection.prepareStatement(sql);
//			prst.setInt(1, age);
//			
//			ResultSet re=prst.executeQuery();
//			while(re.next()) {
//			 user=new User();
//				user.setuserName(re.getString("userName"));
//				user.setfName(re.getString("fName"));
//				user.setlName(re.getString("lName"));
//				user.setAge(re.getInt("age"));
//				user.setcNumber(re.getString("cNumber"));
//				user.setGender(re.getString("gender"));
//				user.setCity(re.getString("city"));
//				user.setuAdd(re.getString("uAdd"));
//				user.seteMail(re.getString("eMail"));
//				//list.add(user);
//				prst.executeUpdate();
//			}
//			return user;
		try (Connection conn = Daoconfig.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				User user = new User();
				user.setuserName(rs.getString("userName"));
				user.setfName(rs.getString("fName"));
				user.setlName(rs.getString("lName"));
				user.setlName(rs.getString("lName"));
				user.setAge(rs.getInt("age"));
				user.setGender(rs.getString("gender"));
				user.setCity(rs.getString("city"));
				user.seteMail(rs.getString("eMail"));
				users.add(user);
			}
			;
		}
		return users;
	}

	@Override
	public User getuser(String userName) {
		User user = null;
//		Connection conn = null;
		String sql = "SELECT * FROM users WHERE userName = ?";
		try (Connection conn = Daoconfig.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, userName);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					user = new User();
					user.setuserName(rs.getString("userName"));
					user.setfName(rs.getString("fName"));
					user.setlName(rs.getString("lName"));
					user.setlName(rs.getString("lName"));
					user.setAge(rs.getInt("age"));
					user.setGender(rs.getString("gender"));
					user.setCity(rs.getString("city"));
					user.seteMail(rs.getString("eMail"));
					user.setcNumber(rs.getString("cNumber"));
					user.setuAdd(rs.getString("uAdd"));

				}
				rs.close();
			}
//			pstmt.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean addUser(User user) {
		boolean saved = false;

		// Connection connection = null;
		String sqlAddUser = "INSERT INTO users (userName, fname, lname, age, gender, city, email, cNumber, uAdd,language) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
		String sqlAddLang = "INSERT INTO language (lId,langName) VALUES ('0', ?)";

		try (Connection connection = Daoconfig.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(sqlAddUser);
				PreparedStatement pstmt2 = connection.prepareStatement(sqlAddUser)) {

			pstmt.setString(1, user.getuserName());
			pstmt.setString(2, user.getfName());
			pstmt.setString(3, user.getlName());
			pstmt.setInt(4, user.getAge());
			pstmt.setString(5, user.getGender());
			pstmt.setString(6, user.getCity());
			pstmt.setString(7, user.geteMail());
			pstmt.setString(8, user.getcNumber());
			pstmt.setString(9, user.getuAdd());
			pstmt.setString(10, user.getLanguage());

			// ResultSet rs = pstmt2.executeQuery();
//			while (rs.next()) {
//				for (String lang : user.getLanguage().getLangName()) {
//					pstmt2.setInt(1, user.getLanguage().getlId());
//
//					pstmt2.setString(2, lang);
//					pstmt2.execute();
//
//				}
//			}
//

//			}

			pstmt.executeUpdate();
			saved = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saved;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (Connection conn = Daoconfig.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				User user = new User();
				user.setuserName(rs.getString("userName"));
				user.setfName(rs.getString("fName"));
				user.setlName(rs.getString("lName"));
				user.setlName(rs.getString("lName"));
				user.setAge(rs.getInt("age"));
				user.setGender(rs.getString("gender"));
				user.setCity(rs.getString("city"));
				user.seteMail(rs.getString("eMail"));
				user.setcNumber(rs.getString("cNumber"));
				user.setuAdd(rs.getString("uAdd"));
				user.setLanguage(rs.getString("language"));

//				user.getLanguage().setlId(rs.getInt("lId"));
//				user.getLanguage().setLangName(rs.getString("langName"));

				users.add(user);
				System.out.println(user.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (PropertyVetoException e1) {
			e1.printStackTrace();
		}

		return users;
	}

	@Override
	public User getDetails(String userName) {
		User user = null;
		String sql = "SELECT * FROM users WHERE userName = ?";
		try (Connection conn = Daoconfig.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, userName);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					user = new User();
					user.setuserName(rs.getString("userName"));
					user.setfName(rs.getString("fName"));
					user.setlName(rs.getString("lName"));
					user.setlName(rs.getString("lName"));
					user.setAge(rs.getInt("age"));
					user.setGender(rs.getString("gender"));
					user.setCity(rs.getString("city"));
					user.seteMail(rs.getString("eMail"));
					user.setcNumber(rs.getString("cNumber"));
					user.setuAdd(rs.getString("uAdd"));

				}
			}
		} catch (SQLException | PropertyVetoException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean updateUser(User user) {
		boolean isUpdated = false;
		String sql = "UPDATE users SET fname=?, lname=?, age=?, gender=?, city=?, email = ?, cNumber=?, uAdd=? WHERE username = ?";
		try (Connection conn = Daoconfig.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, user.getfName());
			pstmt.setString(2, user.getlName());
			pstmt.setInt(3, user.getAge());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getCity());
			pstmt.setString(6, user.geteMail());

			pstmt.setString(7, user.getcNumber());
			pstmt.setString(8, user.getuAdd());
			pstmt.setString(9, user.getuserName());
			System.out.println(user);
			pstmt.executeUpdate();
			isUpdated = true;
//System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (PropertyVetoException e1) {
			e1.printStackTrace();
		}
		return isUpdated;
	}

	@Override
	public boolean deleteUser(String userName) {
		String sql = "DELETE FROM users WHERE userName = ?";
		boolean isDeleted = false;
//		Connection conn = null;
		try (Connection conn = Daoconfig.getConnection();
//			try {
//				conn = Daoconfig.getConnection();
//			} catch (PropertyVetoException e) {
//				e.printStackTrace();
//			}
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, userName);
			pstmt.executeUpdate();
			isDeleted = true;
		} catch (SQLException | PropertyVetoException e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public User getUsersByEmail(String eMail) {
		// List<User> users = new ArrayList<>();
		// Optional<User> findFirst = null;
		User user = null;

		String sql = "SELECT * FROM users WHERE eMail = ?";
		try (Connection conn = Daoconfig.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, eMail);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					user = new User();
					user.setuserName(rs.getString("userName"));
					user.setfName(rs.getString("fName"));
					user.setlName(rs.getString("lName"));
					user.setlName(rs.getString("lName"));
					user.setAge(rs.getInt("age"));
					user.setGender(rs.getString("gender"));
					user.setCity(rs.getString("city"));
					user.seteMail(rs.getString("eMail"));
					user.setcNumber(rs.getString("cNumber"));
					user.setuAdd(rs.getString("uAdd"));

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;

	}

}

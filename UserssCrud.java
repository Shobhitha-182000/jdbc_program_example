package jdbc_maven_eb_user_assignment;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class UserssCrud {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "root");
		return connection;
	}

	// for signUp
	public void saveUsers(Users users) throws Exception {
		String query = "insert into users(id,name,email,password,address) values(?,?,?,?,?)";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, users.getId());
		preparedStatement.setString(2, users.getName());
		preparedStatement.setString(3, users.getEmail());
		preparedStatement.setString(4, users.getPassword());
		preparedStatement.setString(5, users.getAddress());

		preparedStatement.execute();
		connection.close();
		System.out.println("signed successfully");

	}

	 

	// for login
	public boolean loginUsers(Users users) throws Exception {
		String query = "select * from users where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getEmail());

		ResultSet resultSet = preparedStatement.executeQuery();
		String password = null;
		while (resultSet.next()) {
			password = resultSet.getString("password");
		}
		if (users.getPassword().equals(password)) {
			return true;
		}
		return false;

	}

	// to display facebook password
	public void getFacebookPassword(Users users) throws Exception {
		String query = "select facebook from users where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getEmail());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			System.out.print("facebook password is : ");
			System.out.println(resultSet.getString("facebook"));
			String password = resultSet.getString("facebook");
			if (password == null)
				System.out.println("there is no password available");
			else
				System.out.println(password);
		}

		connection.close();

	}

	// to display instagram password
	public void getInstagramPassword(Users users) throws Exception {
		String query = "select instagram from users where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getEmail());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			System.out.print("instagram password is : ");
			System.out.println(resultSet.getString("instagram"));
			String password = resultSet.getString("instagram");
			if (password == null)
				System.out.println("there is no password available");
			else
				System.out.println(password);

		}

		connection.close();

	}

	// to display snapchat password
	public void getSnapchatPassword(Users users) throws Exception {
		String query = "select snapchat from users where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getEmail());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			System.out.print("snapchat password : ");
			System.out.println(resultSet.getString("snapchat password"));
			String password = resultSet.getString("snapchat");
			if (password == null)
				System.out.println("there is no password available");
			else
				System.out.println(password);
		}

		connection.close();

	}

	// to display whatsapp
	public void getWhatsappPassword(Users users) throws Exception {
		String query = "select whatsapp from users where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getEmail());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			System.out.print("whatsapp password : ");
			System.out.println(resultSet.getString("whatsapp password"));
			String password = resultSet.getString("whatsapp");
			if (password == null)
				System.out.println("there is no password available");
			else
				System.out.println(password);

		}

		connection.close();

	}

	// to display twitter
	public void getTwitterPassword(Users users) throws Exception {
		String query = "select twitter from users where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getEmail());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			System.out.print("twitter password : ");
			System.out.println(resultSet.getString("twitter password"));
			String password = resultSet.getString("twitter");
			if (password == null)
				System.out.println("there is no password available");
			else
				System.out.println(password);
		}

		connection.close();

	}

	// to update facebook
	public void updateFacebookPassword(Users users) throws Exception {
		String query = "UPDATE USERS SET FACEBOOK=? WHERE EMAIL=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getFacebook());
		preparedStatement.setString(2, users.getEmail());

		preparedStatement.execute();
		connection.close();
		 

	}

	// to update Instagram password
	public void updateInstagramPassword(Users users) throws Exception {
		String query = "UPDATE USERS SET INSTAGRAM=? WHERE EMAIL=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getInstagram());
		preparedStatement.setString(2, users.getEmail());

		preparedStatement.execute();
		connection.close();
		 
	}

	// to update Snapchat password
	public void updateSnapchatPassword(Users users) throws Exception {
		String query = "UPDATE USERS SET SNAPCHAT=? WHERE EMAIL=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getSnapchat());
		preparedStatement.setString(2, users.getEmail());

		preparedStatement.execute();
		connection.close();
		 

	}

	// to update Whatsapp password
	public void updateWhatsappPassword(Users users) throws Exception {
		String query = "UPDATE USERS SET WHATSAPP=? WHERE EMAIL=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getWhatsapp());
		preparedStatement.setString(2, users.getEmail());

		preparedStatement.execute();
		connection.close();
		 
	}

	// to update Twitter password
	public void updateTwitterPassword(Users users) throws Exception {
		String query = "UPDATE USERS SET TWITTER=? WHERE EMAIL=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getTwitter());
		preparedStatement.setString(2, users.getEmail());

		preparedStatement.execute();
		connection.close();
		 
	}
}

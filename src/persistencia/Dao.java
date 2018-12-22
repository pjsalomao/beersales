package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	protected Connection con;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	private final String URL = "jdbc:mysql://localhost:3306/beersales?autoReconnect=true&useSSL=false";
	private final String USER = "root";
	private final String PASS = "12boobyNET";
	
	protected void openDb()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		this.con = DriverManager.getConnection(URL, USER, PASS);
	}
	
	protected void closeDb() throws Exception{
		this.con.close();
	}
}
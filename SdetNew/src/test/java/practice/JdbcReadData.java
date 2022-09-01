package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcReadData {

	public static void main(String[] args) throws SQLException {
		//step1:Register or load the mysql database
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step 2: get connect to database
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info", "root", "root");
		
		//step 3: create sql statement
		Statement stat = conn.createStatement();
		String selectQuery = "select * from students";
		
		//step 4: execute statement/query
		ResultSet result =stat.executeQuery(selectQuery);
		
		while(result.next())

		{
		System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));	
		}
		
		//step 5: close the database connection
		conn.close();

	}

}

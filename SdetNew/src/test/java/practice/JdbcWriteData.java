package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcWriteData {

	public static void main(String[] args) throws SQLException {
		
			//step1:Register or load the mysql database
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			
			//step 2: get connect to database
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info", "root", "root");
			
			//step 3: create sql statement
			Statement stat = conn.createStatement();
			String query = "insert into students(first_name, last_name, address) values ('bhuvana','raj','udupi')";
			
			//step 4: execute statement/query
			int result =stat.executeUpdate(query);  //primitive datatype content level comparision
			                                        //non primitive datatype address level comparision
			
		if(result==1)
			{
				System.out.println("user is created");
			}
			else
			{
				System.out.println("user is not created");
			}


	}

}

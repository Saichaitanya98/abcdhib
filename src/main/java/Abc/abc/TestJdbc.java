package Abc.abc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/preetam?useSSL=false";
		String user="root";
		String pass="root1";
		try
		{
			System.out.println("Connecting to db..." + jdbcUrl);
			Connection conn=DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection success :) ");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
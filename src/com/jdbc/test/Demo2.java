package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试执行SQL语句，以及SQL注入问题
 * @author Administrator
 *
 */
public class Demo2 {

	public static void main(String[] args) {

		try {
			// 加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			// 建立链接
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			//执行sql语句
			Statement stmt = connection.createStatement();
			String sql = "insert into user (realname,username,pwd) values ('lgt','lf',123)";
			stmt.execute(sql);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

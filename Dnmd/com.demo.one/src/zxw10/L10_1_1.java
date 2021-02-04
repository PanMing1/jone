package zxw10;

import java.sql.*;

public class L10_1_1 {
	public static void main(String[] args) {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=shugou";
		String userName = "sa";// 不要写错
		String userPwd = "root";// 一定不要写错
		try {
			Class.forName(driverName);
			System.out.println("加载驱动成功！");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("加载驱动失败！");
		}
		try {
			Connection dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
			System.out.println("连接数据库成功！");
			// createStatement()

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print(e.getErrorCode());
			System.out.println("数据库连接错误");
			System.exit(0);
		}
	}
}

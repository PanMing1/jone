package zxw10;

import java.sql.*;

public class L10_1_1 {
	public static void main(String[] args) {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=shugou";
		String userName = "sa";// ��Ҫд��
		String userPwd = "root";// һ����Ҫд��
		try {
			Class.forName(driverName);
			System.out.println("���������ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ʧ�ܣ�");
		}
		try {
			Connection dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
			System.out.println("�������ݿ�ɹ���");
			// createStatement()

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print(e.getErrorCode());
			System.out.println("���ݿ����Ӵ���");
			System.exit(0);
		}
	}
}

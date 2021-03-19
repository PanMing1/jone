package zxw10;

import java.sql.*;

public class L10_2_1 {
	public static void main(String[] args) {
		PreparedStatement ps = null; 
		Connection ct = null;
		Statement sm = null;
		try {
//			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//			ct = DriverManager.getConnection("jdbc:odbc:sql server", "sa", "root");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String aa = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=shugou;integratedSecurity=false;";
			ct = DriverManager.getConnection(aa, "sa", "root");
			ps = ct.prepareStatement("select * from renwu where bianhao = ? and zhiwu = ?");
			ps.setInt(1, 3);
			ps.setString(2, "»ÊµÛ");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int bianhao = rs.getInt(1);
				String xiangming = rs.getString(2);
				String zhiwu = rs.getString(4);
				System.out.println(bianhao + "------" + xiangming + "------" + zhiwu);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (sm != null) {
					sm.close();
				}
				if (ct != null) {
					ct.close();
				}
			} catch (Exception e2) {

			}

		}
	}
}

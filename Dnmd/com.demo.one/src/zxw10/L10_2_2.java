package zxw10;

import java.sql.*;

public class L10_2_2 {
	public static void main(String[] args) {
		PreparedStatement ps = null; 
		Connection ct = null;
		ResultSet rs = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String aa = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=shugou;integratedSecurity=false;";
			ct = DriverManager.getConnection(aa, "sa", "root");
			ps = ct.prepareStatement("insert into renwu(xingming,xingbie,zhiwu,nianling,gongzi) values(?,?,?,?,?)");
			ps.setString(1, "¼ÖÚ¼");
			ps.setString(2, "ÄÐ");
			ps.setString(3, "Ä±Ê¿");
			ps.setInt(4, 35);
			ps.setDouble(5, 58888.44);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e2) {
			}

		}
	}
}

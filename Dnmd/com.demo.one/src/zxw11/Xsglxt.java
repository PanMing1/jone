package zxw11;

import javax.swing.JFrame;

import java.sql.*;
import java.util.*;

import javax.swing.*;

public class Xsglxt extends JFrame {
	JPanel mb1, mb2;
	JLabel bq1;
	JTextField wdk1;
	JButton an1, an2, an3, an4;
	JTable bg1;
	JScrollPane gd1;

	Vector<String> ziduan, jilu;
	PreparedStatement ps = null;
	Connection ct = null;
	Statement st = null;
	ResultSet rs = null ;

	public static void main(String[] args) {
		Xsglxt xs = new Xsglxt();
	}

	public Xsglxt() {
		mb1 = new JPanel();
		mb2 = new JPanel();
		bq1 = new JLabel("������������");
		wdk1 = new JTextField(10);
		an1 = new JButton("��ѯ");
		an2 = new JButton("���");
		an3 = new JButton("�޸�");
		an4 = new JButton("ɾ��");

		mb1.add(bg1);
		mb1.add(wdk1);
		mb1.add(an1);
		mb2.add(an2);
		mb2.add(an3);
		mb2.add(an4);

		ziduan = new Vector<String>();
		ziduan.add("ѧ��");
		ziduan.add("����");
		ziduan.add("�Ա�");
		ziduan.add("����");
		ziduan.add("����");
		ziduan.add("רҵ");
		
		jilu = new Vector<String>();
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String aa = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=shugou;integratedSecurity=false;";
			ct = DriverManager.getConnection(aa, "sa", "root");
			ps = ct.prepareStatement("select * from b_student_data");
			rs = ps.executeQuery();
			while (rs.next()) {
				Vector<String> hang = new Vector<String>();
				hang.add(rs.getString(1));
				hang.add(rs.getString(2));
				hang.add(rs.getString(3));
				hang.add(String.valueOf(rs.getInt(4)));
				hang.add(rs.getString(5));
				hang.add(rs.getString(6));
				jilu.addAll(hang);
				
			}
		} catch (Exception e) {
			
		}
	}
}

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ȸ������ {
	//ȸ���߰�
	public int useradd(String name, String phoneNum, String address){
		
		return 0;
	}
	//ȸ������
	public int userdelete(int usercode, String name){
		
		return 0;
	}
	//ȸ������
	public void usermodify(int usercode,String name, String phoneNum, String address,String beforename) throws SQLException{
		Connection connection = null;
		PreparedStatement stmt = null;
		int i = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/bookdb";
			String users = "root";
			String password = "1234";
			
			connection = DriverManager.getConnection(url, users, password);
			System.out.println("���Ἲ��");
			String sql = "update user set username = ?,userphoneNum = ?,useraddress = ? where usercode = ? AND username = ?";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, phoneNum);
			stmt.setString(3, address);
			stmt.setInt(4, usercode);
			stmt.setString(5, beforename);
			
			stmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	//ȸ�����
	public void userlist(){
		
	}
}
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class �������� {
	//�����߰�
	public void bookadd(String bookname, String bookhome, String bookwriter, int bookvalue){
		Connection conn = null;
		Statement stmt = null;
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb", "root", "1234");
			stmt = conn.createStatement();
			int rowNum = stmt.executeUpdate("insert into book (bookname, bookhome, bookwriter, bookvalue ) values('"
                              + bookname + "','"
                              + bookhome + "','"
                              + bookwriter + "','"
                              + bookvalue +"')");
			
			System.out.println("'"+bookname+"'"+ bookvalue +" ������ �߰��Ǿ����ϴ�.");
		}
		catch(Exception e){
			e.printStackTrace();	
		}finally {
			try {
				stmt.close();
			}
			catch (Exception igonred ){
					
			}
			try {
				conn.close();
			}
			catch (Exception igonred ){
				
			}
		}
	}
	//��������
	public int userdelete(int bookcode, String bookname){
		
		return 0;
	}
	//��������
	public int usermodify(int bookcode, String bookname, String bookhome, String bookwriter){
		
		return 0;
	}
}
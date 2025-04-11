package ex02_DB;

import java.sql.*;
import java.util.*;

public class PersonMethod {
	public static List<Person> find() {
		List<Person> list = new ArrayList<>();

		Connection conn = null;
		Statement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM person";

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.createStatement();
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				Person p = new Person();
				p.setIdx(rs.getInt("idx"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));

				list.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

	// Person테이블에 데이터를 추가하는 add 메서드

	public static void add(int inx, String name, int age) {
		
		
		
		String sql = "insert into person values(?,?,?)";
	}

}

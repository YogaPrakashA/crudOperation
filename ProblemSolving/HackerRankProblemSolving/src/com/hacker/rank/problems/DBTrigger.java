package com.hacker.rank.problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTrigger {

//	public static void main(String[] args) {
//		empDetailsLog(empID,oldSal,newSal);
//	}

	public static void empDetailsLog(int empID, float oldSal, float newSal) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:oracle://localhost:");
		String sql = "INSERT INTO emp_audit_log VALUES (log_id.NEXTVAL, ?1, ?2,?3,?4)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empID);
			pstmt.setFloat(2, oldSal);
			pstmt.setFloat(3, newSal);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}

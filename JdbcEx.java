package com.infosys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	1)loading the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");// ojdbc.jar
//	2)create db connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "info", "info123");
//	3)create the statement
		Statement stmt = conn.createStatement();
//	4)execute query ddl-->execute(),dml--->executeUpdate(), drl--->executeQuery()
		// stmt.execute("create table emp(eid number(10),ename varchar2(10))");

		// int result = stmt.executeUpdate("insert into emp values(1,'needbreak')");
		// int result = stmt.executeUpdate("update emp set ename='nobreaks' where
		// eid=1");
		// int result = stmt.executeUpdate("delete emp where eid=1");

		ResultSet result = stmt.executeQuery("select * from emp");

		while (result.next()) {
			System.out.println(result.getInt(1) + "  " + result.getString(2));
		}
		// 5)close the connection
		conn.close();
		System.out.println("data updated " + result);
	}

}

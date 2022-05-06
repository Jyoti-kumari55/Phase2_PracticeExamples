package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.Dbcon;

public class StudentDao {
	public int insert(Studentbean s) throws ClassNotFoundException, SQLException {
		Connection con=Dbcon.getConn();
		String sql1="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql1);
		ps.setInt(1,s.getSid());
		ps.setString(2,s.getSname());
		ps.setString(3,s.getSemail());
		int row=ps.executeUpdate();
		return row;
	}
	public ResultSet retrive() throws ClassNotFoundException, SQLException {
		String sql2="select * from student";
		Connection con=Dbcon.getConn();
		PreparedStatement ps1=con.prepareStatement(sql2);
		ResultSet rs=ps1.executeQuery();
		return rs;
	}
}

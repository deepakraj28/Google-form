package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StuDao {
	
	Connection Con;
	ResultSet rs;
 	PreparedStatement pst;
	public StuDao() {
		super();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/forms", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
 	public void Storedata(Student s)
 	{
 		String sql="insert into registerform(regno,name,gender,dept,address,age) values(?,?,?,?,?,?)";
 		try {
			pst=Con.prepareStatement(sql);
			pst.setString(1,s.getRegno());
			pst.setString(2,s.getName() );
		    pst.setString(3,s.getGender());
		    pst.setString(4,s.getDept());
			pst.setString(5,s.getAddress());
			pst.setInt(6,s.getAge());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
}

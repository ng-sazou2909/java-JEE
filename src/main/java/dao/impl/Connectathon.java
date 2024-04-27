package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectathon{
	    public Connectathon() {}
		public  static Connection getCon() {
			Connection myCon=null;
			 try {
		        	Class.forName("com.mysql.cj.jdbc.Driver");
		            myCon= DriverManager.getConnection("jdbc:mysql://localhost:3306/usersservice","root","zing29");
		        } catch (Exception e) {
	            System.out.println("err");
		            e.printStackTrace();
		        }
			 return myCon;
		}
}
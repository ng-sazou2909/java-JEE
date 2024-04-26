package dao.impl;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.System;

@WebServlet("/connexionDB")
public class Connectathon extends HttpServlet {

	    public Connectathon() {}
		public  static Connection getCon() {
			Connection myCon=null;
			 try {
		        	Class.forName("com.mysql.cj.jdbc.Driver");
		            myCon= DriverManager.getConnection("jdbc:mysql://localhost:3306/usersService","root","zing29");
		        } catch (Exception e) {
	            System.out.println("err");
		            e.printStackTrace();
		        }
			 return myCon;
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

}

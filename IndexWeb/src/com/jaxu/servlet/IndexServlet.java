package com.jaxu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import com.jaxu.dao.UserDao;
import com.mchange.v2.c3p0.impl.DefaultConnectionTester.QuerylessTestRunner;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Statement sql;
	static ResultSet res;  
    /**
     * 
     * @throws IOException 
     * @see HttpServlet#HttpServlet()
     */
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		//QueryRunner queryRunner = new QueryRunner(UserDao.getdDataSource());
		
		try {
			Connection conn=UserDao.getConnection();
			System.out.println(conn);
			
			sql=conn.createStatement();
			res=sql.executeQuery("SELECT * FROM user");
			//sql=conn.prepareStatement("insert into user (username,password)values(?,?)");
			
			while(res.next()) {
				String Cusername = res.getString("username");
			    String Cpassword = res.getString("password");
			    if(userName.equals(Cusername)&&password.equals(Cpassword))
			    {
			    	out.println("<h1>Login successful</h1>");
			    	break;
			    }else {
			    	out.println("<h1>Login failure,username or password error</h1>");
			    }
			}
			/*sql.setString(1,String.valueOf(userName));
			sql.setString(2,String.valueOf(password));
			System.out.println(sql.executeUpdate());*/
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<h1>userName:"+userName+"</h1>"+"\n"+"<h1>password:"+password+"</h1>");
		
		System.out.println("userName:"+userName+"password:"+password); 
	}

}

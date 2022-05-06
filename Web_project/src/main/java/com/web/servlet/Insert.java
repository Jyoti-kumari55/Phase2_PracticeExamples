package com.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.awt.print.Printable;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.StudentDao;
import com.web.dao.Studentbean;

/**
 * Servlet implementation class Insert
 */
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Studentbean s=new Studentbean();
		s.setSid(Integer.parseInt(request.getParameter("sid")));
		s.setSname(request.getParameter("sname"));
		s.setSemail(request.getParameter("semail"));
		StudentDao dao=new StudentDao();
		//PrintWriter pw=response.getWriter();
		try {
			 int row=dao.insert(s);
			if(row>0) {
			response.sendRedirect("success.html");	
			}
			else {
				response.sendRedirect("fail.htm;");
						
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

	}
	}
	}



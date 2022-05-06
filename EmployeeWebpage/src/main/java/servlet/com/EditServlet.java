package servlet.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.com.Empdet;
import java.com.EmpDao;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");     
	        PrintWriter out=response.getWriter();   
	        out.println("<h1>Update Student</h1>");   
	        String empid=request.getParameter("id");    
	        int id=Integer.parseInt(empid);      
	            
	       Empdet e1=EmpDao.getStudentById(id);    
	       out.print("<form action='EditServlet2' method='post'>");    
	        out.print("<table>");   
	        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e1.getId()+"'/></td></tr>");     
	        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e1.getName()+"'/></td></tr>");      
	        out.print("<tr><td>Age:</td><td><input type='email' name='email' value='"+e1.getEmail()+"'/></td></tr>");      
	        out.print("<tr><td>Course:</td><td><input type='department' name='department' value='"+e1.getDepartment()+"'/></td></tr>");      
	        out.print("<tr><td>City:</td><td>");      
	        out.print("<select name='city' style='width:150px'>");      
	        out.print("<option>Delhi</option>");      
	        out.print("<option>Mumbai</option>");      
	        out.print("<option>Pune</option>"); 
	        out.print("<option>Banglore</option>"); 
	        out.print("</select>");     
	        out.print("</td></tr>");      
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");     
	        out.print("</table>");      
	        out.print("</form>");   
	            
	        out.close();    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

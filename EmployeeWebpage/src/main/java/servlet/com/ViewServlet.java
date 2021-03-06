package servlet.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.com.Empdet;
import java.com.EmpDao;

/**
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='student.html'>Add New Student</a>");  
        out.println("<h1>Student List</h1>");  
          
        List<Empdet> list=EmpDao.getAllStudent();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th><th>Age</th><th>Course</th><th>City</th><th>Edit</th><th>Delete</th></tr>");  
         for(Empdet e1:list){      
         out.print("<tr><td>"+e1.getId()+"</td><td>"+e1.getName()+"</td><td>"+e1.getEmail()+"</td><td>"+e1.getDepartment()+"</td><td>"+e1.getCity()+"</td><td><a href='EditServlet?id="+e1.getId()+"'>edit</a></td><td><a href='DeleteServlet?id="+e1.getId()+"'>delete</a></td></tr>"); 
        out.print("</table>");  
        out.close();
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

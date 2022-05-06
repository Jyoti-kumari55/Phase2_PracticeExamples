package servlet.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.com.Empdet;
import java.com.EmpDao;

/**
 * Servlet implementation class SaveServlet
 * @param <Empdet>
 */
@WebServlet("/SaveServlet1") 
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		response.setContentType("text/html");   
        PrintWriter out=response.getWriter();   
        String id=request.getParameter("id");      
        String name=request.getParameter("name");      
        String email=request.getParameter("email");    
        String department=request.getParameter("department");      
        String city=request.getParameter("city");   
        Empdet e1=new Empdet();   
        e1.setId(id); 
        e1.setName(name);     
        e1.setEmail(email);   
        e1.setDepartment(department);     
        e1.setCity(city);     
            
        int status=EmpDao.save(e1);     
        if(status>0){   
            out.print("<p>Record saved successfully!</p>");     
            request.getRequestDispatcher("student.html").include(request, response);    
        }else{      
            out.println("Sorry! unable to save record");
	}
        out.close(); 
	}
}
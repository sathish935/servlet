package emplogin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeDao ed=new EmployeeDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher ds=request.getRequestDispatcher("/WEB-INF/lib/employeedeatial.jsp");
		ds.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstName=request.getParameter("firstName");
		String LastName=request.getParameter("Last Name");
		String Password=request.getParameter("Password");
		String Address=request.getParameter("Address");
		String Contact=request.getParameter("Contact");
		
		
		EmployeeLogin emp=new EmployeeLogin();
		emp.setFirstName(FirstName);
		emp.setLastName(LastName);
		emp.setPassword(Password);
		emp.setAddress(Address);
		emp.setContact(Contact);
		
		try {
			ed.insertRecords(emp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher ds=request.getRequestDispatcher("/WEB-INF/lib/emplogin.html");
		ds.forward(request, response);
	}

}

package tp2calcul;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormulaireServlet
 */
@WebServlet("/FormulaireServlet")
public class FormulaireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormulaireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String o1 = request.getParameter("o1");
		String o2 = request.getParameter("o2");
		String operation = request.getParameter("operation");
		String page = "";

		        if (((o1.equals(""))||(o2.equals("")))
		           ||(!(o1.matches("[0-9]*")) || !(o2.matches("[0-9]*")))
		                ||(operation == null)){
		                     page="erreur.jsp";
		                } else {
		                     page="response.jsp";
		          }
		    RequestDispatcher dispInf=request.getRequestDispatcher(page) ;
		    dispInf.forward(request, response);
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

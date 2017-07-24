

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckInputServlet
 */
@WebServlet("/CheckInputServlet")
public class CheckInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckInputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String box[] = request.getParameterValues("ch");

	    response.setContentType("text/html;charset=UTF-8");

	    //
	    PrintWriter out = response.getWriter();

	    //
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset='UTF-8'>");
	    out.println("<title>check</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>check</h1>");
	    out.println("<a>");
		if(box != null){
			for(int i=0; i<box.length; i++){
				out.println(box[i]);
			}
		}
	    out.println("</a>");
	    out.println("</body>");
	    out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);


	}

}

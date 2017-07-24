

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TextInputServlet
 */
@WebServlet("/TextInputServlet")
public class TextInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TextInputServlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);

	    String u = request.getParameter("name");

	    response.setContentType("text/html;charset=UTF-8");

	    //
	    PrintWriter out = response.getWriter();

	    //
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset='UTF-8'>");
	    out.println("<title>text</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>text</h1>");
	    out.println("<a>");
	    out.println(u);
	    out.println("</a>");
	    out.println("</body>");
	    out.println("</html>");
	}

}

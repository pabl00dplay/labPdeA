package servlets;



import DataTypes.DTUsuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import main.java.logica.Fabrica;
import main.java.logica.IController;

@WebServlet("/SVLogin")
public class SVLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        Fabrica f = Fabrica.getInstance(); 
        IController i = f.getIController();
        DTUsuario dt = i.getUsuario(username);
        
        if (dt != null) {
            session.setAttribute("username", username);
            session.setAttribute("foto", dt.getImg());
            response.sendRedirect("header.jsp");
            
        } else {
            response.sendRedirect("Login.jsp?error=1");
        }
       /* HttpSession misession = request.getSession();
        misession.setAttribute("DTUsuario", dt);
        response.sendRedirect("Pestanias.jsp");
        */
    }
}




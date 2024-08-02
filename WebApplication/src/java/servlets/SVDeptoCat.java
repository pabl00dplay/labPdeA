package servlets;

import DataTypes.DTActividad;
import DataTypes.DTSalida;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import main.java.logica.Fabrica;
import main.java.logica.IController;

@WebServlet("/SVDeptoCat")
public class SVDeptoCat extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Fabrica f = Fabrica.getInstance();
        IController I = f.getIController();
        
        // Obtener el parámetro de la solicitud
        String departamento = (String)request.getParameter("departamento");
        if(departamento!=null){
            ArrayList<DTActividad> actividades=I.listarActividadesDepartamento(departamento);
            ArrayList<String> actividadesString=new ArrayList<String>();
            for(DTActividad d:actividades){
                actividadesString.add(d.getNombre());
            }
            // Convertimos el ArrayList a un array de Strings
            String[] opciones = actividadesString.toArray(new String[0]);
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.print("[");
            for (int i = 0; i < opciones.length; i++) {
                out.print("\"" + opciones[i] + "\"");
                if (i < opciones.length - 1) {
                    out.print(",");
                }
            }
            out.print("]");
            out.flush();
        }
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            // Obtener el valor seleccionado del formulario
        String categoria = request.getParameter("categoria");

        // Procesar y responder con el valor seleccionado
        if (categoria != null) {


            Fabrica f = Fabrica.getInstance();
            IController I = f.getIController();

            ArrayList<DTSalida> salidas = I.getSalidasActividad(categoria);


            HttpSession misesion = request.getSession();
            if(salidas!=null){
                misesion.setAttribute("listaSalidas", salidas);     
            }    
            response.sendRedirect("index.jsp");

        }
 }
    
    
}

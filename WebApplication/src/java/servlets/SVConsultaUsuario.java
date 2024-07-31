/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import DataTypes.DTActividad;
import DataTypes.DTSalida;
import DataTypes.DTUsuario;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.DefaultListModel;
import static javax.swing.text.html.HTML.Tag.I;
import main.java.logica.Fabrica;
import main.java.logica.IController;
import main.java.logica.Usuario;

/**
 *
 * @author usuario
 */
@WebServlet(name = "SVConsultaUsuario", urlPatterns = {"/SVConsultaUsuario"})
public class SVConsultaUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SVConsultaUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SVConsultaUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Fabrica f = Fabrica.getInstance();
        IController I = f.getIController();
       
        List<Usuario> listausuarios = I.getUsuarios();
               
        HttpSession misesion = request.getSession();
        if(listausuarios!=null){
            misesion.setAttribute("listausuarios", listausuarios);     
        }    
        response.sendRedirect("ConsultaUsuario.jsp");
        String nickseleccionado=request.getParameter("nick");
        ArrayList<String> salidasTur=null;
        if(nickseleccionado!=null)
            salidasTur = I.listarsalidasinscriptasTurista(nickseleccionado.trim());
        if(salidasTur!=null){
            misesion.setAttribute("salidas", salidasTur);     
        }    
        DTUsuario dt=null; 
        if(nickseleccionado!=null)
            dt=I.getUsuario(nickseleccionado);
        if(dt!=null){
            misesion.setAttribute("DTUsuario", dt);
        }
        //ACtividades y salidas
         if(nickseleccionado!=null){
                ArrayList<String> act = I.listarActividadesProveedor(nickseleccionado);
                ArrayList<String> sal = I.listarsalidasProveedor(nickseleccionado);
                if ((act != null) && (sal != null)) {
                    //ACtividades y salidas
                    List<String> actividades=I.listarActividadesProveedor(nickseleccionado);
                  List<String> salidas = I.listarsalidasProveedor(nickseleccionado);
                //Crear un objeto DefaultListModel
                List<String> listModelsalidas = new ArrayList<String>();
                List<String> listModelActividades = new ArrayList<String>();
                int cont = 0;
                int i = 0;
                while (i < salidas.size()) {
                    if (true) {//actividades.get(cont).confirmada()){
                        if (salidas.get(i).equals("*")) {
                            listModelActividades.add(i, actividades.get(cont));
                            listModelsalidas.add(i, "");
                            cont++;
                            i++;
                        } else {
                            listModelActividades.add(i, "");
                            listModelsalidas.add(i, salidas.get(i));
                            i++;
                        }
                    } else {
                        cont++;
                        while (!salidas.get(i).equals("*")) {
                            i++;
                        }
                    }

                }
                misesion.setAttribute("lislsalidas", listModelsalidas);
                misesion.setAttribute("salidasact", listModelActividades);
                
            }
        }
            //    response.sendRedirect("index.jsp");
                processRequest(request, response);
    }
    
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        Fabrica f = Fabrica.getInstance();
        IController I = f.getIController();

        String nickseleccionado = request.getParameter("nickseleccionado");
       // System.out.println("Nick seleccionado: " + nickseleccionado); // Log para depuración

        ArrayList<String> salidasTur = null;
        if (nickseleccionado != null) {
            salidasTur = I.listarsalidasinscriptasTurista(nickseleccionado.trim());
        }

        if (salidasTur != null) {
            List<String> dataList = salidasTur;
            String json = new Gson().toJson(dataList);
         ///   System.out.println("JSON generado: " + json); // Log para depuración
            PrintWriter out = response.getWriter();
            out.write(json);
            out.flush();
        } else {
            response.setStatus(HttpServletResponse.SC_NO_CONTENT); // Opcional: enviar un código de estado 204 si no hay contenido
            //System.out.println("No se encontraron salidas."); // Log para depuración
        }
    }
}


package servlets;

import DataTypes.DTUsuario;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import main.java.logica.Fabrica;
import main.java.logica.IController;

/**
 *
 * @author usuario
 */

@WebServlet(name = "SVAltaUsuario", urlPatterns = {"/SVAltaUsuario"})
@MultipartConfig
public class SVAltaUsuario extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SVAltaUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SVAltaUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        processRequest(request, response);
    }
    @Override  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nick=request.getParameter("nickname");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String pass=request.getParameter("contrasena");
        String pass2=request.getParameter("confirmarContrasena");
        String correo=request.getParameter("correo");
        String fechaStr = request.getParameter("fechaNacimiento");
        if (fechaStr==null){
            fechaStr="";
        }
        // Define el formato esperado de la fecha en el formulario
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaNacimiento=new Date();
        try {
            fechaNacimiento = dateFormat.parse(fechaStr);
        } catch (ParseException e) {
    // Manejar la excepción (por ejemplo, imprimir un mensaje de error o registrarla)
            e.printStackTrace();
        }
// Obtener el archivo subido
        Part filePart = request.getPart("imagen");
         String relativeFilePath="";
        if (filePart != null && filePart.getSize() > 0) {
            // Obtener el nombre del archivo
            String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
            // Obtener la ruta de la carpeta donde se almacenarán las imágenes
            // Ajustar la ruta para evitar el directorio de compilación
            String relativeWebPath ="./imagenes";
            String absoluteDiskPath = getServletContext().getRealPath(relativeWebPath).replace("/build/web", "/web");
            // Crear el directorio si no existe
         
           File uploadDir = new File(absoluteDiskPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }
            
            // Crear la ruta completa del archivo
            String filePath= absoluteDiskPath+File.separator+fileName;
            relativeFilePath=relativeWebPath+File.separator+fileName;
            // Guardar el archivo en la carpeta "imagenes"
            try (InputStream fileContent = filePart.getInputStream()) {
                Files.copy(fileContent, Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();  // Manejar cualquier error que pueda ocurrir al copiar el archivo
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al guardar el archivo.");
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "No se ha proporcionado ningún archivo o el archivo está vacío.");
        }
        
        HttpSession misesion=request.getSession();
        Fabrica f=Fabrica.getInstance(); 
        IController i=f.getIController();
        boolean existenick=i.nickExiste(nick);
        boolean existemail=i.mailExiste(correo);
        if(!(pass.equals(pass2))) {
            misesion.setAttribute("mostrar", "Las contraseñas no son iguales");   
        } 
        if(existenick){
            misesion.setAttribute("mostrar", "El nickname ya existe");
        }
        if(existemail){
            misesion.setAttribute("mostrar", "El mail ya existe");
        }
        if ((pass.equals(pass2))&& (!existenick)&&(!existemail)){
            misesion.setAttribute("mostrar", "");
            String opcion = request.getParameter("tipoUsuario");
            if(opcion.equals( "turista")){
                    String nacionalidad = request.getParameter("nacionalidad");
                    DTUsuario dt = new DTUsuario(nick, nombre, apellido, correo, fechaNacimiento, nacionalidad, pass, relativeFilePath);
                    i.altaTurista(dt);
            } else if(opcion.equals( "proveedor")){
                    String descripcion = request.getParameter("descripcion");
                    String sitioWeb = request.getParameter("sitioWeb");
                    DTUsuario dt = new DTUsuario(nick, nombre, apellido, correo, fechaNacimiento, sitioWeb, descripcion, pass, relativeFilePath);
                    i.altaProveedor(dt);
            }else{
                    DTUsuario dt = new DTUsuario(nick, nombre, apellido, correo, fechaNacimiento, pass, relativeFilePath);
                    //i.altaVisitante(dt);
                }
        }
        response.sendRedirect("AltaUsuario.jsp");
        
        
        
        
        
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

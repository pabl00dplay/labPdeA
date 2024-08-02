/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import main.java.logica.Fabrica;
import main.java.logica.IController;

/**
 *
 * @author user
 */
@WebServlet(name = "SVAltaSalidaTuristica", urlPatterns = {"/SVAltaSalidaTuristica"})
public class SVAltaSalidaTuristica extends HttpServlet {

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

    
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Fabrica f = Fabrica.getInstance();
        IController I = f.getIController();
        ArrayList<DTDepartamento> listaDeptos = I.getDepartamentos();
        List<String> datos = new ArrayList<>();
        for(DTDepartamento d:listaDeptos){
            datos.add(d.getNom());
         }
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
         // Convierte los datos en formato JSON
         String json = toJsonArray(datos);
         out.print(json);
    }
    private String toJsonArray(List<String> list) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        for (int i = 0; i < list.size(); i++) {
            json.append("\"").append(list.get(i)).append("\"");
            if (i < list.size() - 1) {
                json.append(",");
            }
        }
        json.append("]");
        return json.toString();
    };
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Fabrica f = Fabrica.getInstance();
        IController I = f.getIController();    
// Obtén el valor seleccionado del ComboBox de origen enviado desde el cliente
        String selectedValue = request.getParameter("selectedValue");
        ArrayList<DTActividad> lista = new ArrayList<>();
        if (selectedValue != null) {
            lista = I.listarActividadesDepartamento(selectedValue);
            List<String> options = new ArrayList<>();
            for (DTActividad a : lista) {
                options.add(a.getNombre());
            }
            // Convierte las opciones a JSON (puedes utilizar una biblioteca JSON, como Gson)
            String jsonOptions = toJsonArray(options);

            // Configura la respuesta
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            // Envia las opciones al cliente
            PrintWriter out = response.getWriter();
            out.print(jsonOptions);
            out.flush();
        }//end selected value

        String nombre = request.getParameter("nombre");
        if (nombre != null) {
            String fechaStr = request.getParameter("fecha");
            String cantidad_maxima = request.getParameter("cantidad_maxima");
            String imagen = request.getParameter("imagen");
            if (fechaStr == null) {
                fechaStr = "";

                // Define el formato esperado de la fecha en el formulario
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date fecha = null;
                try {
                    fecha = dateFormat.parse(fechaStr);
                } catch (ParseException e) {
                    // Manejar la excepción (por ejemplo, imprimir un mensaje de error o registrarla)
                    e.printStackTrace();
                }
                //Lectura de la foto 
            }//end if fecha

            //Lectura de la foto 
            Part filePart = request.getPart("imagen");

            // Obtener el nombre del archivo
            String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

            // Obtener la ruta de la carpeta donde se almacenará2n las imágenes
            String uploadPath = "WebApplication/imagenes";  // Reemplaza con la ruta correcta

            // Crear el directorio si no existe
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            // Crear la ruta completa del archivo   
            String filePath = uploadPath +File.separator + fileName;

            // Guardar el archivo en la carpeta "imagenes"
            try (InputStream fileContent = filePart.getInputStream()) {
                Files.copy(fileContent, Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                // Manejar cualquier error que pueda ocurrir al copiar el archivo
                e.printStackTrace();  // Puedes cambiar esto para mostrar un mensaje de error adecuado
            }
            // En este punto, el archivo ha sido guardado en la carpeta "imagenes"  
            //hay que guardar estos datos en la base
            //nombre,cantidad_maxima,fecha,uploadPath
            
        }//if nombre
    }
}

   




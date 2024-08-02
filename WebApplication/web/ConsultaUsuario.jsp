<%-- 
    Document   : index
    Created on : 8 oct. 2023, 19:29:05
    Author     : usuario
--%>

<%@page import="DataTypes.DTUsuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="main.java.logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/stylesConsultaUsuario.css" rel="stylesheet" type="text/css">
        <link href="styles/stylesPrincipal.css" rel="stylesheet" type="text/css">
        <title>Formulario de Consulta de Usuario</title>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="js/scriptConsultaUsuario.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        
        
    </head>
    <body>
         <form id="formularioConsulta" action="SVConsultaUsuario" method="get">
            <button id="botonOculto" type="submit" style="display: none;">Consulta Usuario</button>
        </form>
        <div class="box">
            <%   
                //probando comitear desde github
            List<Usuario> Lusuarios = (List) request.getSession().getAttribute("listausuarios");
           if(Lusuarios!=null){
            %><p><b>NickName:</b></p>  
            <%    if(Lusuarios!=null)
                for (Usuario u : Lusuarios)  {
                %>
                   
                    <ul class="no-bullets">
                      <li><a href="SVConsultaUsuario?nick=<%=u.getNick()%>"><%=u.getNick()%></a></li>
                    </ul> 
               
                <%}%>
            <%}%>
        </div>
        <div class="box1">
            <p>  <%DTUsuario dt = (DTUsuario) request.getSession().getAttribute("DTUsuario");
                        String nick = "";
                        String nombre = "";
                        String apellido = "";
                        String mail = "";
                        String fnac = null;
                        foto = "";
                        String nacionalidad = "";
                        String desc = "";
                        String web = "";
                        int tipo=0;
                        if (dt != null) {
                            nick = dt.getNick();
                            nombre = dt.getNom();
                            apellido = dt.getApe();
                            mail = dt.getMail();
                            fnac = dt.getFnac().toString();
                            foto = "."+dt.getImg();
                            nacionalidad = "";
                            desc = "";
                            web = "";
                            tipo = dt.getEsTurista();
                            if (tipo == 1) {//Turista
                                nacionalidad = dt.getNacionalidad();
                            } else if (tipo == 0) {
                                desc = dt.getDescripcion();
                                web = dt.getWeb();
                            }
                    %>
                            <b>nick:<%=nick%></b><br>
                            <b>nombre:<%=nombre%></b><br>
                            <b>apellido:<%=apellido%></b><br>
                            <b>mail:<%=mail%></b><br>
                            <b>Fecha de nacimiento:<%=fnac%></b><br>
                            <b>Foto:<br><img src=<%=foto%>></b><br>
                            <%
                            if (tipo == 1){
                                ArrayList<String> salidas = (ArrayList) request.getSession().getAttribute("salidas");
                            %>
                                <b>Nacionalidad:<%=nacionalidad%></b><br>
                                <b>Salidas Asociadas:</b><br>
                                  <%if(salidas!=null)
                                   for (String sal : salidas)  {
                                    %>
                                        <b><%= sal %></b><br>
                                   <%}%>
                             <%}%>    

                            <%
                                if(tipo == 0) {
                                    String text =desc;
                                   // Dividir el texto en palabras
                                    String[] words = text.split("\\s+");

                                    // Usar StringBuilder para construir el resultado
                                    StringBuilder result = new StringBuilder();

                                    // Obtener el número de palabras a devolver (máximo 5 o menos si hay menos palabras)
                                    int wordsToRetrieve = Math.min(words.length, 5);

                                    // Unir las primeras cinco palabras
                                    for (int i = 0; i < wordsToRetrieve; i++) {
                                        result.append(words[i]);
                                        if (i < wordsToRetrieve - 1) {
                                            result.append(" ");
                                        }
                                    }
                                    
                                    // Calcular la longitud de las primeras cinco palabras
                                   int firstFiveWordsLength = result.length();
                                    String remainingText ="";
                                   // Si el texto tiene más palabras, devolver el resto del texto
                                   if (text.length() > firstFiveWordsLength) {
                                       remainingText= text.substring(firstFiveWordsLength).trim();
                                   }    
                            %>
                                     Descripcion:<p><%=result.toString()%></p>
                                    <a href="#" id="toggleLink">Leer mas</a><br>
                                    <div id="remaining">
                                        <p><%=remainingText%></p>
                                    </div>
                                    <b>Sitio web:<%=web%></b><br>
                        <%}%>       
                                    <b>información básica de las actividades turísticas que ofrece:</b><br>
                                    <%
                                    List<String> lislsalidas = (List<String>) request.getSession().getAttribute("lislsalidas");
                                    
                                    List<String> listActividades = (List<String>) request.getSession().getAttribute("salidasact");
                                    if((lislsalidas!=null)&&(listActividades!=null)){
                                        for (int j=0;j<lislsalidas.size();j++)  {
                                            String actividad=listActividades.get(j);
                                            String salidas=lislsalidas.get(j);
                                    %>
                                            <b><%=actividad%><%=salidas%></b><br>
                                        <%}%>
                                    <%}%>    
                                <%}%>    
      </div>
     
      <script type="text/javascript">
            // Detectar si el usuario ha vuelto a la página usando el botón de atrás
            window.addEventListener('pageshow', function(event) {
                if (event.persisted) {
                    // Recargar el header
                    fetch('header.jsp')
                        .then(response => response.text())
                        .then(data => {
                            document.querySelector('.header-rectangle').innerHTML = new DOMParser().parseFromString(data, 'text/html').querySelector('.header-rectangle').innerHTML;
                        });
                }
            });
      </script>              
    </body>
</html>

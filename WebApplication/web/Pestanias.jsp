<%@page import="java.util.ArrayList"%>
<%@page import="DataTypes.DTUsuario"%>
<%@page import="main.java.logica.IController"%>
<%@page import="main.java.logica.Fabrica"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pestañas con jQuery</title>
    <link href="styles/stylesPestanias.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div class="tabs">
        <ul class="tab-links">
            <li class="active"><a href="#tab1">Perfil</a></li>
            <li><a href="#tab2">Salidas</a></li>
            <li><a href="#tab3">Paquetes</a></li>
        </ul>
        <%
            Fabrica f = Fabrica.getInstance();
            IController I = f.getIController();
            DTUsuario dt = null;
            String username = null;
            if (session != null) {
                username = (String) session.getAttribute("username");
            }
            if (username != null) {
                dt = I.getUsuario(username);
            }
            String nick = "";
            String nombre = "";
            String apellido = "";
            String mail = "";
            String fnac = null;
            String foto = "";
            String nacionalidad = "";
            String desc = "";
            String web = "";
            int tipo = 0;
            if (dt != null) {
                nick = dt.getNick();
                nombre = dt.getNom();
                apellido = dt.getApe();
                mail = dt.getMail();
                fnac = dt.getFnac().toString();
                foto = "." + dt.getImg();
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
        <div class="tab-content">
            <div id="tab1" class="tab active">
                <h2>Perfil</h2>
                <p>nick:<%=nick%></p><br>
                <p>nombre:<%=nombre%></<p><br>
                <p>apellido:<%=apellido%></p><br>
                <p>mail:<%=mail%></p><br>
                <p>Fecha de nacimiento:<%=fnac%></p><br>
                <p>Foto:<br><img src=<%=foto%>></p><br>
                    <%if (nacionalidad != "")%>
                <p>Nacionalidad:<%=nacionalidad%></p><br>
                <%
                 if (tipo == 0) {
                        String text = desc;
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
                        String remainingText = "";
                        // Si el texto tiene más palabras, devolver el resto del texto
                        if (text.length() > firstFiveWordsLength) {
                            remainingText = text.substring(firstFiveWordsLength).trim();
                        } %>
                        Descripcion:<p><%=result.toString()%></p>
                        <a href="#" id="toggleLink">Leer mas</a><br>
                        <div id="remaining">
                            <p><%=remainingText%></p>
                        </div>
                        <%if (web != "")%>
                            <p>Sitio web:<%=web%></p><br>
                    <%}%>
            </div>
            <div id="tab2" class="tab">
                <h2>Salidas</h2>
                <ul>
                    <%
                     ArrayList<String> salidasTur=null;
                    if(nick!=""){
                        salidasTur = I.listarsalidasinscriptasTurista(nick.trim());
                            if(salidasTur!=null)
                                for(String s:salidasTur){%>
                                    <li> <%=s%> </li>
                        <%}%>
                    <%}%>   
                </ul>
            </div>
            <div id="tab3" class="tab">
                <h2>Contenido de la Pestaña 3</h2>
                <p>Información del usuario en la pestaña 3.</p>
            </div>
        </div>
    <%}%>
    </div>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="js/scriptsPestanias.js"></script>
</body>
</html>

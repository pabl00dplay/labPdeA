<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setDateHeader("Expires", 0); // Proxies.
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        <script src="js/scriptPrincipal.js"></script>
        <link rel="stylesheet" href="styles/stylesPrincipal.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    </head>
    <body>
        <div class="container ">
            <div class="row header-rectangle">
                <div class="col-12 col-sm-12 col-lg-3 col-xl-3 col-xxl-3">
                    <h1>Turismo.uy</h1>
                </div>
                <div class="col-12 col-sm-12 col-lg-6 col-xl-6 col-xxl-6 " >
                    <div class="search-container">
                        <div class="search-bar">
                            <input type="text" placeholder="Buscar...">
                            <button type="submit">
                                <img src="lupa-icon.png" alt="Buscar">
                            </button>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-12 col-lg-3 col-xl-3 col-xxl-3">
                    <div class="links-container">
                        <a href="Login.jsp" id="login">login</a>
                        <span id="separador" >!</span>
                        <a href="AltaUsuario.jsp" id="Alta-Usuario">Alta de Usuario</a>
                    </div>
                </div>
            </div>
        </div>
             <%
            String username=null;
            String foto=null;
            if (session != null) {
                username = (String) session.getAttribute("username");
                foto = (String) session.getAttribute("foto");
            }
         %>

         <% if (username != null) { %>
            <script type="text/javascript">
                // Pasar valores JSP a JavaScript
                var user = '<%= username %>';
                var foto = '<%= foto %>';

                // Llamar a la función con los parámetros obtenidos
                agregarUserFoto(user, foto);
            </script> 
          <%}%>     
            <br><br>      
        
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>

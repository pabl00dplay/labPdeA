<%-- 
    Document   : Login
    Created on : 2 jun. 2024, 14:45:21
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/stylesLogin.css">
        <title>Login Page</title>
    </head>
    <body>
    <div class="form-container">
        <h2>Iniciar Sesión</h2>
        <form action="SVLogin" method="post">
            <input type="text" name="username" placeholder="Usuario" required>
            <input type="password" name="password" placeholder="Contraseña" required>
            <input type="submit" value="Enviar">
        </form>
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

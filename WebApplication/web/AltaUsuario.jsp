
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html>
<html lang="es"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Alta de Usuario</title>
    <link rel="stylesheet" href="styles/stylesPrincipal.css">
    <script src="js/scriptPrincipal.js"></script>
    
</head>
<body>
    
<form action="SVAltaUsuario" method="post"enctype="multipart/form-data" onsubmit="return validate()" >
    <label for="nickname">Nickname (único):</label>
    <input type="text" id="nickname" name="nickname" required=""><br><br>

    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required=""><br><br>

    <label for="apellido">Apellido:</label>
    <input type="text" id="apellido" name="apellido" required=""><br><br>

    <label for="contrasena">Contraseña:</label>
    <input type="password" id="contrasena" name="contrasena" required=""><br><br>

    <label for="confirmarContrasena">Confirmación de Contraseña:</label>
    <input type="password" id="confirmarContrasena" name="confirmarContrasena" required=""><br><br>

    <label for="correo">Correo electrónico (único):</label>
    <input type="email" id="correo" name="correo" required=""><br><br>

    <label for="fechaNacimiento">Fecha de Nacimiento:</label>
    <input type="date" id="fechaNacimiento" name="fechaNacimiento" required=""><br><br>
    <label for="imagen">Imagen (opcional):</label>
    <input type="file" id="imagen" name="imagen"><br><br>
    <label for="tipoUsuario">Tipo de Usuario:</label>
    <select id="tipoUsuario" name="tipoUsuario" required="">
        <option value="usuario" selected="selected">Usuario</option>
        <option value="turista">Turista</option>
        <option value="proveedor">Proveedor/a</option>
    </select><br><br>

    <div id="datosExtraTurista" style="display: none;">
        <label for="nacionalidad">Nacionalidad:</label>
        <input type="text" id="nacionalidad" name="nacionalidad"><br><br>
    </div>

    <div id="datosExtraProveedor" style="display: none;">
        <label for="descripcion">Descripción general:</label>
        <textarea id="descripcion" name="descripcion"></textarea><br><br>

        <label for="sitioWeb">Sitio web (opcional):</label>
        <input type="url" id="sitioWeb" name="sitioWeb"><br><br>
    </div>

    <script type="text/javascript">
    	function validate(){
    		var correct=true;
    		if (name===""){
    			$("#error_name").show;
    			correct=false;
    		}
    		else{
    			$("#error_name").hide;
                        correct=true;       
    		}
                
                // Obtén los valores de los campos de contraseña
                var password1 = document.getElementById("contrasena").value;
                var password2 = document.getElementById("confirmarContrasena").value;

                // Compara los valores de las contraseñas
                if (password1 !== password2) {
                  // Las contraseñas no coinciden, muestra el mensaje de error
                  $("#error_pass").show;
                  correct=false;  // Evita el envío del formulario
                }
                else{
                      // Las contraseñas coinciden, oculta el mensaje de error y permite enviar el formulario
                      $("#error_pass").hide;
                      correct=true;
                }
                return correct;
}
                
	    
    </script>
    <button type="submit" >Registrarse</button>
</form> 
<b><% String res=(String)request.getSession().getAttribute("mostrar");
    if (res==null){
        res="";
        //rdto es un comentario para probar merge
    }
    
    %>
<%=res%></b>
<div id="error-message" style="color: red; display: none;">Las contraseñas no coinciden.</div>
<script>
    const tipoUsuarioSelect = document.getElementById('tipoUsuario');
    const datosExtraTurista = document.getElementById('datosExtraTurista');
    const datosExtraProveedor = document.getElementById('datosExtraProveedor');

    tipoUsuarioSelect.addEventListener('change', () => {
        if (tipoUsuarioSelect.value === 'turista') {
            datosExtraTurista.style.display = 'block';
            datosExtraProveedor.style.display = 'none';
        } else if (tipoUsuarioSelect.value === 'proveedor') {
            datosExtraTurista.style.display = 'none';
            datosExtraProveedor.style.display = 'block';
        }
        else{
        	datosExtraTurista.style.display = 'none';	
        	 datosExtraProveedor.style.display = 'none';
        }
    });
</script>
    
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



</body></html>
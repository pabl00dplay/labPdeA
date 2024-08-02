<%@page import="DataTypes.DTSalida"%>
<%@page import="DataTypes.DTDepartamento"%>
<%@page import="main.java.logica.IController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="main.java.logica.Fabrica"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejemplo de listas</title>
    <link rel="stylesheet" href="styles/stylesTablas.css">
    <link rel="stylesheet" href="styles/stylesConsultaUsuario.css">
    <link rel="stylesheet" href="styles/stylesBotonSalida.css">
    <script src="js/scriptTablas.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
    <div class="container cuerpo d-flex flex-wrap">
        <div class="box">
            <div clas="row">
                <div id="perf">
                        <h2>Perfil</h2>
                        <button id="icon-boton" class="icon-btn" onclick="loadContent()">
                          <img id="btnsal" src="./imagenes/flecha.png" alt="Icono">
                        </button>
                </div>
                <div  class="rectangulo1">
                    <p>salidas turisticas</p>
                </div>
            </div> 
            <div clas="row">
                <div id="depto"><h2>Deptos</h2></div>
                <div  class="rectangulo">
                    <ul id="lista1">
                        <% 
                        Fabrica f = Fabrica.getInstance();
                        IController I = f.getIController();
                        ArrayList<DTDepartamento> listaDeptos = I.getDepartamentos();
                        for(DTDepartamento d : listaDeptos) {
                            String dpto = d.getNom();
                        %>
                            <li data-value="<%= dpto %>"><%= dpto %></li>
                        <% 
                        }
                        %>
                    </ul>
                </div>
            </div>
            <div clas="row">        
                <div id="cat"><h2>Categorias</h2></div>
                <div  class="rectangulo">
                    <ul id="lista2">

                    </ul>
                </div>
                <div>
                    <button id="logoutButton" class="icon-button">
                        <img id="botonSalida" src="./imagenes/sal.png" alt="Icono">
                    </button>
                </div>
            </div>

        </div>
        <div class="row box1" id="box1">
        </div>
    </div>           
<script>
        llenardoslistas(); 
        AgregarClickLista2();
        //esto es un comentario pa saber si hago bien el merge
</script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="js/scriptIndex.js"></script>
</body>
</html>

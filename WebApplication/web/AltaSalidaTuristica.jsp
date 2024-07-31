<%@page import="DataTypes.DTActividad"%>
<%@page import="main.java.logica.IController"%>
<%@page import="main.java.logica.Fabrica"%>
<%@page import="java.lang.String"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DataTypes.DTDepartamento"%>
<%@page import="main.java.logica.Departamento"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>


<html>
<head>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

  <title>Formulario Alta Salida Turística</title>
   <script>
    document.addEventListener("DOMContentLoaded", function() {
        var comboBox = document.getElementById("ComboBox1");
        var xhr = new XMLHttpRequest();

        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                // Parsea la respuesta JSON del servlet
                var datos = JSON.parse(xhr.responseText);

                // Llena el ComboBox con los datos
                for (var i = 0; i < datos.length; i++) {
                    var option = document.createElement("option");
                    option.text = datos[i];
                    comboBox.add(option);
                }
            }
        };

        // Realiza la solicitud GET al servlet
        xhr.open("GET", "SVAltaSalidaTuristica", true);
        xhr.send();
    });
      
</script>

    <script>
        function fillSecondComboBox() {
            var selectedValue = document.getElementById("ComboBox1").value;
            var combo2 = document.getElementById("ComboBox2");

            $.ajax({
                type: 'POST', // Puedes utilizar POST o GET según tus necesidades
                url: 'SVAltaSalidaTuristica', // Reemplaza 'TuServlet' con la URL de tu servlet
                data: { selectedValue: selectedValue }, // Envía el valor seleccionado al servlet
                success: function(data) {
                    // Limpia el ComboBox de destino
                    combo2.innerHTML = "";

                    // Llena el ComboBox de destino con las opciones recibidas del servlet
                    data.forEach(function(option) {
                        var optionElement = document.createElement("option");
                        optionElement.text = option;
                        combo2.add(optionElement);
                    });
                },
                error: function() {
                    console.error('Error en la solicitud AJAX.');
                }
            });
        }

        // Llama a la función para llenar el ComboBox de destino inicialmente
        fillSecondComboBox();
  </script>    
    



</head>
<body>   
  <h1>Alta de Salida Turística</h1>
<form action="SVAltaSalidaTuristica" method="post" enctype="multipart/form-data">
    <br><br>
    <label for="departamento">Departamento:</label>
    <select id="ComboBox1" name="ComboBox1"onchange="fillSecondComboBox()">
    </select>
     <br><br>
    <label for="actividad">Actividad:</label>
    <select id="ComboBox2" name="ComboBox2">
    </select>  
    <br><br>
    <label for="actividades">Actividades Turisticas:</label>
    <select id="ComboBox2" name="ComboBox2" >
   <br><br>
   <label for="nombre">Nombre de la salida (único):</label>
    <input type="text" id="nombre" name="nombre" required>

    <br><br>

    <label for="fecha">Fecha/hora/lugar de salida:</label>
    <input type="datetime-local" id="fecha" name="fecha" required>

    <br><br>

    <label for="cantidad_maxima">Cantidad máxima de turistas:</label>
    <input type="number" id="cantidad_maxima" name="cantidad_maxima" required>

    <br><br>

    <label for="imagen">Imagen (opcional):</label>
    <input type="file" id="imagen" name="imagen">

    <br><br>

    <button type="submit">Crear Salida Turística</button>
    <button type="reset">Cancelar</button>
  </form>
     
</body>
</html>

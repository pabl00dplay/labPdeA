           
function enviarFormulario() {
            if (!sessionStorage.getItem("formularioEnviado")) {
                sessionStorage.setItem("formularioEnviado", "true");
                document.getElementById("botonOculto").click();
            };
};
window.onload = function() {
       setTimeout(enviarFormulario, 100);
};
function  evitaRedirección(event) {
            event.preventDefault(); // Evita la redirección
}
$(document).ready(function(){
    $("#toggleLink").click(function(event){
     event.preventDefault();
    $("#remaining").toggle();
        $(this).text($(this).text() === 'Leer mas' ? 'Leer menos' : 'Leer mas');
    });
 });

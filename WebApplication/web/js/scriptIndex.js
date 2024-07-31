       $(document).ready(function () {
    $('#logoutButton').click(function () {
        $.post('Logout.jsp', function () {
            window.location.href = 'Login.jsp'; // Redirigir a la página de inicio de sesión
        });
    });
});
// Detectar si el usuario ha vuelto a la página usando el botón de atrás
window.addEventListener('pageshow', function (event) {
    if (event.persisted) {
        // Recargar el header
        fetch('header.jsp')
                .then(response => response.text())
                .then(data => {
                    document.querySelector('.header-rectangle').innerHTML = new DOMParser().parseFromString(data, 'text/html').querySelector('.header-rectangle').innerHTML;
                });
    }
});
function reinicializarPestanas() {
    // Ejemplo de recarga de una hoja de estilo externa
    var head = document.getElementsByTagName('head')[0];
    var link = document.createElement('link');
    link.rel = 'stylesheet';
    link.type = 'text/css';
    link.href = 'styles/stylesPestanias.css'; // Ruta a tu hoja de estilos

    // Asegúrate de remover la hoja de estilo anterior (si es necesario)
    var existingLink = document.querySelector('link[href="styles/stylesPestanias.css"]');
    if (existingLink) {
        existingLink.parentNode.removeChild(existingLink);
    }

    head.appendChild(link); // Añadir la nueva hoja de estilo

    var script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = 'js/scriptsPestanias.js'; // Ruta a tu archivo JavaScript

    // Asegúrate de remover el script anterior (si es necesario)
    var existingScript = document.querySelector('script[src="js/scriptsPestanias.js"]');
    if (existingScript) {
        existingScript.parentNode.removeChild(existingScript);
    }
    head.appendChild(script); // Añadir el nuevo script
}

function loadContent() {
    event.preventDefault();

    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'Pestanias.jsp', true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            document.getElementById('box1').innerHTML = xhr.responseText;

            // Luego de insertar el contenido, reinicializa cualquier función necesaria
            reinicializarPestanas(); // Por ejemplo, si tienes una función para inicializar las pestañas
        }
    };
    xhr.send();
}
  
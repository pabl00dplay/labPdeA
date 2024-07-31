$(document).ready(function() {
    $('.tab-links a').on('click', function(e) {
        var currentAttrValue = $(this).attr('href');

        // Mostrar/ocultar las pestañas
        $('.tab' + currentAttrValue).show().siblings().hide();

        // Cambiar/añadir la clase activa
        $(this).parent('li').addClass('active').siblings().removeClass('active');

        e.preventDefault();
    });
});
$(document).ready(function () {
    $("#toggleLink").click(function (event) {
        event.preventDefault();
        $("#remaining").toggle();
        $(this).text($(this).text() === 'Leer mas' ? 'Leer menos' : 'Leer mas');
    });
});
    
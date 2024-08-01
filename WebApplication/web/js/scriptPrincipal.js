function agregarUserFoto(user, foto) {
      // Selecciona el enlace existente
    var oldLink = document.getElementById('login');

    // Crea un nuevo elemento de imagen
    var newImage = document.createElement('img');
    newImage.src = foto;
    newImage.width = 100; // Puedes ajustar el tamaño según tus necesidades
    newImage.height = 100; // Puedes ajustar el tamaño según tus necesidades
    // Reemplaza el enlace antiguo con la nueva imagen
    if (oldLink && oldLink.parentNode) {
        oldLink.parentNode.replaceChild(newImage, oldLink);
    }
    
    var barra = document.getElementById('separador');
    if (barra) {
        barra.innerHTML = '<span>&nbsp;</span>';
    }
    
    // Selecciona el enlace existente
    var oldLink2 = document.getElementById('Alta-Usuario');

    // Crea un nuevo elemento de enlace
    var newLink = document.createElement('a');
    newLink.id = 'Consulta-Usuario';
    newLink.href = 'ConsultaUsuario.jsp';
    newLink.textContent = user;
    // Reemplaza el enlace antiguo con el nuevo
    if (oldLink2 && oldLink2.parentNode) {
        oldLink2.parentNode.replaceChild(newLink, oldLink2);
    }
}

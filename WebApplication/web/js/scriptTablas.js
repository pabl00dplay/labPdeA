function llenardoslistas() {
            document.addEventListener("DOMContentLoaded", function() {
                const lista1 = document.getElementById("lista1");
                const lista2 = document.getElementById("lista2");
                

                lista1.addEventListener("click", function(event) {
                    if (event.target.tagName === "LI") {
                        // Remover la clase 'selected' de cualquier elemento previamente seleccionado
                        const previouslySelected = lista1.querySelector('.selected');
                        if (previouslySelected) {
                            previouslySelected.classList.remove('selected');
                        }

                        // Agregar la clase 'selected' al elemento actual
                        event.target.classList.add('selected');

                        const seleccion = event.target.getAttribute('data-value');

                        if (seleccion) {
                            fetch(`http://localhost:8080/WebApplication/SVDeptoCat?departamento=` + seleccion)
                               .then(response => {
                                   if (!response.ok) {
                                       throw new Error('Error en la respuesta del servidor');
                                   }
                                   return response.json();
                               })
                               .then(data => {
                                   lista2.innerHTML = ''; // Limpiar lista2 antes de agregar nuevas opciones
                                   data.forEach(function(item) {
                                       const li = document.createElement("li");
                                       li.textContent = item;
                                       lista2.appendChild(li);
                                   });
                               })
                               .catch(error => {
                                   console.error('Error al obtener las opciones:', error);
                               });
                        } else {
                            console.error('Selección vacía');
                        }
                    }
                });

               
            });
        }
        
function AgregarClickLista2() {
    const lista2 = document.getElementById("lista2");
 // Agregar evento de clic a los elementos de lista2
   lista2.addEventListener("click", function(event) {
   const formulario = document.getElementById("formulario");
   const inputHidden = document.getElementById("categoria");
   if (event.target.tagName === "LI") {
        const selectedValue = event.target.textContent;
        inputHidden.value = selectedValue;
        formulario.submit();
    }
});    


}
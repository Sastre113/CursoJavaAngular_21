const botonImagen = document.querySelector('#contenedor-miniaturas');
const principal = document.querySelector('#principal'); 
const pieFoto = document.querySelector('#pieFoto'); 

botonImagen.addEventListener('click', (e) => {
    e.preventDefault();
    maximizarFoto(e);

});

const maximizarFoto = (e) => {
    console.log(e);
    principal.innerHTML = e.target.outerHTML;
    pieFoto.innerHTML = e.target.alt;
}
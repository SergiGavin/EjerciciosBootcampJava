const parrafo = document.querySelector('p');

const btnRojo = document.querySelector('#rojo');

const btnAzul = document.querySelector('#azul');

btnRojo.addEventListener("click", function(){
    parrafo.style.color = "red";
});

btnAzul.addEventListener("click", function(){
    parrafo.style.color = "blue";
});
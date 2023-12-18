const btnPapelP1 = document.getElementById('papelP1');
const btnPiedraP1 = document.getElementById('piedraP1');
const btnTijerasP1 = document.getElementById('tijerasP1');
const btnPapelP2 = document.getElementById('papelP2');
const btnPiedraP2 = document.getElementById('piedraP2');
const btnTijerasP2 = document.getElementById('tijerasP2');
let labelResultado = document.getElementById('resultado');
let contadorP1 = document.getElementById('contador1');
let contadorP2 = document.getElementById('contador2');
const btnNextRound = document.getElementById('nextRound');
const btnReset = document.getElementById('reset');
const btnMaquina = document.getElementById('maquina');
let p2OrIA = document.getElementById('p2OrIA');


let eleccionP1 = "ninguna1";
let eleccionP2 = "ninguna2" ;
let estadoMaquina = false;

//Array para la maquina.
arrayIA = ["papel", "piedra", "tijeras"];



//Le damos valor a la variable del P1 o P2 dependiendo de lo seleccionado
btnPapelP1.addEventListener("click", function(){
    eleccionP1 = "papel";
    verificarResultado();
    verificarResultadoMaquina();
});
btnPapelP2.addEventListener("click",function(){
    eleccionP2 = "papel";
    estadoMaquina = false;
    verificarResultado();
});
btnPiedraP1.addEventListener("click",function(){
    eleccionP1 = "piedra";
    verificarResultado();
    verificarResultadoMaquina();
});
btnPiedraP2.addEventListener("click",function(){
    eleccionP2 = "piedra";
    estadoMaquina = false;
    verificarResultado();
});
btnTijerasP1.addEventListener("click",function(){
    eleccionP1 = "tijeras";
    verificarResultado();
    verificarResultadoMaquina();
});
btnTijerasP2.addEventListener("click",function(){
    eleccionP2 = "tijeras";
    estadoMaquina = false;
    verificarResultado();
});
btnNextRound.addEventListener("click", function(){
eleccionP1 = "ninguna1";
eleccionP2 = "ninguna2" ;
posicionAleatoria = Math.floor(Math.random()* 3);
eleccionIA = arrayIA[posicionAleatoria];
})
btnReset.addEventListener("click", function(){
    contadorP1.value = 0;
    contadorP2.value = 0;
    eleccionP1 = "ninguna1";
    eleccionP2 = "ninguna2" ;
    labelResultado.textContent = "";
    btnPapelP1.disabled = false;
    btnPapelP2.disabled = false;
    btnPiedraP1.disabled = false;
    btnPiedraP2.disabled = false;
    btnTijerasP1.disabled = false;
    btnTijerasP2.disabled = false;
    btnNextRound.disabled = false;
    btnMaquina.disabled = false;
    labelResultado.textContent = "";
    estadoMaquina = false;
    p2OrIA.textContent = "Jugador 2";
})

btnMaquina.addEventListener("click", function(){
    p2OrIA.textContent = "Máquina";
    estadoMaquina = true;
    posicionAleatoria = Math.floor(Math.random()* 3);
    eleccionIA = arrayIA[posicionAleatoria];
    
    if (!estadoMaquina && eleccionP1 === "ninguna1") {
        labelResultado.textContent = "JUGADOR 1 SELECCIONE UNA OPCION";
    } else {
        verificarResultadoMaquina();
    }
    contadorP1.value = 0;
    contadorP2.value = 0;
    labelResultado.textContent = "";
})
verificarGanador();
function verificarResultado(){
    //Para empate y no seleccionados
    if(estadoMaquina == false){
    if(eleccionP1 == eleccionP2){
        labelResultado.textContent = "EMPATE"
    }else if(eleccionP1 == "ninguna1"){
        labelResultado.textContent = "JUGADOR 1 SELECCIONE UNA OPCION"
    }else if(eleccionP2 == "ninguna2"){
        labelResultado.textContent = "JUGADOR 2 SELECCIONE UNA OPCION"
    }
    //Para la victoria del jugador 1.
    else if((eleccionP1 == "papel" && eleccionP2 == "piedra")
    || (eleccionP1 == "piedra" && eleccionP2 == "tijeras")
    || (eleccionP1 == "tijeras" && eleccionP2 == "papel"))
    {
        labelResultado.textContent = "HA GANADO EL JUGADOR 1";
        contadorP1.value++;
        verificarGanador()
    }
    //Para la victoria del jugador 2.
    else if((eleccionP2 == "papel" && eleccionP1 == "piedra")
    || (eleccionP2 == "piedra" && eleccionP1 == "tijeras")
    || (eleccionP2 == "tijeras" && eleccionP1 == "papel"))
    {
        labelResultado.textContent = "HA GANADO EL JUGADOR 2";
        contadorP2.value++;
        verificarGanador()
    }
}
}

    function verificarResultadoMaquina(){
    //Para empate y no seleccionados
    if(estadoMaquina){
    if(eleccionP1 == eleccionIA){
        labelResultado.textContent = "EMPATE"
    }else if(eleccionP1 == "ninguna1"){
        labelResultado.textContent = "JUGADOR 1 SELECCIONE UNA OPCION"
    }
    //Para la victoria del jugador 1.
    else if((eleccionP1 == "papel" && eleccionIA == "piedra")
    || (eleccionP1 == "piedra" && eleccionIA == "tijeras")
    || (eleccionP1 == "tijeras" && eleccionIA == "papel"))
    {
        labelResultado.textContent = "HA GANADO EL JUGADOR 1";
        contadorP1.value++;
        verificarGanador()
    }
    //Para la victoria del jugador 2.
    else if((eleccionIA == "papel" && eleccionP1 == "piedra")
    || (eleccionIA == "piedra" && eleccionP1 == "tijeras")
    || (eleccionIA == "tijeras" && eleccionP1 == "papel"))
    {
        labelResultado.textContent = "HA GANADO LA MAQUINA";
        contadorP2.value++;
        verificarGanador()
    }
}

}
function verificarGanador(){
    if(contadorP1.value == 5){
        labelResultado.textContent = "VICTORIA PARA JUGADOR 1. REINICIE LA PARTIDA PARA JUGAR MÁS";
        finDelJuego()
    }else if(contadorP2.value == 5 && !estadoMaquina){
        labelResultado.textContent = "VICTORIA PARA JUGADOR 2. REINICIE LA PARTIDA PARA JUGAR MÁS";
        finDelJuego()
    }else if(contadorP2.value == 5 && estadoMaquina){
        labelResultado.textContent = "VICTORIA PARA LA MAQUINA. REINICIE LA PARTIDA PARA JUGAR MÁS";
        finDelJuego()
    }
}
function finDelJuego(){
    btnPapelP1.disabled = true;
    btnPapelP2.disabled = true;
    btnPiedraP1.disabled = true;
    btnPiedraP2.disabled = true;
    btnTijerasP1.disabled = true;
    btnTijerasP2.disabled = true;
    btnNextRound.disabled = true;
    btnMaquina.disabled = true;
}

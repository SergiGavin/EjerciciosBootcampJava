let array = [];
let arrayIconos = ['🎨','🎁','🍕','🍤','👾','👿','😺','🥇','🎧','🏳‍🌈','🌝','🌚','🛴','🌏','🏯','🌦','🤬','🐈','🐥','🐬']


    function randomizar(){
    iconoRandom = Math.floor(Math.random()* 20);
    return iconoRandom;
    }

    function displayArray() {
        document.getElementById("arrayEmotes").textContent = array.join(", ");
    }


//PARTE DE AÑADIR

document.getElementById("push").addEventListener("click", function(){
    array.push(arrayIconos[randomizar()]);
    displayArray();
});
document.getElementById("unshift").addEventListener("click", function(){
    array.splice(0,0, arrayIconos[randomizar()]);
    displayArray();
});
document.getElementById("insert").addEventListener("click", function(){
    let posicion1 = document.getElementById("num_annadir").value;
    array.splice(posicion1,0, arrayIconos[randomizar()]);
    displayArray();
});

//PARTE DE BORRAR

document.getElementById("pop").addEventListener("click", function(){
    array.pop(arrayIconos[randomizar()]);
    displayArray();
});
document.getElementById("shift").addEventListener("click", function(){
    array.splice(0,1);
    displayArray();
});

document.getElementById("remove").addEventListener("click", function(){
    let posicion2 = document.getElementById("num_borrar").value;
    array.splice(posicion2,1);
    displayArray();
});






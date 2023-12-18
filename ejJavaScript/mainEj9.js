//1
let fraseA = "Hola estoy en clase de Java";

console.log(fraseA.replaceAll("a", "o"));
//2


function detectorAca (palabra){
    console.log(palabra.startsWith("aca"));
}
detectorAca("academia");
detectorAca("escuela")

function hola(){
    console.log("Hola 👾 ".repeat(3))
}
hola();
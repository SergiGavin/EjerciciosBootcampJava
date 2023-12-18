const PI = 1.141516; // Variable constante --> no la puedes modificar más adelante
let variableLet = "let" // Variable que se puede actualizar pero no declarar otra vez.
var variableVar = "var" // variable antigua que se puede volver a declarar y actualizar.

let variableInic;
variableInic = "He sido inicializada"
console.log(variableInic);
console.log(typeof variableInic);

let variableGlobal = "hola soy una variable global"
console.log(variableGlobal)

function saludar(){
    let variableLocal= "hola soy una variable local"
    return variableLocal;
}
console.log(saludar());

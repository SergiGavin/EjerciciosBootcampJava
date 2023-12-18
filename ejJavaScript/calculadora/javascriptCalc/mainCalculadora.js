"use strict";
let pantalla = document.getElementById('pantalla_calc');
const boton1 = document.getElementById('1');
const boton2 = document.getElementById('2');
const boton3 = document.getElementById('3');
const boton4 = document.getElementById('4');
const boton5 = document.getElementById('5');
const boton6 = document.getElementById('6');
const boton7 = document.getElementById('7');
const boton8 = document.getElementById('8');
const boton9 = document.getElementById('9');
const boton0 = document.getElementById('0');
const botonDel = document.getElementById('del');
const botonSuma = document.getElementById('suma');
const botonResta = document.getElementById('restar');
const botonMultiplica = document.getElementById('multiplicar');
const botonDividir = document.getElementById('dividir');
const botonReset = document.getElementById('reset');
const botonIgual = document.getElementById('igual');
const botonComa = document.getElementById('coma');
let num1 = "";
let num2 = "";
let operacion = "";
let numero1Float;
let numero2Float;
let resultado;
//Si el operador esta vacio(aun no se ha usado) se guardará el num1 como valor. Si ha sido usado el operador sera el num2
function establecerNumero(numero) {
    if (numero === "," && (num1.includes(",") || num2.includes(","))) {
        return;
    }
    if (operacion === "") {
        num1 += numero;
        numero1Float = parseFloat(num1);
        actualizarPantalla1();
    }
    else {
        num2 += numero;
        numero2Float = parseFloat(num2);
        actualizarPantalla3();
    }
}
/*
            BOTONES NUMEROS
*/
boton1 === null || boton1 === void 0 ? void 0 : boton1.addEventListener("click", () => {
    establecerNumero("1");
});
boton2 === null || boton2 === void 0 ? void 0 : boton2.addEventListener("click", () => {
    establecerNumero("2");
});
boton3 === null || boton3 === void 0 ? void 0 : boton3.addEventListener("click", () => {
    establecerNumero("3");
});
boton4 === null || boton4 === void 0 ? void 0 : boton4.addEventListener("click", () => {
    establecerNumero("4");
});
boton5 === null || boton5 === void 0 ? void 0 : boton5.addEventListener("click", () => {
    establecerNumero("5");
});
boton6 === null || boton6 === void 0 ? void 0 : boton6.addEventListener("click", () => {
    establecerNumero("6");
});
boton7 === null || boton7 === void 0 ? void 0 : boton7.addEventListener("click", () => {
    establecerNumero("7");
});
boton8 === null || boton8 === void 0 ? void 0 : boton8.addEventListener("click", () => {
    establecerNumero("8");
});
boton9 === null || boton9 === void 0 ? void 0 : boton9.addEventListener("click", () => {
    establecerNumero("9");
});
boton0 === null || boton0 === void 0 ? void 0 : boton0.addEventListener("click", () => {
    establecerNumero("0");
});
/*
            BOTONES OPERADORES
*/
botonSuma === null || botonSuma === void 0 ? void 0 : botonSuma.addEventListener("click", () => {
    operacion = "+";
    actualizarPantalla2();
});
botonResta === null || botonResta === void 0 ? void 0 : botonResta.addEventListener("click", () => {
    operacion = "-";
    actualizarPantalla2();
});
botonDividir === null || botonDividir === void 0 ? void 0 : botonDividir.addEventListener("click", () => {
    operacion = "/";
    actualizarPantalla2();
});
botonMultiplica === null || botonMultiplica === void 0 ? void 0 : botonMultiplica.addEventListener("click", () => {
    operacion = "*";
    actualizarPantalla2();
});
botonIgual === null || botonIgual === void 0 ? void 0 : botonIgual.addEventListener("click", () => {
    resultado = resultadoFinal(numero1Float, numero2Float, operacion);
    actualizarPantallaResultado();
    disableBtn();
});
botonDel === null || botonDel === void 0 ? void 0 : botonDel.addEventListener("click", () => {
    resetVariables();
    actualizarPantallaVacia();
});
botonComa === null || botonComa === void 0 ? void 0 : botonComa.addEventListener("click", () => {
    establecerNumero(".");
});
botonReset === null || botonReset === void 0 ? void 0 : botonReset.addEventListener("click", () => {
    undisableBtn();
    actualizarPantallaVacia();
    resetVariables();
});
function resultadoFinal(numero1Float, numero2Float, operacion) {
    if (operacion != null) {
        const numero1Float = parseFloat(num1.replace(',', '.'));
        const numero2Float = parseFloat(num2.replace(',', '.'));
        switch (operacion) {
            case "+":
                resultado = numero1Float + numero2Float;
                console.log("resultado suma " + resultado);
                break;
            case "-":
                resultado = numero1Float - numero2Float;
                console.log("resultado resta " + resultado);
                break;
            case "*":
                resultado = numero1Float * numero2Float;
                console.log("resultado multi " + resultado);
                break;
            case "/":
                resultado = numero1Float / numero2Float;
                console.log("resultado divi" + resultado);
                break;
            default:
                break;
        }
    }
    return resultado;
}
function actualizarPantalla1() {
    if (pantalla) {
        pantalla.textContent = num1;
    }
    console.log("Pantalla1: " + num1);
}
function actualizarPantalla2() {
    if (pantalla) {
        pantalla.textContent = num1 + operacion;
    }
    console.log("Pantalla operacion: " + num1 + operacion);
}
function actualizarPantalla3() {
    if (pantalla) {
        pantalla.textContent = num1 + operacion + num2;
    }
    console.log("Pantalla 3: " + num1 + operacion + num2);
}
function actualizarPantallaResultado() {
    if (pantalla) {
        pantalla.textContent = resultado.toString();
    }
    console.log("Pantalla 3: " + resultado);
}
function disableBtn() {
    boton0.disabled = true;
    boton1.disabled = true;
    boton2.disabled = true;
    boton3.disabled = true;
    boton4.disabled = true;
    boton5.disabled = true;
    boton6.disabled = true;
    boton7.disabled = true;
    boton8.disabled = true;
    boton9.disabled = true;
    boton0.disabled = true;
    botonSuma.disabled = true;
    botonDel.disabled = true;
    botonResta.disabled = true;
    botonDividir.disabled = true;
    botonMultiplica.disabled = true;
    botonIgual.disabled = true;
    botonComa.disabled = true;
}
function undisableBtn() {
    boton0.disabled = false;
    boton1.disabled = false;
    boton2.disabled = false;
    boton3.disabled = false;
    boton4.disabled = false;
    boton5.disabled = false;
    boton6.disabled = false;
    boton7.disabled = false;
    boton8.disabled = false;
    boton9.disabled = false;
    boton0.disabled = false;
    botonSuma.disabled = false;
    botonDel.disabled = false;
    botonResta.disabled = false;
    botonDividir.disabled = false;
    botonMultiplica.disabled = false;
    botonIgual.disabled = false;
    botonComa.disabled = false;
}
function actualizarPantallaVacia() {
    if (pantalla) {
        pantalla.textContent = "";
    }
}
function resetVariables() {
    num1 = "";
    num2 = "";
    operacion = "";
    numero1Float = 0;
    numero2Float = 0;
    resultado = 0;
}

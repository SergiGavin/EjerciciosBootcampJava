"use strict";
let enunciado = document.getElementById('pregunta');
let opcion1 = document.getElementById('opcion1');
let opcion2 = document.getElementById('opcion2');
let opcion3 = document.getElementById('opcion3');
let opcion4 = document.getElementById('opcion4');
let piePagina = document.getElementById('texto_piePagina');
let preguntaActual = 0;
let respuestaUsuario;
let score = 0;
//Clase pregunta. (Si se hace en otro archivo salta error de modulo no detectado)
class Pregunta {
    constructor(enunciado, opcion1, opcion2, opcion3, opcion4, respuestaCorrecta) {
        this.enunciado = enunciado;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.respuestaCorrecta = respuestaCorrecta;
    }
}
const preguntas = [
    new Pregunta("¿Cuál es el planeta más grande del sistema solar?", "Marte", "Venus", "Jupiter", "Saturno", 3),
    new Pregunta("¿Cuál es el río más largo del mundo?", "Nilo", "Amazonas", "Misisipi", "Yangtsé", 2),
    new Pregunta("¿Cuál es el símbolo químico del oro?", "Ag", "Fe", "Au", "Hg", 3),
    new Pregunta("¿Cuál es el resultado de 7 x 9?", "49", "56", "63", "72", 3),
    new Pregunta("¿Cuál de los siguientes elementos es un gas noble?", "Oxígeno", "Hidrógeno", "Helio", "Carbono", 3),
    new Pregunta("¿Cuál es la capital de Francia?", "Londres", "Madrid", "Berlín", "París", 4),
    new Pregunta("¿Cuál de los siguientes animales es un mamífero marino?", "Tiburón", "Delfín", "Pez payaso", "Tortuga", 2),
    new Pregunta("¿En qué año se firmó la Declaración de Independencia de los Estados Unidos?", "1620", "1776", "1789", "1812", 2),
    new Pregunta("¿Cuál es la montaña más alta del mundo?", "Mont Blanc", "Monte Everest", "Kilimanjaro", "Mont McKinley", 2),
    new Pregunta("¿Quién escribió la obra Romeo y Julieta?", "Charles Dickens", "William Shakespeare", "Jane Austen", "F. Scott Fitzgerald", 2)
];
mostrarPregunta();
opcion1 === null || opcion1 === void 0 ? void 0 : opcion1.addEventListener("click", () => {
    respuestaUsuario = 1;
    comprobarRespuesta();
});
opcion2 === null || opcion2 === void 0 ? void 0 : opcion2.addEventListener("click", () => {
    respuestaUsuario = 2;
    comprobarRespuesta();
});
opcion3 === null || opcion3 === void 0 ? void 0 : opcion3.addEventListener("click", () => {
    respuestaUsuario = 3;
    comprobarRespuesta();
});
opcion4 === null || opcion4 === void 0 ? void 0 : opcion4.addEventListener("click", () => {
    respuestaUsuario = 4;
    comprobarRespuesta();
});
function añadirDatos() {
    const pregunta = preguntas[preguntaActual];
    if (pregunta != null && enunciado != null && opcion1 != null && opcion1 != null && opcion2 != null && opcion3 != null && opcion4 != null) {
        enunciado.textContent = pregunta.enunciado;
        opcion1.textContent = pregunta.opcion1;
        opcion2.textContent = pregunta.opcion2;
        opcion3.textContent = pregunta.opcion3;
        opcion4.textContent = pregunta.opcion4;
    }
}
function avanzarPregunta() {
    preguntaActual++;
    mostrarPregunta();
}
function mostrarPregunta() {
    if (preguntaActual < preguntas.length) {
        const pregunta = preguntas[preguntaActual];
        if (pregunta != null && enunciado != null && opcion1 != null && opcion1 != null && opcion2 != null && opcion3 != null && opcion4 != null && piePagina != null) {
            enunciado.textContent = pregunta.enunciado;
            opcion1.textContent = pregunta.opcion1;
            opcion2.textContent = pregunta.opcion2;
            opcion3.textContent = pregunta.opcion3;
            opcion4.textContent = pregunta.opcion4;
            piePagina.textContent = "Pregunta " + (preguntaActual + 1) + " de 10";
        }
    }
    else {
        window.alert("Fin del Quiz! Has acertado " + score + " preguntas");
    }
}
function comprobarRespuesta() {
    const pregunta = preguntas[preguntaActual];
    if (respuestaUsuario == pregunta.respuestaCorrecta) {
        window.alert("Respuesta correcta");
        score++;
    }
    else {
        window.alert("Respuesta incorrecta");
    }
    preguntaActual++;
    mostrarPregunta();
}

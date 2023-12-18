//PUNTO 1
const saludo = (nombre, apellido1, apellido2) =>{
    return  "Hola " + nombre + " " + apellido1 + " " + apellido2;
};
console.log(saludo("Sergi","Gavin","Serrano"));
//PUNTO 2
function saludoSinReturn (aprobado){
    console.log("He aprobado el examen? " + aprobado);
}
saludoSinReturn(true);

//PUNTO 3
function personasEnClase(...alumnos){
    alumnos.forEach(element => {
        console.log(element)
    })
}
personasEnClase(1,2,3,4,5);
//Parte 1
function sumaTresNum(num1, num2, num3){
    num1;
    num2;
    num3;
    resultado = num1 + num2 + num3;
    console.log(resultado);
    return resultado;
}
sumaTresNum(1, 5, 3)
//Parte 2
function apellidos(nombre, apellido1, apellido2){
    console.log(nombre+ " " +apellido1+ " " +apellido2)
}
apellidos("Sergi", "Gavín", "Serrano");

//Parte 3

function numMasAlto(num1, num2){
    if(num1 > num2){
        return num1;
    }else if(num2 > num1){
        return num2;
    }
}
console.log(numMasAlto(1,3))

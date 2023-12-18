// 1.
let comida1 = ['🍔','🌯','🍣','🍕','🍜','🍱','🍙','🍘','🥑'];
console.log(comida1.fill('🍺', 4, comida1.length));
//2 .

let comida2 = ['🍕','🍕','🍍','🍕','🍕'];
console.log(comida2.includes('🍍'));

//3.
let comida3 = ['🍕','🍕','🍍','🍕','🍕'];
comida3.splice(2,1);
console.log(comida3);

//4
let comida4 = ['🍓','🍋','🍓','🍋','🍓'];
comida4Modificada = comida4.map((element) => {
    if(element === '🍓'){
        return '🍄';
    }else{
        return element;
    }
})
console.log(comida4Modificada);

//5

comida5 = ['🌶','🥛','🌶','🥛','🌶','🥛'];
comida5Modificada = comida5.flatMap((element) =>{
    if(element === '🌶'){
        return ['🌶','🥵'];
    }else{
        return element;
    }
})
console.log(comida5Modificada);

//6

cartas = ['🎴','🎴','🎴','🃏','🎴','🎴','🎴'];
let i= 0;
cartasModificadas = cartas.flatMap(element=>{
        //Si hay carta normal y la siguiente posicion tambien devuelva normal + joker
        if(element =='🎴' && cartas[i+1] == '🎴'){
            i++
            return ['🎴','🃏'];
        //Si hay carta normal y la siguiente posicion joker devuelve solo normal.
        } else if (element =='🎴' && cartas[i+1] == '🃏') {
            i++
            return ['🎴'];
        //Si hay joker y luego carta normal devolvemos joker.
        } else if (element =='🃏' && cartas[i+1] == '🎴'){
            i++
            return ['🃏'];
            //Para el ultimo joker
        }else {
            return ['🎴'];
        }   
        });
console.log(cartasModificadas);


/*
 if(cartas.at(-1)=='🃏'){
            return ['🎴'];
        }else if (element === '🎴') {
            return ['🎴','🃏'];
        }
        return element;


*/
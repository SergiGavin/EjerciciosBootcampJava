
    
const imagenPingu = document.getElementById('pingu') as HTMLImageElement;
//as HTMLAudioElement; nos permite utilizar play() en ese elemento
const sonido = document.getElementById('sonido') as HTMLAudioElement;
let barraComida = document.getElementById('linea_hambre') as HTMLProgressElement;
let barraJugar = document.getElementById('linea_play') as HTMLProgressElement;
let barraPelea = document.getElementById('linea_fight') as HTMLProgressElement;
let barraDormir = document.getElementById('linea_sleep') as HTMLProgressElement;
let barraGeneral = document.getElementById('linea_general') as HTMLProgressElement;

const eat = document.getElementById('eat');
const play = document.getElementById('play');
const fight = document.getElementById('fight');
const sleep = document.getElementById('sleep');

let textoEat = document.getElementById('texto_eat');
let textoPlay = document.getElementById('texto_play');
let textoFight = document.getElementById('texto_fight');
let textoSleep = document.getElementById('texto_sleep');
let textoGeneral = document.getElementById('texto_general');

const imagenEstado = document.getElementById('estado') as HTMLImageElement;

const valorInicial: number = 100;
const valorDisminuirComida: number = 30;
const valorDisminuirJugar: number = 25;
const valorDisminuirPelea: number = 20;
const valorDisminuirDormir: number = 10;
const valorAugmentar: number = 40;

if(barraComida){
    barraComida.value = valorInicial;
    if(textoEat){
        textoEat.textContent = valorInicial +"% Full";
    }
    
}
if(barraJugar){
    barraJugar.value = valorInicial;
    if(textoPlay){
        textoPlay.textContent = valorInicial +"% Fun";
    }
}
if(barraPelea){
    barraPelea.value = valorInicial;
    if(textoFight){
        textoFight.textContent = valorInicial +"% Strength";
    }
}
if(barraDormir){
    barraDormir.value = valorInicial;
    if(textoSleep){
        textoSleep.textContent = valorInicial +"% Energy";
    }
}
if(barraGeneral){
    barraGeneral.value = valorInicial;
    if(textoGeneral){
        textoGeneral.textContent = valorInicial +"% Hapiness";
    }
}

imagenPingu?.addEventListener("click", () => {
    sonido?.play();
})

setInterval(() => {
    if (barraComida != null) {
    disminuirValorComida(barraComida);}
    if (barraJugar != null) {
    disminuirValorJugar(barraJugar);}
    if (barraPelea != null) {
    disminuirValorPelea(barraPelea);}
    if (barraDormir != null) {
    disminuirValorDormir(barraDormir);}
    if(barraGeneral != null){
        barraGeneral.value= mediaFelicidadPingu()
        if(textoGeneral){
            textoGeneral.textContent = mediaFelicidadPingu() +"% Hapiness";
        }
    }
    cambioImagen();
}, 4500)
eat?.addEventListener("click", () => {
        barraComida.value += valorAugmentar;
        if(textoEat && textoGeneral){
            textoEat.textContent = barraComida.value +"% Full";
            textoGeneral.textContent = mediaFelicidadPingu() +"% Hapiness";
            barraGeneral.value = mediaFelicidadPingu()
            cambioImagen();
        }
});
play?.addEventListener("click", () => {
    barraJugar.value += valorAugmentar;
    if(textoPlay && textoGeneral){
        textoPlay.textContent = barraJugar.value +"% Fun";
        textoGeneral.textContent = mediaFelicidadPingu() +"% Hapiness";
        barraGeneral.value = mediaFelicidadPingu();
        cambioImagen();
    }
});
fight?.addEventListener("click", () => {
    barraPelea.value += valorAugmentar;
    if(textoFight && textoGeneral){
        textoFight.textContent = barraPelea.value +"% Strength";
        textoGeneral.textContent = mediaFelicidadPingu() +"% Hapiness";
        barraGeneral.value = mediaFelicidadPingu();
        cambioImagen();
    }
})
sleep?.addEventListener("click", () => {
    barraDormir.value += valorAugmentar;
    if(textoSleep && textoGeneral){
        textoSleep.textContent = barraDormir.value +"% Energy";
        textoGeneral.textContent = mediaFelicidadPingu() +"% Hapiness";
        barraGeneral.value = mediaFelicidadPingu()
        cambioImagen();
    }
})




function disminuirValorComida(a: any) {
    if (a.value > 0) {
        a.value -= valorDisminuirComida;
        if(textoEat){
            textoEat.textContent = a.value +"% Full";
        }
    }
}
function disminuirValorJugar(a: any) {
    if (a.value > 0) {
        a.value -= valorDisminuirJugar;
        if(textoPlay){
            textoPlay.textContent = a.value +"% Fun";
        }
    }
}
function disminuirValorPelea(a: any) {
    if (a.value > 0) {
        a.value -= valorDisminuirPelea;
        if(textoFight){
            textoFight.textContent = a.value +"% Strength";
        }
    }
}
function disminuirValorDormir(a: any) {
    if (a.value > 0) {
        a.value -= valorDisminuirDormir;
        if(textoSleep){
            textoSleep.textContent = a.value +"% Energy";
        }
    }
}
function mediaFelicidadPingu(){
    let mediaFelicidad = (barraComida.value + barraJugar.value + barraPelea.value + barraDormir.value) /4
    return mediaFelicidad;
}
function cambioImagen(){
    if(imagenEstado != null){
        if(barraGeneral.value >= 0 && barraGeneral.value < 25){
            imagenEstado.src = "./elementosCss/calavera.png";
            
        }else if(barraGeneral.value >= 25 && barraGeneral.value < 50){
            imagenEstado.src = "./elementosCss/enfadado.png";
        }else if(barraGeneral.value >= 50 && barraGeneral.value < 75){
            imagenEstado.src = "./elementosCss/sonrisa.png";
        }else if(barraGeneral.value >= 75 && barraGeneral.value <= 100){
            imagenEstado.src = "./elementosCss/corazon.png";
        }
    }
}


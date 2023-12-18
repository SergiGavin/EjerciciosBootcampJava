const fotoGen1 = document.getElementById('fotoGen1');
const fotoGen2 = document.getElementById('fotoGen2');
const fotoGen3 = document.getElementById('fotoGen3');
const fotoGen4 = document.getElementById('fotoGen4');
const fotoGen5 = document.getElementById('fotoGen5');
const fotoGen6 = document.getElementById('fotoGen6');
const sonido1 = document.getElementById('sonido1') as HTMLAudioElement;
const sonido2 = document.getElementById('sonido2') as HTMLAudioElement;
const sonido3 = document.getElementById('sonido3') as HTMLAudioElement;
const sonido4 = document.getElementById('sonido4') as HTMLAudioElement;
const sonido5 = document.getElementById('sonido5') as HTMLAudioElement;
const sonido6 = document.getElementById('sonido6') as HTMLAudioElement;
const btn_volumenMas = document.getElementById('volumenMas');
const btn_volumenMenos = document.getElementById('volumenMenos');
const btn_Reset = document.getElementById('reset');
const btn_stop = document.getElementById('stop');
const btn_selection = document.getElementById('selection');

let volumen = 0.5;
let reproduciendo:number; 
let tiempo:number = 0;

fotoGen1?.addEventListener("click",() => {
    sonido1.play();
    reproduciendo = 1;
    imagenesOff1()
})
fotoGen2?.addEventListener("click",() => {
    sonido2.play();
    reproduciendo = 2;
    imagenesOff2()
})
fotoGen3?.addEventListener("click",() => {
    sonido3.play();
    reproduciendo = 3;
    imagenesOff3()
})
fotoGen4?.addEventListener("click",() => {
    sonido4.play();
    reproduciendo = 4;
    imagenesOff4()
})
fotoGen5?.addEventListener("click",() => {
    sonido5.play();
    reproduciendo = 5;
    imagenesOff5()
})
fotoGen6?.addEventListener("click",() => {
    sonido6.play();
    reproduciendo = 6;
    imagenesOff6()
})
console.log(volumen)
btn_volumenMas?.addEventListener("click", () => {
    console.log(volumen);
    if(reproduciendo != null){
        if(volumen >=0.99){
            window.alert("Volumen al maximo")
        }else{
            volumen+= 0.1;
        }
        if(reproduciendo == 1){
            sonido1.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 2){
            sonido2.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 3){
            sonido3.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 4){
            sonido4.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 5){
            sonido5.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 6){
            sonido6.volume = volumen
            console.log(volumen);
        }
    }
    
});
btn_volumenMenos?.addEventListener("click", () => {
    console.log(volumen);
    if(reproduciendo != null){
        if(volumen <= 0.10){
            window.alert("Volumen al minimo")
        }else{
            volumen-= 0.1;
        }
        if(reproduciendo == 1){
            sonido1.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 2){
            sonido2.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 3){
            sonido3.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 4){
            sonido4.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 5){
            sonido5.volume = volumen
            console.log(volumen);
        }else if(reproduciendo == 6){
            sonido6.volume = volumen
            console.log(volumen);
        }
    }
})
btn_stop?.addEventListener("click", () => {
    if(reproduciendo != null){
        if(reproduciendo == 1){
            if(!sonido1.paused){
                sonido1.pause();
                tiempo = sonido1.currentTime;
                console.log(tiempo);
            }else{
                tiempo = sonido1.currentTime;
                sonido1.play();
                console.log(tiempo);
            }
        }else if(reproduciendo == 2){
            if(!sonido2.paused){
                sonido2.pause();
                tiempo = sonido2.currentTime;
                console.log(tiempo);
            }else{
                tiempo = sonido2.currentTime;
                sonido2.play();
                console.log(tiempo);
            }
        }else if(reproduciendo == 3){
            if(!sonido3.paused){
                sonido3.pause();
                tiempo = sonido1.currentTime;
                console.log(tiempo);
            }else{
                tiempo = sonido3.currentTime;
                sonido3.play();
                console.log(tiempo);
            }
        }else if(reproduciendo == 4){
            if(!sonido4.paused){
                sonido4.pause();
                tiempo = sonido4.currentTime;
                console.log(tiempo);
            }else{
                tiempo = sonido4.currentTime;
                sonido4.play();
                console.log(tiempo);
            }
        }else if(reproduciendo == 5){
            if(!sonido5.paused){
                sonido5.pause();
                tiempo = sonido5.currentTime;
                console.log(tiempo);
            }else{
                tiempo = sonido5.currentTime;
                sonido5.play();
                console.log(tiempo);
            }
        }else if(reproduciendo == 6){
            if(!sonido6.paused){
                sonido6.pause();
                tiempo = sonido6.currentTime;
                console.log(tiempo);
            }else{
                tiempo = sonido6.currentTime;
                sonido6.play();
                console.log(tiempo);
            }
        }
}
})

btn_Reset?.addEventListener("click", () => {
    if(reproduciendo != null){
        if(reproduciendo == 1){
            sonido1.currentTime = 0;    
            sonido1.play();
        }else if(reproduciendo == 2){
            sonido2.currentTime = 0;   
            sonido2.play();
        }else if(reproduciendo == 3){
            sonido3.currentTime = 0;   
            sonido3.play();
        }else if(reproduciendo == 4){
            sonido4.currentTime = 0;   
            sonido4.play();
        }else if(reproduciendo == 5){
            sonido5.currentTime = 0;   
            sonido5.play();
        }else if(reproduciendo == 6){
            sonido6.currentTime = 0;   
            sonido6.play();
        }
    }
})
btn_selection?.addEventListener("click", () => {
    location.reload();
})

function imagenesOff1(){
    if(
        fotoGen2 != null && fotoGen3 != null  && fotoGen4 != null && fotoGen5 != null  && fotoGen6 != null)
    {
        fotoGen2.classList.add("imagen_Off");
        fotoGen3.classList.add("imagen_Off");
        fotoGen4.classList.add("imagen_Off");
        fotoGen5.classList.add("imagen_Off");
        fotoGen6.classList.add("imagen_Off");
        
    }
}
function imagenesOff2(){
    if(fotoGen1 != null && fotoGen3 != null  && fotoGen4 != null && fotoGen5 != null  && fotoGen6 != null)
    {
        fotoGen1.classList.add("imagen_Off");
        fotoGen3.classList.add("imagen_Off");
        fotoGen4.classList.add("imagen_Off");
        fotoGen5.classList.add("imagen_Off");
        fotoGen6.classList.add("imagen_Off");
    }
}
function imagenesOff3(){
    if(fotoGen1 != null && fotoGen2 != null  && fotoGen4 != null && fotoGen5 != null  && fotoGen6 != null)
    {
        fotoGen1.classList.add("imagen_Off");
        fotoGen2.classList.add("imagen_Off");
        fotoGen4.classList.add("imagen_Off");
        fotoGen5.classList.add("imagen_Off");
        fotoGen6.classList.add("imagen_Off");
    }
}
function imagenesOff4(){
    if(fotoGen1 != null && fotoGen2 != null  && fotoGen3 != null && fotoGen5 != null  && fotoGen6 != null)
    {
        fotoGen1.classList.add("imagen_Off");
        fotoGen2.classList.add("imagen_Off");
        fotoGen3.classList.add("imagen_Off");
        fotoGen5.classList.add("imagen_Off");
        fotoGen6.classList.add("imagen_Off");
    }
}
function imagenesOff5(){
    if(fotoGen1 != null && fotoGen2 != null  && fotoGen3 != null && fotoGen4 != null  && fotoGen6 != null)
    {
        fotoGen1.classList.add("imagen_Off");
        fotoGen2.classList.add("imagen_Off");
        fotoGen3.classList.add("imagen_Off");
        fotoGen4.classList.add("imagen_Off");
        fotoGen6.classList.add("imagen_Off");
    }
}
function imagenesOff6(){
    if(fotoGen1 != null && fotoGen2 != null  && fotoGen3 != null && fotoGen4 != null  && fotoGen5 != null)
    {
        fotoGen1.classList.add("imagen_Off");
        fotoGen2.classList.add("imagen_Off");
        fotoGen3.classList.add("imagen_Off");
        fotoGen4.classList.add("imagen_Off");
        fotoGen5.classList.add("imagen_Off");
    }
}

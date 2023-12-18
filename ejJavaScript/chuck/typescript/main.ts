
const broma = 'https://api.chucknorris.io/jokes/random';
let frase = document.getElementById('frase');
const boton = document.getElementById('btn');
let fraseChuck;
fetch(broma)
.then(response => response.json())
.then(json => {
    fraseChuck = json.value;
    if(frase != null){
        frase.textContent = fraseChuck;
        console.log(fraseChuck);
    }
});

boton?.addEventListener("click",()=>{
    location.reload();
})


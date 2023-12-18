let carta1 = document.getElementById('carta1');
let carta2 = document.getElementById('carta2');

carta1?.addEventListener("mouseenter", function(){
    carta1.src="Ejercicio carta/card-front.png";
})
carta2?.addEventListener("mouseenter", function(){
    carta2.src="Ejercicio carta/card-front.png";
})
carta1?.addEventListener("mouseout", function(){
    carta1.src="Ejercicio carta/card-back.png";
})
carta2?.addEventListener("mouseout", function(){
    carta2.src="Ejercicio carta/card-back.png";
})
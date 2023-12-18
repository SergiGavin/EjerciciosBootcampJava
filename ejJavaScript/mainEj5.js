function numeroRandom(){
    let numRandom = Math.round(Math.random()*1)
    if(numRandom == 0){
        console.log("CRUZ")
    }else if(numRandom == 1){
        console.log("CARA")
    }
    return numRandom
}
numeroRandom();

const numRandom = (min, max) => {
   return Math.random() * (max - min) + min;
}

const dado = (cantDados) => {
    let arrayDados = new Array();
    let sumaTotal = 0;

    for (let i = 0; i < cantDados; i++) { 
        let valor = Math.trunc(numRandom(1, 7));
        arrayDados.push(valor);
    }
    


    arrayDados.forEach(element => {
        sumaTotal += element;
    });

    return sumaTotal;
}

const idxTirada = (array,valorBuscado) =>{
    let idx = -1,encontrado = false;

    if(array.length != 0){
        for(let i = 0; i < array.length && !encontrado; i++){
            if(array[i].tirada == valorBuscado){
                encontrado = true;
                idx = i;
            }     
        }
            
    }

    return idx;
}


let resultadoDados;
let arrayResultados = new Array();
 

for (let i = 0; i < 36000; i++) {
    resultadoDados = dado(2);

    if(idxTirada(arrayResultados,resultadoDados) == -1)
        arrayResultados.push({tirada: resultadoDados, count:0});
    else
        arrayResultados[idxTirada(arrayResultados,resultadoDados)].count += 1;

}





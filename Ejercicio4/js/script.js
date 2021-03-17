const valores = [true,5,false,"hola","adios",2];

let valoresBooleanos = valores.filter(valor => typeof valor === 'boolean');
let valoresString = valores.filter(valor => typeof valor === 'string');
let valoresEnteros = valores.filter(valor => typeof valor === 'number');
let maximo = "";

for(let i = 0; i < valoresString.length; i++){
    if(valoresString[i] > maximo){
        maximo = valoresString[i]
    }      
}

alert(`Contenido de maximo: ${maximo} es la mayor del array: "${valoresString}"`);


let resSuma = valoresEnteros[0] + valoresEnteros[1];
let resMultiplicacion = valoresEnteros[0] * valoresEnteros[1];
let resResta = valoresEnteros[0] - valoresEnteros[1];
let resDivision = valoresEnteros[0] / valoresEnteros[1];
let resModulo = valoresEnteros[0] % valoresEnteros[1];
debugger
let factorial = prompt(`Pasame un número y te calculo su factorial`);
let resultado = 1;

for(let i = factorial; i > 0; i--){
    resultado *= i;
}

alert(`El factorial de ${factorial} es ${resultado}`);
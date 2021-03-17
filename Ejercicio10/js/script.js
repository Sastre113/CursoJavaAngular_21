let cadena = prompt("Pasame una cadena de texto y te digo si es un palíndromo. (No introduzca signos ortográficos)");

const palindromo = (x) => {
    let array = x.split('').filter(x => x.charCodeAt() != 32);
    
    let msg = "";
    let esPalindromo = true;

    if(array.length > 2){
        for(let i = 0, j = array.length; i < array.length/2 && esPalindromo; i++, j--){
            esPalindromo = array[i].toLowerCase() == array[j-1].toLowerCase() ?  true : false;
        }
    } else
        esPalindromo = false;

    if(esPalindromo)
        msg = "es palíndromo"
    else
        msg = "no es palíndromo"

    return msg;
};

alert(`La cadena ${palindromo(cadena)}`);
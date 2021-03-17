let cadena = prompt("Pasame una cadena de texto");

const msg = (x) => {
    let msg = "";
    let mayus = false,min = false;
    array = x.split('');

    array.forEach(element => {
        if(element.charCodeAt() > 64 && element.charCodeAt() < 86)
            mayus = true;
        if(element.charCodeAt() > 96 && element.charCodeAt() < 123)
            min = true;
    });

    if(mayus && min)
        msg = "mayúsculas y minúsculas";
    else if(mayus)
        msg = "solo mayúsculas";
    else
        msg = "solo minúsculas";

    return msg;
};

alert(`La cadena contiene ${msg(cadena)}`);
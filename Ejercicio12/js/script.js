
let fecha = "Nací el 05/04/1982 en Donostia.";


const encontrarFecha = cadena => {
    let str = cadena.split(' ');
    let eR = /^([0][1-9]|[12][0-9]|3[01])(\/|-)([0][1-9]|[1][0-2])\2(\d{4})$/;
    let fecha = "";
    let encontrado = false;

    for (let i = 0; i < str.length && !encontrado; i++) {
        if (eR.test(str[i])) {
            fecha = str[i];
            encontrado = true;
        }

    }

    if (typeof fecha !== "undefined")
        alert(`La ${fecha} es valida`)
    else
        alert(`No se ha encontrado ninguna fecha valida`)
}

encontrarFecha(fecha);

const validarEmail = () => {
    let str = "miguel@hotmail.com";
    let str2 = "miguelAhotmail.com";
    let eREmail = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;

    alert(`¿Es valido el email ${str} ? ${eREmail.test(str)}`);
    alert(`¿Es valido el email ${str2} ? ${eREmail.test(str2)}`);
}

validarEmail();


const replazarEscapeHTML = (str) => {
    let replacements = [["&", /&amp;/], ["\/", /&quot;/], ["<", /&lt;/], [">", /&gt;/]]

    replacements.forEach(x => {
        str = str.replace(x[1], x[0]);
    });

    alert(str);
}

replazarEscapeHTML("Hola, Pepe &amp; Manuel. Manuel &lt; Pepe");



let er = /(\w+)\s(\w+)/
let str = 'John Smith'
let newstr = str.replace(er, '$2, $1')
console.log(newstr)

const deleteTagScript = (str) => {
    let eR = /<script\b[^<]*(?:(?!<\/script>)<[^<]*)*<\/script>/gi;

    str = str.replace(eR,' ');
    alert(`El mensaje sin <script> queda: \n${str}`)
}

deleteTagScript("Esto es una prueba de codigo malisicioso, <script> do{//Estarás aqui, para siempre}while(true)</script>");

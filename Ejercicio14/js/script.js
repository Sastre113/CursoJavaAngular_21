window.onload = () => {
    pantalla = document.getElementById("pantalla");
    document.onkeydown = teclado;
};

let hayOperacion = false;
let decimal = false;

let calculadora = (tecla) => {
    let teclaInt = parseInt(tecla);
    console.log(tecla);

    if (tecla == '1/x')
        teclaInt = "x";

    if (teclaInt >= 0 && teclaInt <= 9) {
        if (!hayOperacion) {
            hayOperacion = true;
            pantalla.innerHTML = tecla;
        }
        else {
            pantalla.innerHTML += tecla;
        }
    }

    if (isNaN(teclaInt)) {
        switch (tecla) {
            case 'C':
                hayOperacion = false;
                decimal = false;
                pantalla.innerHTML = 0;
                break;
            case 'CE':
                hayOperacion = false;
                decimal = false;
                pantalla.innerHTML = 0;
                break;
            case 'Retr':
                retroceder();
                break;
            case '.':
                punto();
                break;
            case 'Raiz':
                raizCuadrada();
                break;
            case '+/-':
                cambiarSigno();
                break;
            case '1/x':
                dividir1entreX();
                break;
            case '=':
                igual();
                break;
            default:
                operacionElemental(tecla);
                break;
        }
    }
}

const dividir1entreX = () => {
    pantalla.innerHTML = `1/(${pantalla.innerHTML})`;
}

const igual = () => {
    pantalla.innerHTML = eval(pantalla.innerHTML);
    operacion = false;
}

const ultimoCaracterEsNumero = () => {
    let operacion = pantalla.innerHTML;
    return isNaN(operacion.substring(operacion.length - 1, operacion.length));
}

const operacionElemental = (tecla) => {
    if (typeof tecla !== "undefined" && !ultimoCaracterEsNumero()) {
        pantalla.innerHTML += tecla;
        hayOperacion = true;
    }
}


const cambiarSigno = () => {
    if (hayOperacion) {
        let operacion = Number(pantalla.innerHTML);
        operacion = -operacion;
        pantalla.innerHTML = operacion;
    }
}

const raizCuadrada = () => {
    let resultado = eval(`Math.sqrt(${pantalla.innerHTML})`);
    pantalla.innerHTML = resultado;
}

const retroceder = () => {
    let operacion = pantalla.innerHTML;
    let valorBorrado = operacion.substring(operacion.length - 1, operacion.length)
    operacion = operacion.substring(0, operacion.length - 1);

    if (operacion.length == 0) {
        operacion = 0;
        hayOperacion = null;
    }

    if (valorBorrado == '.')
        decimal = false;

    pantalla.innerHTML = operacion;
}

const punto = () => {
    if (!hayOperacion && !decimal) {
        pantalla.innerHTML += ".";
        hayOperacion = true;
        decimal = true;
    }
    else {
        if (!decimal) {
            pantalla.innerHTML += ".";
            hayOperacion = true;
            decimal = true;
        }
    }
}

const teclado = (e) => {
    let evento = e || window.event;
    let keyCode = evento.keyCode;
    let tecla;
    if (keyCode > 47 && keyCode < 58) {
        tecla = keyCode - 48;
        tecla = String(tecla)
        calculadora(tecla);
    }

    if (keyCode > 95 && keyCode < 106) {
        tecla = keyCode - 96;
        tecla = String(tecla);
        calculadora(tecla);
    }

    if (keyCode == 110 || keyCode == 190)
        calculadora(".")
    if (keyCode == 106)
        calculadora('*')
    if (keyCode == 107)
        calculadora('+')
    if (keyCode == 109)
        calculadora('-')
    if (keyCode == 111)
        calculadora('/')
    if (keyCode == 32 || keyCode == 13)
        calculadora('=')
    if (keyCode == 46)
        calculadora('C')
    if (keyCode == 8)
        calculadora('Retr') 
    if (keyCode == 36)
        calculadora('CE') 
}
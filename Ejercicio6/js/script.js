let letra = ['T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'];

let dni = prompt("Introduzca el dni (Formato aceptado: XXXXXXX-N)");
let numeroDni = dni.split("-");

if((numeroDni[0] > 0 && numeroDni[0] < 99999999)
    && letra[numeroDni[0] % 23].toLocaleLowerCase() == numeroDni[1].toLocaleLowerCase()){
        alert(`El dni ${dni} es correcto`);
}
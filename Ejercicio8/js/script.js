let numeroEntero = prompt(`Introduzca un número entero`);
let paridad = (a) => ((a%2 == 0) ? "par":"impar");

alert(`${numeroEntero} es ${paridad(numeroEntero)}`);


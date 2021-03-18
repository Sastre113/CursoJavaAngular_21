let reloj = document.getElementById("caja-reloj");

function showTime(){
    let date = new Date();
    // 0 - 23
    let h = date.getHours(); 
    // 0 - 59
    let m = date.getMinutes();
    // 0 - 59 
    let s = date.getSeconds(); 
    
    reloj.innerHTML =  `${h}:${m}:${s}`;
    setTimeout(showTime, 1000);
}

showTime();
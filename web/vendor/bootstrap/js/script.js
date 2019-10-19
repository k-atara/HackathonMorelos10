//ECMAN ESPECIFICACIÓN

var ready = _ => {
    var convert = _ =>{
        
        var matricula = document.getElementById("matricula").value;
        var nom = document.getElementById("nom").value;
        var apellidos = document.getElementById("apellidos").value;
        var asignatura = document.getElementById("asignatura").value;
        var calif = document.getElementById("opcion1").value;

        var calificacion = parseInt(calif);

        var html ="<br/><h3>";
        if(opcion1==opcion2){
            alert("Error, elige otra opción");
        }else
        if(opcion1=="Celsius" && opcion2=="Farenheit"){
            var resp = ((num*9)/5)+32;
            html += "Resultado = " + resp;
        }else
        if(opcion1=="Celsius" && opcion2=="Kelvin"){
            var resp = num+273.15;
            html += "Resultado = " + resp;
        }else
        if(opcion1=="Farenheit" && opcion2=="Celsius"){
            var resp = (num-32)*5/9;
            html += "Resultado = " + resp;
        }else
        if(opcion1=="Farenheit" && opcion2=="Kelvin"){
            var resp = ((num-32)*5/9)+273.15;
            html += "Resultado = " + resp;
        }else
        if(opcion1=="Kelvin" && opcion2=="Celsius"){
            var resp = num - 273.15;
            html += "Resultado = " + resp;
        }else
        if(opcion1=="Kelvin" && opcion2=="Farenheit"){
            var resp = ((num - 273.15)*9/5)+32;
            html += "Resultado = " + resp;
        }
        
        html +="</h3>";
        var contenedor = document.getElementById("contenedor");
        contenedor.innerHTML = html;
    }    
    document.getElementById("convert").addEventListener("click", convert);
}
document.addEventListener("DOMContentLoaded", ready);


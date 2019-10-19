$(document).ready(()=> {
    $("#Contratos").click(function () {
        $(".Contratos").show();
        $(".SectorPrivado").hide();
        $(".SectorPublico").hide();
        $(".Instrumentacion").hide();
    });
    $("#SectorPrivado").click(function () {
        $(".SectorPrivado").show();
        $(".Contratos").hide();
        $(".SectorPublico").hide();
        $(".Instrumentacion").hide();
    });
    $("#SectorPublico").click(function () {
        $(".SectorPublico").show();
        $(".SectorPrivado").hide();
        $(".Contratos").hide();
        $(".Instrumentacion").hide();
    });
    $("#Instrumentacion").click(function () {
        $(".Instrumentacion").show();
        $(".SectorPrivado").hide();
        $(".Contratos").hide();
        $(".SectorPublico").hide();
    });
    $("#masCva").click(function () {
        document.getElementById("preview").innerHTML="<h1>Hola</h1>";
    });
});

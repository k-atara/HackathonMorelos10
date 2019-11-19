$(document).ready(()=> {
    $("#Autorizacion").click(function () {
        $(".Autorizacion").show();
        $(".Convenio").hide();
        $(".Licencia").hide();
        $(".Contrato").hide();
        $(".Permiso").hide();
        $(".Concesion").hide();
        $(".Asignaciones").hide();
    });
    $("#Convenio").click(function () {
        $(".Convenio").show();
        $(".Autorizacion").hide();
        $(".Licencia").hide();
        $(".Contrato").hide();
        $(".Permiso").hide();
        $(".Concesion").hide();
        $(".Asignaciones").hide();
    });
    $("#Licencia").click(function () {
        $(".Licencia").show();
        $(".Convenio").hide();
        $(".Autorizacion").hide();
        $(".Contrato").hide();
        $(".Permiso").hide();
        $(".Concesion").hide();
        $(".Asignaciones").hide();
    });
    $("#Contrato").click(function () {
        $(".Contrato").show();
        $(".Convenio").hide();
        $(".Autorizacion").hide();
        $(".Licencia").hide();
        $(".Permiso").hide();
        $(".Concesion").hide();
        $(".Asignaciones").hide();
    });
    $("#Permiso").click(function () {
        $(".Permiso").show();
        $(".Convenio").hide();
        $(".Autorizacion").hide();
        $(".Licencia").hide();
        $(".Contrato").hide();
        $(".Concesion").hide();
        $(".Asignaciones").hide();
    });
    $("#Concesion").click(function () {
        $(".Concesion").show();
        $(".Convenio").hide();
        $(".Autorizacion").hide();
        $(".Licencia").hide();
        $(".Contrato").hide();
        $(".Permiso").hide();
        $(".Asignaciones").hide();
    });
    $("#Asignaciones").click(function () {
        $(".Asignaciones").show();
        $(".Convenio").hide();
        $(".Autorizacion").hide();
        $(".Licencia").hide();
        $(".Contrato").hide();
        $(".Concesion").hide();
        $(".Permiso").hide();
    });
    $("#masCva").click(function () {
        document.getElementById("preview").innerHTML="<h1>Hola</h1>";
    });
    $("body").on("click", "#logo", function () {
        $("#Inicio").attr("action", "InformacionController");
        $("#accion").val("inicio");
        $("#Inicio").attr("method", "POST");
        $("#Inicio").submit();

    });
});

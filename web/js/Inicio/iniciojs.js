$(document).ready(() => {

    $(".btnLogin").click(function () {
                Swal.fire({
                    title: 'Cargando...',
                    onBeforeOpen: () => {
                        Swal.showLoading();
                    }
                });
                $("#Informacion").attr("action", "InicioController");
                $("#accion").val("login");
                $("#Informacion").attr("method", "POST");
                $("#Informacion").submit();

    });
    $(".btnReporteGeneral").click(function () {

        Swal.fire({
            title: 'Cargando...',
            onBeforeOpen: () => {
                Swal.showLoading();
            }
        });

        $("#Informacion").attr("action", "InicioController");
        $("#accion").val("informacion");
        $("#Informacion").attr("method", "POST");
        $("#Informacion").submit();

    });
    $(".btnInformacionMunicipio").click(function () {

        Swal.fire({
            title: 'Cargando...',
            onBeforeOpen: () => {
                Swal.showLoading();
            }
        });

        $("#Informacion").attr("action", "InicioController");
        $("#accion").val("informacionMunicipio");
        $("#Informacion").attr("method", "POST");
        $("#Informacion").submit();

    });
});

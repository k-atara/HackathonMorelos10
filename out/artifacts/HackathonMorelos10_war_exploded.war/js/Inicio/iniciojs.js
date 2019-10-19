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
    $(".btnInformacion").click(function () {

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


});

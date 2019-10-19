$(document).ready(() => {

    $(".btnLogin").click(function () {
                Swal.fire({
                    title: 'Cargando...',
                    onBeforeOpen: () => {
                        Swal.showLoading();
                    }
                });
                $("#InicioSesion").attr("action", "InicioController");
                $("#accion").val("login");
                $("#InicioSesion").attr("method", "POST");
                $("#InicioSesion").submit();

    });

});

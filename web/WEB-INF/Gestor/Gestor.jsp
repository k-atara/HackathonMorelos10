<%--
  Created by IntelliJ IDEA.
  User: AlienWare
  Date: 19/10/2019
  Time: 01:39 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Informaci&oacuten</title>


    <script src="${pageContext.request.contextPath}/js/all.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/fontawesome.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/Informacion/informacionjs.js"></script>

    <!-- Custom fonts for this template -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/fontawesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/Informacion/informacioncss.css" rel="stylesheet">

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/all.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/simple-line-icons.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/landing-page.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/fontawesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.min.css">

    <!--    Sweet Alerts     -->
    <script src="${pageContext.request.contextPath}/js/sweetalert2.all.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/sweetalert2.min.css"/>

</head>

<body>

<!-- Navigation -->
<%@include file="../../navBar.jsp"%>

<form id="InicioSesion">
    <input type="hidden" name="accion" id="accion">
</form>

<div class="container-fluid">

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#" id="Contratos">Contratos <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" id="SectorPrivado">Sector privado</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" id="SectorPublico">Sector p&uacuteblico</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" id="Instrumentacion">Instrumentaci&oacuten</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="card">
        <div class="col-md-12 ml-auto mr-auto text-center">
            <div class="card-header card-header-primary">
                <div class="mt-1 ml-1" id="preview">
                    <h1>Cuautla</h1>
                </div>
            </div>
        </div>
        <div class="card-body">
            <div class="row mt-3 mb-3">
                <div class="col-lg-12 Contratos">
                    <table id="tablaContratos" class="display" style="width:100%">
                        <thead>
                        <tr>
                            <th scope="col">Hiperv&iacutenculo Al Contrato, Convenio, Permiso, Licencia O Concesi&oacuten</th>
                            <th scope="col">N&uacutemero de registros</th>
                        </tr>
                        </thead>
                        <tbody id="cuerpoTablaContratos">


                        </tbody>

                    </table>
                </div>
                <div class="col-lg-12 SectorPrivado">
                    <table id="tablaSectorPrivado" class="display" style="width:100%">
                        <thead>
                        <tr>
                            <th scope="col">Ayuntamiento</th>
                            <th scope="col">Sector Al Cual Se Otorgó El Acto Jurídico (catálogo)</th>
                            <th scope="col">Número de registros</th>
                        </tr>
                        </thead>
                        <tbody id="cuerpoTablaSectorPrivado">

                        <tr>
                            <td>Cuautla
                            </td>
                            <td>Privado</td>
                            <td>1,000
                            </td>
                        </tr>

                        </tbody>

                    </table>
                </div>
                <div class="col-lg-12 SectorPublico">
                    <table id="tablaSectorPublico" class="display" style="width:100%">
                        <thead>
                        <tr>
                            <th scope="col">Ayuntamiento
                            </th>
                            <th scope="col">Sector Al Cual Se Otorgó El Acto Jurídico (catálogo)
                            </th>
                            <th scope="col">Número de registros
                            </th>
                        </tr>
                        </thead>
                        <tbody id="cuerpoTablaSectorPublico">

                        <tr>

                        </tr>

                        </tbody>

                    </table>
                </div>
                <div class="col-lg-12 Instrumentacion">
                        <table id="tablaInstrumentacion" class="display" style="width:100%">
                            <thead>
                            <tr>
                                <th scope="col">Ayuntamiento
                                </th>
                                <th scope="col">Unidad(es) O Área(s) Responsable(s) de Instrumentación
                                </th>
                                <th scope="col">Número de registros
                                </th>
                            </tr>
                            </thead>
                            <tbody id="cuerpoInstrumentacion">

                            <tr>
                                <td>Cuautla
                                </td>
                                <td>DIRECCION DE INDUSTRIA Y COMERCIO
                                </td>
                                <td>1,000
                                </td>
                            </tr>

                            </tbody>

                        </table>
                </div>
            </div>
        </div>
    </div>

</div>

<%@include file="../../footer.jsp"%>

<!-- Bootstrap core JavaScript -->
<script src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/js/Informacion/informacionjs.js"></script>

</body>

</html>


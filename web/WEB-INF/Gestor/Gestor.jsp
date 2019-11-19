<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<!-- Masthead -->
<header class="masthead text-white text-center">
    <div class="overlay"></div>
    <div class="container">
        <div class="row">
            <div class="col-xl-9 mx-auto">
                <h1 class="mb-5">Portal de Datos</h1>
            </div>
        </div>
    </div>
</header>

<form id="Inicio">
    <input type="hidden" name="accion" id="accion">
</form>

<div class="container-fluid">

    <div class="card">
        <div class="col-md-12 ml-auto mr-auto text-center">
            <div class="card-header card-header-primary">
                <div class="mt-1 ml-1" id="preview">
                    <h1>Cuernavaca</h1>
                </div>
            </div>
        </div>
        <div class="card-body">
            <div class="row mt-3 mb-3">
                <div class="col-lg-12 Municipio">
                    <table id="tablaMunicipio" class="display" style="width:100%">
                        <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Tipo de Acto Jur&iacute;dico</th>
                            <th scope="col">Objeto del Acto Jur&iacute;dico</th>
                            <th scope="col">Fundamento del Acto Jur&iacute;dico</th>
                            <th scope="col">Responsable de instrumentacion</th>
                            <th scope="col">Sector</th>
                            <th scope="col">Periodo de Informe Inicio</th>
                            <th scope="col">Periodo de Informe Fin</th>
                            <th scope="col">Fecha de validacion</th>
                            <th scope="col">Fecha de actualizaci&oacute;n</th>
                            <th scope="col">Nota</th>
                            <th scope="col">Link</th>
                        </tr>
                        </thead>
                        <tbody id="cuerpoTablaMunicipio">
                        <c:forEach items="${reportesMunicipio}" var="reporte">
                            <tr>
                                <td>${reporte.idReporte}</td>
                                <td>${reporte.municipio}</td>
                                <td>${reporte.objetoAJ}</td>
                                <td>${reporte.fundamentoAJ}</td>
                                <td>${reporte.responsableInstrumentacion}</td>
                                <td>${reporte.sectorAJ}</td>
                                <td>${reporte.periodoInformeInicio}</td>
                                <td>${reporte.periodoInformeFinal}</td>
                                <td>${reporte.fechaValidacion}</td>
                                <td>${reporte.fechaActualizacion}</td>
                                <td>${reporte.nota}</td>
                                <td><a href="${reporte.linkDocumento}">Documento</a></td>
                            </tr>
                        </c:forEach>
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


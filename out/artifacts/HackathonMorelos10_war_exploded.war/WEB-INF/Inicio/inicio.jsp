<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Inicio</title>

    <script src="${pageContext.request.contextPath}/js/all.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/fontawesome.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/Inicio/iniciojs.js"></script>
    <script src="${pageContext.request.contextPath}/js/Informacion/informacionjs.js"></script>

    <!-- Custom fonts for this template -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/fontawesome.min.css" rel="stylesheet">

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

    <!--    Watson     -->
    <link href="/web/carbon-components/css/carbon-components.min.css" rel="stylesheet" />
    <style type="text/css">
        html {
            height: 100%;
        }

        body {
            background: #f7f7f7;
            height: 100%;
            margin: 0;
            padding: 0;
            width: 100%;
        }

        .Chat__header {
            text-align: center;
            padding-top: 32px;
            width: 100%;
        }

        .Chat__header h1, .Chat__header h1 a {
            font-size: 1.2rem;
        }

        .Chat__holder,
        .Chat__body {
            border-radius: 0.5em;
        }

        .Chat__holder {
            background: #f7f7f7;
            height: 540px;
            margin: 32px auto 0 auto;
            width: 320px;
        }

        .Chat__title {
            background: #0062ff;
        }

        .Chat__body {
            height: 540px;
            width: 320px;
            max-height: calc(100vh - 140px);
        }

        .Chat__body--loading {
            text-align: center;
        }

        .Chat__body--loading .bx--loading {
            margin: auto;
        }

        .Chat__404 {
            text-align: center;
        }

        .Chat__loading {
            margin: auto;
            text-align: center;
            width: 64px;
        }

        .link-icon {
            fill: #0062ff;
        }

        /**
         * We're picking up font-faces from carbon but those appear out-of-date and the semibold versions contained within
         * appear to have some defects in them. See https://github.ibm.com/watson-engagement-advisor/wea-backlog/issues/26907.
         * The definitions below are copied from an upcoming version of carbon and can be removed once it's available.
         */
        @font-face {
            font-family: 'IBM Plex Sans';
            font-style: normal;
            font-weight: 600;
            src: local('IBM Plex Sans SemiBold'), local('IBMPlexSans-SemiBold'),
            url(https://fonts.gstatic.com/s/ibmplexsans/v6/zYX9KVElMYYaJe8bpLHnCwDKjQ76AIxsdP3pBmtF8A.woff2) format('woff2');
            unicode-range: U+0460-052F, U+1C80-1C88, U+20B4, U+2DE0-2DFF, U+A640-A69F,
            U+FE2E-FE2F;
        }
        @font-face {
            font-family: 'IBM Plex Sans';
            font-style: normal;
            font-weight: 600;
            src: local('IBM Plex Sans SemiBold'), local('IBMPlexSans-SemiBold'),
            url(https://fonts.gstatic.com/s/ibmplexsans/v6/zYX9KVElMYYaJe8bpLHnCwDKjQ76AIVsdP3pBmtF8A.woff2) format('woff2');
            unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;
        }
        @font-face {
            font-family: 'IBM Plex Sans';
            font-style: normal;
            font-weight: 600;
            src: local('IBM Plex Sans SemiBold'), local('IBMPlexSans-SemiBold'),
            url(https://fonts.gstatic.com/s/ibmplexsans/v6/zYX9KVElMYYaJe8bpLHnCwDKjQ76AIJsdP3pBmtF8A.woff2) format('woff2');
            unicode-range: U+0370-03FF;
        }
        @font-face {
            font-family: 'IBM Plex Sans';
            font-style: normal;
            font-weight: 600;
            src: local('IBM Plex Sans SemiBold'), local('IBMPlexSans-SemiBold'),
            url(https://fonts.gstatic.com/s/ibmplexsans/v6/zYX9KVElMYYaJe8bpLHnCwDKjQ76AI5sdP3pBmtF8A.woff2) format('woff2');
            unicode-range: U+0102-0103, U+0110-0111, U+1EA0-1EF9, U+20AB;
        }
        @font-face {
            font-family: 'IBM Plex Sans';
            font-style: normal;
            font-weight: 600;
            src: local('IBM Plex Sans SemiBold'), local('IBMPlexSans-SemiBold'),
            url(https://fonts.gstatic.com/s/ibmplexsans/v6/zYX9KVElMYYaJe8bpLHnCwDKjQ76AI9sdP3pBmtF8A.woff2) format('woff2');
            unicode-range: U+0100-024F, U+0259, U+1E00-1EFF, U+2020, U+20A0-20AB, U+20AD-20CF, U+2113, U+2C60-2C7F, U+A720-A7FF;
        }
        @font-face {
            font-family: 'IBM Plex Sans';
            font-style: normal;
            font-weight: 600;
            src: local('IBM Plex Sans SemiBold'), local('IBMPlexSans-SemiBold'),
            url(https://fonts.gstatic.com/s/ibmplexsans/v6/zYX9KVElMYYaJe8bpLHnCwDKjQ76AIFsdA.woff2) format('woff2');
            unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC,
            U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;
        }
    </style>

</head>

<body>

<!-- Navigation -->
<%@include file="../../navBar.jsp"%>

<form id="Informacion">
    <input type="hidden" name="accion" id="accion">
</form>

<!-- Icons Grid -->
<section class="features-icons bg-light text-center">
    <div class="container">
        <div class="row">
            <div class="col-lg-2">
                <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                    <div>
                        <img src="${pageContext.request.contextPath}/img/cuernavaca.png" id="cuernavaca" with="100" height="100">
                    </div>
                    <h3>Cuernavaca</h3>
                    <button type="button" class="btn btn-primary btnInformacion" id="masCva">Ver m&aacutes...</button>
                </div>
            </div>
            <div class="col-lg-2">
                <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                    <div>
                        <img src="${pageContext.request.contextPath}/img/Cuautla.png" id="cuautla" with="100" height="100">
                    </div>
                    <h3>Cuautla</h3>
                    <button type="button" class="btn btn-primary btnInformacionCuautla" id="masCuautla">Ver m&aacutes...</button>
                </div>
            </div>
            <div class="col-lg-2">
                <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                    <div>
                        <img src="${pageContext.request.contextPath}/img/yautepec.png" id="yautepec" with="100" height="100">
                    </div>
                    <h3>Yautepec</h3>
                    <button type="button" class="btn btn-primary btnInformacion" id="masYautepec">Ver m&aacutes...</button>
                </div>
            </div>
            <div class="col-lg-2">
                <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                    <div>
                        <img src="${pageContext.request.contextPath}/img/tepoztlan.jpg" id="tepoztlan" with="100" height="100">
                    </div>
                    <h3>Tepoztl&aacuten</h3>
                    <button type="button" class="btn btn-primary btnInformacion" id="masTepoz">Ver m&aacutes...</button>
                </div>
            </div>
            <div class="col-lg-2">
                <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                    <div>
                        <img src="${pageContext.request.contextPath}/img/amacuzac.jpg" id="amacuzac" with="100" height="100">
                    </div>
                    <h3>Amacuzac</h3>
                    <button type="button" class="btn btn-primary btnInformacion" id="masAmacuzac">Ver m&aacutes...</button>
                </div>
            </div>
            <div class="col-lg-2">
                <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                    <div class="features-icons-icon d-flex">
                        <i class="icon-check m-auto text-primary"></i>
                    </div>
                    <h3>Novedades</h3>
                    <button type="button" class="btn btn-primary" id="masNovedades">Ver más...</button>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Image Showcases -->
<section class="showcase">
    <div class="container-fluid p-0">
        <div class="row no-gutters">

            <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('img/seguridad.jpeg');"></div>
            <div class="col-lg-6 order-lg-1 my-auto showcase-text">
                <h2>Seguridad</h2>
                <p class="lead mb-0">¿Eres consciente de cuando gasta el gobierno en materia de seguridad? ¿sabes que casi la mitad de su presupuesto por estado se va a esto? Entra y descúbrelo.</p>
            </div>
        </div>
        <div class="row no-gutters">
            <div class="col-lg-6 text-white showcase-img" style="background-image: url('img/transporte.jpeg');"></div>
            <div class="col-lg-6 my-auto showcase-text">
                <h2>Servicios p&uacuteblicos</h2>
                <p class="lead mb-0">¿No tienes agua potable en tu colonia? ¿Las calles de donde vive no están pavimentadas? ¿Sabes cuando te están robando en servicios públicos? ¡Entra y descubre, exige tu drechos!</p>
            </div>
        </div>
        <div class="row no-gutters">
            <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('img/educacion.jpeg');"></div>
            <div class="col-lg-6 order-lg-1 my-auto showcase-text">
                <h2>Educaci&oacuten</h2>
                <p class="lead mb-0">¿Sabes que universidad recibió más apoyo que otras? ¿Quieres conocer cuando dinero le dieron los directivos de la SEP?</p>
            </div>
        </div>
        <div class="row no-gutters">
            <div class="col-lg-6 text-white showcase-img" style="background-image: url('img/salud.jpeg');"></div>
            <div class="col-lg-6 my-auto showcase-text">
                <h2>Salud</h2>
                <p class="lead mb-0">¿Sabes a donde se fue el dinero del último hospital que se construyó? ¿Quieres saber quién se llevó el dinero para el abastecimiento de tus medicinas?</p>
            </div>
        </div>
        <div class="row no-gutters">
            <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('img/agricultura.jpeg');"></div>
            <div class="col-lg-6 order-lg-1 my-auto showcase-text">
                <h2>Agricultura</h2>
                <p class="lead mb-0">¿Te interesa saber a dónde fue tu apoyo (dinero) para tu siembra? ¿Conocer como se distribuyen los abonos y tractores que “da el gobierno”?</p>
            </div>
        </div>
    </div>
</section>

<!-- Testimonials -->
<section class="testimonials text-center bg-light">
    <div class="container">
        <h2 class="mb-5">What people are saying...</h2>
        <div class="row">
            <div class="col-lg-4">
                <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                    <img class="img-fluid rounded-circle mb-3" src="img/testimonials-1.jpg" alt="">
                    <h5>Margaret E.</h5>
                    <p class="font-weight-light mb-0">"This is fantastic! Thanks so much guys!"</p>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                    <img class="img-fluid rounded-circle mb-3" src="img/testimonials-2.jpg" alt="">
                    <h5>Fred S.</h5>
                    <p class="font-weight-light mb-0">"Bootstrap is amazing. I've been using it to create lots of super nice landing pages."</p>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                    <img class="img-fluid rounded-circle mb-3" src="img/testimonials-3.jpg" alt="">
                    <h5>Sarah W.</h5>
                    <p class="font-weight-light mb-0">"Thanks so much for making these free resources available to us!"</p>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Call to Action -->
<section class="call-to-action text-white text-center">
    <div class="overlay"></div>
    <div class="container">
        <div class="row">
            <div class="col-xl-9 mx-auto">
                <h2 class="mb-4">¿Listo para empezar? Registrate</h2>
            </div>
            <div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
                <form>
                    <div class="form-row">
                        <div class="col-12 col-md-9 mb-2 mb-md-0">
                            <input type="email" class="form-control form-control-lg" placeholder="Ingresa tu correo...">
                        </div>
                        <div class="col-12 col-md-3">
                            <button type="submit" class="btn btn-block btn-lg btn-primary">Registrar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<div class="watson" style="position:fixed; bottom:0; right:0; float:left;">
    <div class='Chat__header' role='banner'>

    </div>
    <div class='Chat__holder'>
        <div class='Chat__body Chat__body--loading' role='main'>
            <div data-loading class="bx--loading">
                <svg class="bx--loading__svg" viewBox="-75 -75 150 150">
                    <title>Loading</title>
                    <circle class="bx--loading__stroke" cx="0" cy="0" r="37.5" />
                </svg>
            </div>
        </div>
    </div>

    <script src="https://assistant-web.watsonplatform.net/loadWatsonAssistantChat.js"></script>
    <script>
        var hostElement = document.querySelector('.Chat__body');
        var loadingElement = document.querySelector('.bx--loading');
        window.loadWatsonAssistantChat({
            element: hostElement,
            integrationID: '3bca5994-8390-4ea8-b772-810608cfc972',
            showLauncher: false,
            openChatByDefault: true,
            region: 'us-south',
            subscriptionID: 'public',
            __ibm__: {
                cdnEndpoint: 'https://assistant-web.watsonplatform.net',
                versionsUrl: 'https://assistant-web.watsonplatform.net/versions.json',
                isPreviewLink: true
            }
        }).then(function (instance) {
            window.instance = instance;
            instance.render().then(function () {
                loadingElement.parentNode.removeChild(loadingElement);
                hostElement.classList.remove('Chat__body--loading');
                hostElement.classList.add('Chat__body--background');
            });
        });
    </script>
</div>

<%@include file="../../footer.jsp"%>

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/js/Informacion/informacionjs.js"></script>

</body>

</html>

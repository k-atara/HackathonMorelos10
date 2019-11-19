<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zxx">

<head>
    <title>Inicio Sesi&oacuten</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords"
          content="Master Signin Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <!-- //Meta tag Keywords -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" media="all" /><!-- Style-CSS -->
    <link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet"><!-- font-awesome-icons -->

    <!-- Custom fonts for this template -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/fontawesome.min.css" rel="stylesheet">

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/all.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/simple-line-icons.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/landing-page.css" rel="stylesheet">

    <script src="${pageContext.request.contextPath}/js/all.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/fontawesome.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>

</head>

<body>
<section class="signin-form">
    <div class="overlay">
        <div class="wrapper">
            <div class="logo text-center top-bottom-gap">
                <a class="brand-logo" href="index.html">Inicia sesi&oacute;n en Iximati:</a>
                <!-- if logo is image enable this
        <a class="brand-logo" href="#index.html">
            <img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
        </a> -->
            </div>
            <div class="form34">
                <h4 class="form-head">Iniciar sesi&oacuten ahora</h4>
                </hr>
                <div class="main-div">
                    <a href="#facebook">
                        <div class="signin facebook">
                            <i class="fab fa-facebook-f"></i> <p class="action mt-3"> acebook</p>
                        </div>
                    </a>
                    <a href="#google-plus">
                        <div class="signin google-plus">
                            <i class="fab fa-google"></i> <p class="action mt-3"> oogle</p>
                        </div>
                    </a>
                </div>
                <div class="form-34or">
                        <span class="pros">
                            <span>or</span>
                        </span>
                </div>
                <form action="" method="GET">
                    <div class="">
                        <p class="text-head">Nombre de usuario:</p>
                        <input type="text" name="username" class="input" placeholder="" required="" />
                    </div>
                    <div class="">
                        <p class="text-head">Contraseña:</p>
                        <input type="password" name="password" class="input" placeholder="" required="" />
                    </div>
                    <label class="remember">
                        <input type="checkbox">
                        <span class="checkmark"></span>Recordar contraseña
                    </label>
                    <button type="submit" class="signinbutton btn">Iniciar sesión</button>
                    <p class="signup">¿Todav&iacutea no tienes una cuenta?<a href="" class="signuplink" name="registrarse" id="registrarse">Registrarse</a>
                    </p>
                </form>
            </div>
        </div>
        <!-- copyright -->
        <div class="copyright text-center">
            <p>© 2019 Iximati:. Todos los derechos reservados | Diseñado por Iximati:</p>
        </div>
        <!-- //copyright -->
    </div>
</section>
</body>

</html>

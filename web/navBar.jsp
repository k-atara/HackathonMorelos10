
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Navigation -->
<nav class="navbar navbar-light bg-light static-top">
    <div class="container">
        <img src="${pageContext.request.contextPath}/img/logo.jpg" id="logo" with="70" height="70">
        <a class="navbar-brand" href="#">Iximati:</a>
        <button type="submit" class="btn btn-primary btnLogin" >Iniciar sesión</button>
    </div>
</nav>

<!-- Masthead -->
<header class="masthead text-white text-center">
    <div class="overlay"></div>
    <div class="container">
        <div class="row">
            <div class="col-xl-9 mx-auto">
                <h1 class="mb-5">Portal de datos del estado de Morelos</h1>
            </div>
            <div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
                <form>
                    <div class="form-row">
                        <div class="col-12 col-md-9 mb-2 mb-md-0">
                            <input type="email" class="form-control form-control-lg" placeholder="Ingresa tu busqueda...">
                        </div>
                        <div class="col-12 col-md-3">
                            <button type="submit" class="btn btn-block btn-lg btn-primary">Buscar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</header>
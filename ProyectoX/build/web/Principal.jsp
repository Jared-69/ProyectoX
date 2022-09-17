<%-- 
    Document   : Principal
    Created on : 15/09/2022, 12:03:02 AM
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">           
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        <title>Proyecto X</title>
    </head>
    <body id="Body" style="background-color: green;">
        <nav class="navbar navbar-expand-lg navbar-light" id="NavL">
            <div class="container-fluid " id="Container">
                <a class="navbar-brand" href="#">  
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="nav nav-tabs" id="Btns">
                        <li class="nav-item">
                            <a class="nav-link text-light" href="Controlador?menu=PaginaPrincipal" target="myFrame">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="Controlador?menu=Cliente&accion=Listar" target="myFrame">Articulo</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="Controlador?menu=Empleado&accion=Listar" target="myFrame">Carrito de Compras</a>
                        </li>                                           
                    </ul>
                </div>
                    <div class="nav-item dropdown" id="Drop" >
                    <a class="nav-link dropdown-toggle text-dark " data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">
                        ${usuario.getNombresEmpleado()}</a>
                    <ul class="dropdown-menu  text-center">
                        <a class="dropdown-item" href="#">
                            <img src="img/usuatio.png" alt="" width="60"/>
                        </a>
                        <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                        <a class="dropdown-item" href="#">usuario@gmail.com</a>
                        <div class="dropdown-divider"></div>
                        <form action="Validar" method="POST">
                            <button name="accion" value="Salir" class="dropdown-item bg-danger" href="#">Salir</button>
                        </form>
                    </ul>
                </div>               
            </div>
          </nav>
        <div class="m-4"  id="Frame">
           <iframe src="" name="myFrame" style=" height: 100%; width: 100%;" id="myFrame"></iframe>
      </div>
    </body>
</html>


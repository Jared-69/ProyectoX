<%-- 
    Document   : index
    Created on : 07-sep-2022, 23:52:09
    Author     : Edgar Gómez

        aca se hara el Login
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
        <title>ProyectoX</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4 ">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sign" action="Validar" method="POST">
                        <div class="form-group text-center">
                            <h3 class="fondoTitulo">BIENVENIDO <br>LOGIN</h3>
                            <img src="img/logo_index.gif" alt="70" width="130"/><br>
                            <label>INGRESE SUS DATOS</label>
                        </div>
                            <div class="form-group">
                                <label>USUARIO</label>
                                <input type="text" name="txtUser" class="form-control">
                            </div>
                        <div class="form-group">
                            <label>CONTRASEÑA</label>
                            <input type="password" name="txtPass" class="form-control">
                        </div>
                            <input type="submit" name="accion" value="Ingresar" class="btn btn-login btn-block">
                        </form> 
                  </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
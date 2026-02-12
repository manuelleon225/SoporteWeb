<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>

<div class="container">

    <h1>Solicitud Enviada ✔</h1>

    <p><strong>Nombre:</strong> 
        <%= request.getAttribute("nombre") %>
    </p>

    <p><strong>Correo:</strong> 
        <%= request.getAttribute("correo") %>
    </p>

    <p><strong>Tipo de Solicitud:</strong> 
        <%= request.getAttribute("tipo") %>
    </p>

    <p><strong>Descripción:</strong><br>
        <%= request.getAttribute("descripcion") %>
    </p>

    <br>
    <a href="registrarSolicitud.jsp" class="btn">Registrar otra solicitud</a>

</div>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
</head>
<body>

    <h2>Solicitud enviada correctamente</h2>

    <p>
        Nombre recibido:
        <strong><%= request.getAttribute("nombre") %></strong>
    </p>

    <p>
        Descripción:
        <strong><%= request.getAttribute("descripcion") %></strong>
    </p>

    <br>
    <a href="RegistrarSolicitudServlet">Volver</a>

</body>
</html>

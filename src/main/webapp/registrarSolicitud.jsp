<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registrar Solicitud</title>
</head>
<body>

<h1>Formulario de Solicitud de Soporte</h1>

<form action="RegistrarSolicitudServlet" method="post">

    Nombre: <input type="text" name="nombreSolicitante" required><br><br>

    Correo: <input type="email" name="correo" required><br><br>

    Tipo de Solicitud:
    <select name="tipoSolicitud">
        <option value="Soporte Técnico">Soporte Técnico</option>
        <option value="Error del Sistema">Error del Sistema</option>
        <option value="Consulta">Consulta</option>
    </select>
    <br><br>

    Descripción:<br>
    <textarea name="descripcion" rows="4" cols="40" required></textarea>
    <br><br>

    <input type="submit" value="Enviar Solicitud">

</form>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registrar Solicitud</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>

<div class="container">

    <h1>Registrar Solicitud</h1>

    <form action="RegistrarSolicitudServlet" method="post">

        <label>Nombre</label>
        <input type="text" name="nombreSolicitante" placeholder="Ingrese su nombre" required>

        <label>Correo</label>
        <input type="email" name="correo" placeholder="correo@ejemplo.com" required>

        <label>Tipo de Solicitud</label>
        <select name="tipoSolicitud">
            <option>Soporte Técnico</option>
            <option>Error del Sistema</option>
            <option>Consulta</option>
        </select>

        <label>Descripción</label>
        <textarea name="descripcion" rows="4" placeholder="Describe el problema..." required></textarea>

        <input type="submit" value="Enviar Solicitud">

    </form>

</div>


</body>
</html>

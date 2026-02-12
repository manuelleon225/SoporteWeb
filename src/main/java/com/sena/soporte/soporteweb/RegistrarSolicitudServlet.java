package com.sena.soporte.soporteweb;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistrarSolicitudServlet", urlPatterns = {"/RegistrarSolicitudServlet"})
public class RegistrarSolicitudServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head><title>Registro de Solicitud</title></head>");
            out.println("<body>");
            out.println("<h1>Formulario de Solicitud de Soporte</h1>");
            out.println("<form method='post' action='RegistrarSolicitudServlet'>");
            out.println("Nombre: <input type='text' name='nombre'/><br/><br/>");
            out.println("Descripción: <textarea name='descripcion'></textarea><br/><br/>");
            out.println("<input type='submit' value='Enviar Solicitud'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    String nombre = request.getParameter("nombre");

    response.setContentType("text/html;charset=UTF-8");

    try (PrintWriter out = response.getWriter()) {
        out.println("<html>");
        out.println("<head><title>Solicitud Registrada</title></head>");
        out.println("<body>");
        out.println("<h1>Solicitud enviada correctamente</h1>");
        out.println("<p>Nombre recibido: " + nombre + "</p>");
        out.println("<a href='RegistrarSolicitudServlet'>Volver</a>");
        out.println("</body>");
        out.println("</html>");
    }
}

}

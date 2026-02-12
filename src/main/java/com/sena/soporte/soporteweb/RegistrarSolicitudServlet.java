package com.sena.soporte.soporteweb;

import java.io.IOException;
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

        // Redirige al formulario JSP
        request.getRequestDispatcher("registrarSolicitud.jsp")
               .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombreSolicitante");
        String correo = request.getParameter("correo");
        String tipo = request.getParameter("tipoSolicitud");
        String descripcion = request.getParameter("descripcion");

        // Validación básica
        if (nombre == null || nombre.trim().isEmpty() ||
            correo == null || correo.trim().isEmpty() ||
            descripcion == null || descripcion.trim().isEmpty()) {

            request.setAttribute("error", "Todos los campos son obligatorios");
            request.getRequestDispatcher("registrarSolicitud.jsp")
                   .forward(request, response);
            return;
        }

        // Enviar datos al JSP resultado
        request.setAttribute("nombre", nombre);
        request.setAttribute("correo", correo);
        request.setAttribute("tipo", tipo);
        request.setAttribute("descripcion", descripcion);

        request.getRequestDispatcher("resultado.jsp")
               .forward(request, response);
    }
}

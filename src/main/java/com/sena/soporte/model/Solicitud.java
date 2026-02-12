package com.sena.soporte.model;

import java.time.LocalDate;

public class Solicitud {

    private int id;
    private String nombreSolicitante;
    private String correo;
    private String tipoSolicitud;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;

    public Solicitud() {
        this.fechaCreacion = LocalDate.now();
        this.estado = "Abierta";
    }

    public Solicitud(int id, String nombreSolicitante, String correo, 
                     String tipoSolicitud, String descripcion) {
        this.id = id;
        this.nombreSolicitante = nombreSolicitante;
        this.correo = correo;
        this.tipoSolicitud = tipoSolicitud;
        this.descripcion = descripcion;
        this.fechaCreacion = LocalDate.now();
        this.estado = "Abierta";
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

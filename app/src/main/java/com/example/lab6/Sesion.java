package com.example.lab6;

import java.util.Date;

public class Sesion {
    private String id;
    private String curso;
    private Date fecha;
    private Double horasDedicadas;
    private String tipoActividad;

    private String urlPhoto;



    public Sesion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getHorasDedicadas() {
        return horasDedicadas;
    }

    public void setHorasDedicadas(Double horasDedicadas) {
        this.horasDedicadas = horasDedicadas;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }
}

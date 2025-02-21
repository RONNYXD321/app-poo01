package model;

import java.time.LocalDate;
import java.util.Date;

public class Especialidad {
    private Integer idespecialidad;
    private String nomespecialidad;
    private Boolean estado;
    private LocalDate fechacreacion;
// CREACION DEL CONSTRUCTOR ESPECIALIDAD
    public Especialidad(Integer idespecialidad, String nomespecialidad, Boolean estado, LocalDate fechacreacion) {
        this.idespecialidad = idespecialidad;
        this.nomespecialidad = nomespecialidad;
        this.estado = estado;
        this.fechacreacion = fechacreacion;
    }

    public Integer getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Integer idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public String getNomespecialidad() {
        return nomespecialidad;
    }

    public void setNomespecialidad(String nomespecialidad) {
        this.nomespecialidad = nomespecialidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
}


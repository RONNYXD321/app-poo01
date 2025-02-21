package model;

import java.time.LocalDate;

public class CicloAcademico {
    private  Integer idcurso;
    private  String nomcurso;
    private String descripcion;

    private LocalDate fechainicio;
    private LocalDate fechaFin;

    public CicloAcademico(Integer idcurso, String nomcurso, String descripcion, LocalDate fechainicio, LocalDate fechaFin) {
        this.idcurso = idcurso;
        this.nomcurso = nomcurso;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getNomcurso() {
        return nomcurso;
    }

    public void setNomcurso(String nomcurso) {
        this.nomcurso = nomcurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}

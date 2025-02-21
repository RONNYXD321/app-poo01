package model;

public class Curso {
    private Integer idcurso;
    private Integer nomcurso;
    private  Integer credcurso;
    private  Boolean estadocurso;

    public  Curso(){
    }
    public  Curso(Integer idcurso){
        this.idcurso = idcurso;
    }


    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public Integer getNomcurso() {
        return nomcurso;
    }

    public void setNomcurso(Integer nomcurso) {
        this.nomcurso = nomcurso;
    }

    public Integer getCredcurso() {
        return credcurso;
    }

    public void setCredcurso(Integer credcurso) {
        this.credcurso = credcurso;
    }

    public Boolean getEstadocurso() {
        return estadocurso;
    }

    public void setEstadocurso(Boolean estadocurso) {
        this.estadocurso = estadocurso;
    }
}

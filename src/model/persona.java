package model;

public class persona {
    private Integer id;
    private  String dni;
    private  String nombre;
    private  String apellido;
    private Integer edad ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }


    public boolean reguistarAsistencia(
        String codIndentificador;
        String fechaAsistencia;
        String HoraAsistencia;
        Boolean valorAsistencia
                ){
        return


    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

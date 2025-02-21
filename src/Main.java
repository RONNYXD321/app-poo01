import model.Alumno;
import model.CicloAcademico;
import model.Curso;
import model.Especialidad;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Alumno objAlumno = new Alumno();
        objAlumno.setApellido("Ramoz");
        objAlumno.setDni("75163852");
        objAlumno.setEdad(12);
        objAlumno.setNombre("Ronny");


        System.out.println(objAlumno.getApellido());
        System.out.println(objAlumno.getDni());
        System.out.println(objAlumno.getEdad());
        System.out.println(objAlumno.getNombre());






    }
}



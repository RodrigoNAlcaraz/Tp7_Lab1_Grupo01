package tp7_lab1_grupo01;

import java.util.ArrayList;


public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private ArrayList<Materia> mat = new ArrayList();

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia m) {
        boolean band = false;
        String resc=null;
        if (mat.isEmpty()) {
            mat.add(m);
            System.out.println("inscripto con exito!");

        } else {

            for (Materia materia : mat) {

                if (materia.getNombre().equals(m.getNombre())) {
                    band = true;
                    resc=m.getNombre();
                }
            }

            if (band) {
                System.out.println("lo siento, ya esta inscripto en la materia: "+resc);
            } else {
                mat.add(m);
                System.out.println("Inscripto con exito!");
            }
        }
    }

    public int cantidadMaterias() {
        
        

        return mat.size();
    }

}

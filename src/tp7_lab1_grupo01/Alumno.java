package tp7_lab1_grupo01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private ArrayList<Materia> mat = new ArrayList();

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido.toUpperCase();
        this.nombre = nombre.toUpperCase();
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
        String resc = null;
        if (mat.isEmpty()) {
            mat.add(m);
            JOptionPane.showMessageDialog(null, "El alumno: " + apellido + ", se ha inscripto con exito en la materia: " + m.getNombre());

        } else {

            for (Materia materia : mat) {

                if (materia.getNombre().equals(m.getNombre()) && materia.getIdMateria() == m.getIdMateria() && materia.getAnio() == m.getAnio()) {
                    band = true;
                    resc = m.getNombre();
                }
            }

            if (band) {
                JOptionPane.showMessageDialog(null, "lo siento, ya esta inscripto en la materia: " + resc);
            } else {
                mat.add(m);
                JOptionPane.showMessageDialog(null, "El alumno: " + apellido + " " + nombre + ", se ha inscripto con exito en la materia: " + m.getNombre());
            }
        }
    }

    public int cantidadMaterias() {
        return mat.size();
    }

    @Override
    public String toString() {
        return "LP: " + legajo + ", apellido: " + apellido + ", nombre: " + nombre;
    }

}

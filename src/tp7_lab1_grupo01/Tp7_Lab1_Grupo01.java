package tp7_lab1_grupo01;

import java.util.ArrayList;

public class Tp7_Lab1_Grupo01 {

    public static void main(String[] args) {
        ArrayList<Materia> mat = new ArrayList();
        ArrayList<Alumno> alum = new ArrayList();

        System.out.println("-------parte A) ---------");
        System.out.println("creando materias");
        Materia ingles = new Materia(01, "ingles", 1);
        Materia mate = new Materia(02, "Matemáticas", 1);
        Materia lab = new Materia(03, "Laboratorio 1", 1);

        mat.add(ingles);
        mat.add(mate);
        mat.add(lab);

        System.out.println(" ");
        System.out.println("-------parte B) ---------");
        System.out.println("creando alumnos");
        Alumno lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(1002, "Martínez", "Brenda");

        alum.add(lopez);
        alum.add(martinez);

        System.out.println(" ");
        System.out.println("-------parte C) ---------");
        lopez.agregarMateria(ingles);
        lopez.agregarMateria(mate);
        lopez.agregarMateria(lab);

        System.out.println(" ");
        System.out.println("-------parte D) ---------");
        martinez.agregarMateria(ingles);
        martinez.agregarMateria(mate);
        martinez.agregarMateria(lab);
        martinez.agregarMateria(lab);

        System.out.println(" ");
        System.out.println("-------parte E) ---------");
        System.out.println("Lopez se encuentra inscrito en: " + lopez.cantidadMaterias() + " materias");
        System.out.println("Martinez se encuentra inscrita en: " + lopez.cantidadMaterias() + " materias");
    }

}

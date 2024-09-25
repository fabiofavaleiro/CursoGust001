package classes;

import java.util.Objects;

public class Materia {


    private String materia;
    private double nota;



    public  Materia (){ }

    //convenção:

    //to String
    /*=================================================================================*/


    @Override
    public String toString() {
        return "Materia{" +
                "maretia='" + materia + '\'' +
                ", nota=" + nota +
                '}';
    }

//Getters and Setters
    /*=================================================================================*/

    public String getMaretia() {
        return materia;
    }

    public void setMateria(String maretia) {
        this.materia = maretia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    //equals & hashCode
    /*=================================================================================*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Double.compare(nota, materia.nota) == 0 && Objects.equals(materia, materia.materia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materia, nota);
    }
}

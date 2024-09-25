package classes;

public class Materia {


    private String maretia1 = "materia1";
    private double nota1;
    private String maretia2 = "materia2";
    private double nota2;
    private String maretia3 = "materia3";
    private double nota3;
    private String maretia4 = "materia4";
    private double nota4;


    public  Materia (){ }

    //convenção:



    //to String
    /*=================================================================================*/

    @Override
    public String toString() {
        return "Materia{" +
                "maretia1='" + maretia1 + '\'' +
                ", nota1=" + nota1 +
                ", maretia2='" + maretia2 + '\'' +
                ", nota2=" + nota2 +
                ", maretia3='" + maretia3 + '\'' +
                ", nota3=" + nota3 +
                ", maretia4='" + maretia4 + '\'' +
                ", nota4=" + nota4 +
                '}';
    }

//Getters and Setters
    /*=================================================================================*/

    public String getMaretia1() {
        return maretia1;
    }

    public void setMaretia1(String maretia1) {
        this.maretia1 = maretia1;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getMaretia2() {
        return maretia2;
    }

    public void setMaretia2(String maretia2) {
        this.maretia2 = maretia2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getMaretia3() {
        return maretia3;
    }

    public void setMaretia3(String maretia3) {
        this.maretia3 = maretia3;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getMaretia4() {
        return maretia4;
    }

    public void setMaretia4(String maretia4) {
        this.maretia4 = maretia4;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
}

package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String cPF;
    private double media;

    List <Materia> materias = new ArrayList<Materia>();



    public Pessoa () {    }

    public double mediaNotas(){

        double somaNotas = 0.0;

        for (Materia materia : materias) {
            somaNotas +=  materia.getNota();
        }
        media = somaNotas/ materias.size();
        return media;

    }

    public boolean getAprovado(){

        double media = this.mediaNotas();

            return media >=7;

    }

    //to String
    /*=================================================================================*/

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cPF='" + cPF + '\'' +
                ", materias=" + materias +
                '}';
    }


//Getters and Setters
    /*=================================================================================*/

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getcPF() {
        return cPF;
    }

    public void setcPF(String cPF) {
        this.cPF = cPF;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materia) {
        this.materias = materia;
    }
}

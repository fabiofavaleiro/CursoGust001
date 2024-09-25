package classes;

import java.util.Objects;

public class Pessoa {
    int id;
    String nome;
    int idade;
    String cPF;

    Materia materia = new Materia();



    public Pessoa () {    }

    public double mediaNotas(){
        return (materia.getN1() + materia.getN2() + materia.getN3() + materia.getN4()) / 4;
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
                ", materia=" + materia +
                '}';
    }

    //Getters and Setters
    /*=================================================================================*/

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getcPF() {
        return cPF;
    }

    public void setcPF(String cPF) {
        this.cPF = cPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

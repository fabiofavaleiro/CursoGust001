import classes.Materia;
import classes.Pessoa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qualé o nome do caboco?");
        String idade = JOptionPane.showInputDialog("Qualé a idade do caboco?");
        String cPF = JOptionPane.showInputDialog("Quale o CPF?");

        Pessoa pessoa1 = new Pessoa();


pessoa1.setId(1);
pessoa1.setNome(nome);
pessoa1.setcPF(cPF);
pessoa1.setIdade(Integer.valueOf(idade));

        Materia materia1 = new Materia();
        materia1.setMateria("banco de dados");
        materia1.setNota(9);
        pessoa1.getMaterias().add(materia1);

        Materia materia2 = new Materia();
        materia2.setMateria("Matematica");
        materia2.setNota(10);
        pessoa1.getMaterias().add(materia2);

        Materia materia3 = new Materia();
        materia3.setMateria("Estrutura de dados");
        materia3.setNota(10);
        pessoa1.getMaterias().add(materia3);

        Materia materia4 = new Materia();
        materia4.setMateria("Java");
        materia4.setNota(10);
        pessoa1.getMaterias().add(materia4);


System.out.println("O ID é " + pessoa1.getId());
System.out.println("O Nome é " + pessoa1.getNome());
System.out.println("A idade é " + pessoa1.getIdade());
System.out.println("O CPF é " + pessoa1.getcPF());
System.out.println("A media dele é " + pessoa1.mediaNotas());
System.out.println("Sr(a). "+ pessoa1.getNome()+" está " + (pessoa1.getAprovado()? "apovado(a)" : "reprovado(a)"));

       System.out.println(pessoa1);


    }
}
import classes.Materia;
import classes.Pessoa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o nome do caboco?");
        String idade = JOptionPane.showInputDialog("Qual é a idade do "+nome+"?");
        String cPF = JOptionPane.showInputDialog("Qual é o CPF do "+nome+"?");

        Pessoa pessoa1 = new Pessoa();


pessoa1.setId(1);
pessoa1.setNome(nome);
pessoa1.setcPF(cPF);
pessoa1.setIdade(Integer.valueOf(idade));

        int quantidadeMaterias = Integer.valueOf(JOptionPane.showInputDialog("Ow shiw, quantas materias o " + nome + " tem?"));

      for(int pos = 1;pos <= quantidadeMaterias ; pos++){
          String nomeMateria = JOptionPane.showInputDialog("Qual o nome da materia " + pos + " ?");
          String notaMateria = JOptionPane.showInputDialog("Qual é a nota da materia "+nomeMateria+" ?");

          Materia materia = new Materia();
          materia.setMateria(nomeMateria);
          materia.setNota(Double.valueOf(notaMateria));

          pessoa1.getMaterias().add(materia);

      }


System.out.println("O ID é " + pessoa1.getId());
System.out.println("O Nome é " + pessoa1.getNome());
System.out.println("A idade é " + pessoa1.getIdade());
System.out.println("O CPF é " + pessoa1.getcPF());
System.out.println("A media dele é " + pessoa1.mediaNotas());
System.out.println("Sr(a). "+ pessoa1.getNome()+" está " + (pessoa1.getAprovado()? "apovado(a)" : "reprovado(a)"));

       System.out.println(pessoa1);


    }
}
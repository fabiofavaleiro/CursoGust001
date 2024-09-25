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
pessoa1.getMateria().setNota1( Double.parseDouble(JOptionPane.showInputDialog("Nota 1?")));
pessoa1.getMateria().setNota2( Double.parseDouble(JOptionPane.showInputDialog("Nota 2?")));
pessoa1.getMateria().setNota3( Double.parseDouble(JOptionPane.showInputDialog("Nota 3?")));
pessoa1.getMateria().setNota4( Double.parseDouble(JOptionPane.showInputDialog("Nota 4?")));

System.out.println("O ID é " + pessoa1.getId());
System.out.println("O Nome é " + pessoa1.getNome());
System.out.println("A idade é " + pessoa1.getIdade());
System.out.println("O CPF é " + pessoa1.getcPF());
System.out.println("A media dele é " + pessoa1.mediaNotas());
System.out.println("Sr(a). "+ pessoa1.getNome()+" está " + (pessoa1.getAprovado()? "apovado(a)" : "reprovado(a)"));

       System.out.println(pessoa1);


    }
}
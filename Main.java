import classes.Materia;
import classes.Pessoa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new  ArrayList<Pessoa>();

        int numeroPessoas = Integer.valueOf(JOptionPane.showInputDialog("São quantas pessoas matriculadas?"));

        for (int quantidadeAlunos = 1; quantidadeAlunos <= numeroPessoas; quantidadeAlunos++) {


            String nome = JOptionPane.showInputDialog("Qual é o nome do caboclo "+quantidadeAlunos+"?");
            String idade = JOptionPane.showInputDialog("Qual é a idade do " + nome + "?");
            String cPF = JOptionPane.showInputDialog("Qual é o CPF do " + nome + "?");

            Pessoa pessoa1 = new Pessoa();


            pessoa1.setId(quantidadeAlunos);
            pessoa1.setNome(nome);
            pessoa1.setcPF(cPF);
            pessoa1.setIdade(Integer.valueOf(idade));

            int quantidadeMaterias = Integer.valueOf(JOptionPane.showInputDialog("Ow shiiiiu!!! Quantas materias o " + nome + " tem?"));

            for (int pos = 1; pos <= quantidadeMaterias; pos++) {
                String materiaName = JOptionPane.showInputDialog("Qual o nome da materia " + pos + " ?");
                String materialNote = JOptionPane.showInputDialog("Qual é a nota da materia " + materiaName + " ?");

                Materia materia = new Materia();
                materia.setMateria(materiaName);
                materia.setNota(Double.valueOf(materialNote));

                pessoa1.getMaterias().add(materia);

            }


            int escolha = JOptionPane.showConfirmDialog(null, "Deseja removerl alguma diciplina?");

            while (escolha == 0) {

                String removerMateria = JOptionPane.showInputDialog("qual o numero referente a Materia que deseja excluir?");
                pessoa1.getMaterias().remove(Integer.valueOf(removerMateria).intValue() - 1);
                escolha = JOptionPane.showConfirmDialog(null, "deseja continuar removendo?");

            }
            pessoas.add(pessoa1);
        }

        for (Pessoa pessoa : pessoas) {

            System.out.println("O ID é " + pessoa.getId());
            System.out.println("O Nome é " + pessoa.getNome());
            System.out.println("A idade é " + pessoa.getIdade());
            System.out.println("O CPF é " + pessoa.getcPF());
            System.out.println("A media dele é " + pessoa.mediaNotas());
            System.out.println("Sr(a). "+ pessoa.getNome()+" está " + (pessoa.getAprovado()? "apovado(a)" : "reprovado(a)"));


            System.out.println(pessoa.getMaterias());
            System.out.println(pessoa);
            System.out.println("==========================================================================");

        }
        




    }
}
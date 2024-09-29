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



            pessoas.add(pessoa1);

            mostra1(pessoas);

        }








       

    }

    public static void mostra1(List<Pessoa> pessoas){



        for (int pos = 0; pos < pessoas.size(); pos++) {

            Pessoa pessoa = pessoas.get(pos);

            if(pessoa.getNome().equalsIgnoreCase("1")){
                Pessoa trocar = new Pessoa();
                trocar.setNome("Fulano");
                trocar.setcPF("000.000.000-00");
                trocar.setIdade(23);
                trocar.setId(7);


                Materia materia = new Materia();
                materia.setMateria("mat");
                materia.setNota(9);

                trocar.getMaterias().add(materia);
                pessoas.set(pos,trocar);
                pessoa = pessoas.get(pos);

            }

            System.out.println("Aluno:" + pessoa.getNome());
            System.out.println("Media do aluno:"+pessoa.mediaNotas());
            System.out.println("Resultado: "+ (pessoa.getAprovado()? "Aprovado":"Reprovado"));



            /*for(Materia materia: pessoa.getMaterias()){
                System.out.println("Materia: " +materia.getMaretia()+" nota: "+materia.getNota());
            }*/

            for (int posm = 0; posm <pessoa.getMaterias().size(); posm ++){ //Outra forma de fazer o codigo comentado logo acima.
                Materia mat = pessoa.getMaterias().get(posm);
                System.out.println("Materia: " +mat.getMaretia()+" nota: "+mat.getNota());

            }

            System.out.println("Materia: " + pessoa.getSomaNotas());
            System.out.println("============================================================");

        }

    }



    public static void removerPessoa(List<Pessoa> pessoas){


        for (Pessoa pessoa : pessoas) {

            String removePessoa = JOptionPane.showInputDialog("quem vc quer remover da lista?");

            if(pessoa.getNome().equalsIgnoreCase(removePessoa)){

                pessoas.remove(pessoa);

                System.out.println("O ID é " + pessoa.getId());
                System.out.println("O Nome é " + pessoa.getNome());
                System.out.println("A idade é " + pessoa.getIdade());
                System.out.println("O CPF é " + pessoa.getcPF());
                System.out.println("A media dele é " + pessoa.mediaNotas());
                System.out.println("Sr(a). "+ pessoa.getNome()+" está " + (pessoa.getAprovado()? "apovado(a)" : "reprovado(a)"));

                System.out.println(pessoa.getMaterias());
                System.out.println(pessoa);
                System.out.println("==========================================================================");
                break;

            }


        }

        for(Pessoa pessoa : pessoas){
            System.out.println("os aluno que sobraram foram:");
            System.out.println(pessoa.getNome());
            System.out.println("suas materias são:");

            for (Materia materia : pessoa.getMaterias());
            {

                System.out.println(pessoa.getMaterias());
            }

        }

    }

    public static void removerMateria(Pessoa pessoa1){


        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma diciplina?");

        while (escolha == 0) {

            String removerMateria = JOptionPane.showInputDialog("qual o numero referente a Materia que deseja excluir?");
            pessoa1.getMaterias().remove(Integer.valueOf(removerMateria).intValue() - 1);
            escolha = JOptionPane.showConfirmDialog(null, "deseja continuar removendo?");

        }
    }


}
import classes.Materia;
import classes.Pessoa;
import classes.StatusPessoa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Qual é seu login?");
        String senha = JOptionPane.showInputDialog("Qual é seu senha?");

        if(login.equals("Admin") && senha.equals("Admin")) {


            List<Pessoa> pessoas = new ArrayList<Pessoa>();

            HashMap<String, List<Pessoa>> maps = new HashMap<String, List<Pessoa>>();

            List<Pessoa> pessoasAprovadas = new ArrayList<Pessoa>();
            List<Pessoa> pessoasExame = new ArrayList<Pessoa>();
            List<Pessoa> pessoasReprovadas = new ArrayList<Pessoa>();


            int numeroPessoas = Integer.valueOf(JOptionPane.showInputDialog("São quantas pessoas matriculadas?"));

            for (int quantidadeAlunos = 1; quantidadeAlunos <= numeroPessoas; quantidadeAlunos++) {


                String nome = JOptionPane.showInputDialog("Qual é o nome do caboclo " + quantidadeAlunos + "?");
                //String idade = JOptionPane.showInputDialog("Qual é a idade do " + nome + "?");
                //String cPF = JOptionPane.showInputDialog("Qual é o CPF do " + nome + "?");

                Pessoa pessoa1 = new Pessoa();


                pessoa1.setId(quantidadeAlunos);
                pessoa1.setNome(nome);
                //pessoa1.setcPF(cPF);
                //pessoa1.setIdade(Integer.valueOf(idade));

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


            }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            maps.put(StatusPessoa.APROVADO, new ArrayList<Pessoa>());
            maps.put(StatusPessoa.EXAME, new ArrayList<Pessoa>());
            maps.put(StatusPessoa.REPROVADO, new ArrayList<Pessoa>());


            for (Pessoa pessoa : pessoas) {

                if (pessoa.getAprovado().equalsIgnoreCase(StatusPessoa.APROVADO)) { //maneira diferente de dizes que o atributo apeocado do objeto pessoa é igal a String StatusPessoa.APROVADO
                    maps.get(StatusPessoa.APROVADO).add(pessoa);
                } else if (pessoa.getAprovado().equals(StatusPessoa.EXAME)) {
                    maps.get(StatusPessoa.EXAME).add(pessoa);
                } else {
                    maps.get(StatusPessoa.REPROVADO).add(pessoa);
                }

            }

            for (Pessoa pessoa : maps.get(StatusPessoa.APROVADO)) {
                System.out.println(StatusPessoa.APROVADO);
                System.out.println(pessoa.getNome());
            }

            for (Pessoa pessoa : maps.get(StatusPessoa.EXAME)) {
                System.out.println(StatusPessoa.EXAME);
                System.out.println(pessoa.getNome());
            }

            for (Pessoa pessoa : maps.get(StatusPessoa.REPROVADO)) {
                System.out.println(StatusPessoa.REPROVADO);
                System.out.println(pessoa.getNome());
            }


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
            System.out.println("Resultado: "+ pessoa.getAprovado());



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
                System.out.println("Sr(a). "+ pessoa.getNome()+" está " + pessoa.getAprovado());

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
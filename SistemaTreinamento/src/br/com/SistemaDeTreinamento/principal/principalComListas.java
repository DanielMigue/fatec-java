package br.com.SistemaDeTreinamento.principal;
import br.com.SistemaDeTreinamento.objetos.Aluno;
import br.com.SistemaDeTreinamento.objetos.Instrutor;
import java.util.ArrayList;
import java.util.Scanner;

public class principalComListas {
    public static void main(String[] args) throws Exception {


        System.out.println("""
                                
                ********************************************************
                BEM-VINDO ao STT(Sistema de Treinamento em Tecnologia)
                ********************************************************
                                
                Segue abaixo os instrutores do treinamento:
                """);


        Instrutor Daniel = new Instrutor("Daniel Miguel", 01, 60, "Java");
        Instrutor Lucas = new Instrutor("Lucas Andrade", 02, 80, "C#");
        Instrutor Leticia = new Instrutor("Leticia", 03, 50, "C++");
        Instrutor Ana = new Instrutor("Ana", 04, 80, "JavaScript");

        ArrayList<Instrutor> listaDeInstrutores = new ArrayList<>();
        listaDeInstrutores.add(Daniel);
        listaDeInstrutores.add(Lucas);
        listaDeInstrutores.add(Leticia);
        listaDeInstrutores.add(Ana);
        for (Instrutor item : listaDeInstrutores) {
            System.out.println(item.toString());
        }

        Scanner ler = new Scanner(System.in);
        System.out.println("""
                                
                Digite o número do instrutor de sua preferência e verifique sua disponibilidade: """);
        int id = ler.nextInt();

        for (Instrutor item : listaDeInstrutores) {
            if (item.getId() == id) {
                item.verificarDisponibilidade(id);
                item.definirCargaHoraria(id);
                break;
            }
        }
        System.out.println("""
                                
                ********************************************************************************
                Para saber a média da nota final dos alunos programadores, preecha os requisitos
                ********************************************************************************
                                
                """);
        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numAlunos = 3; // Número de alunos que você deseja adicionar

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o ID do aluno: ");
            int idAluno = scanner.nextInt();
            System.out.println("Digite a carga horária total do curso escolhido pelo aluno: ");
            int cargaHoraria = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a nota final do aluno: ");
            double nota = scanner.nextDouble();

            Aluno aluno = new Aluno(idAluno, cargaHoraria, nome, nota);
            listaDeAlunos.add(aluno);
        }

        scanner.close();

        for (Aluno item : listaDeAlunos) {
            System.out.println(item.toString());
        }
        double mediaNotas = Aluno.calcularMediaNotas(listaDeAlunos);
        System.out.println("A média das notas finais do aluno é: " + mediaNotas);
    }
}

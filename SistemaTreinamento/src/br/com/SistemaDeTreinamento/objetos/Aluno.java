package br.com.SistemaDeTreinamento.objetos;
import java.util.ArrayList;
public class Aluno extends Treinamento {
        private String nome;
        private double notaFinal;

        public Aluno(int id, int cargaHoraria, String nome, double notaFinal) {
            super(id, cargaHoraria);
            this.nome = nome;
            this.notaFinal = notaFinal;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getNotaFinal() {
            return notaFinal;
        }

        public void setNotaFinal(double notaFinal) {
            this.notaFinal = notaFinal;
        }

        public String toString(){
            return "Aluno("+getNome()+")" + " Curso: " + this.getId() + " - " + this.getNome() +" COMPLETOU o curso com carga total de " +
                    this.getCargaHoriaria() + " horas" +  " - Nota final: " + this.getNotaFinal();
        }



        public static double calcularMediaNotas(ArrayList<Aluno> listaDeAlunos) {
            double soma = 0;
            for (Aluno aluno : listaDeAlunos) {
                soma += aluno.getNotaFinal();
            }
            return soma / listaDeAlunos.size();
        }
    }



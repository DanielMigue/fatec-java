package br.com.SistemaDeTreinamento.objetos;
import java.util.Scanner;
public class Instrutor extends Treinamento {
    Scanner ler = new Scanner(System.in);
    private String nome;
    private String linguagemEnsinada;

    public Instrutor(String nome, int id, int cargaHoraria, String linguagemEnsinada) {
        super(id, cargaHoraria);
        this.linguagemEnsinada = linguagemEnsinada;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagemEnsinada() {
        return linguagemEnsinada;
    }


    public void setLinguagemEnsinada(String linguagemEnsinada) {
        this.linguagemEnsinada = linguagemEnsinada;
    }

    public String toString() {
        return "Instrutor(a): " + this.getId() +" - " + this.getNome()  + "(" +
                this.getLinguagemEnsinada() +"," + this.getCargaHoriaria() + " " + "horas"+ ")";
    }

    public void verificarDisponibilidade(int id) throws Exception {
        try {
            switch (id) {
                case 1:
                    System.out.println("""
                      O professor Daniel atende no perído matutino de segunda-feira a sexta-feira
                      """);
                    break;
                case 2:
                    System.out.println("""
                      O professor Lucas atende no período vespertino de segunda-feira a sexta-feira
                      """);
                    break;
                case 3:
                    System.out.println("""
                      A professora Letícia atende no período noturno de segunda-feira a sexta-feira
                      """);
                    break;
                case 4:
                    System.out.println("""
                      A professora Ana atende no período noturno de segunda-feira a sexta-feira
                      """);
                    break;
                default:
                    System.out.println("Número não reconhecido");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
        if (id < 0 || id > 4) {
            throw new Exception("Esse número está fora das opções");
        }
    }

}


package br.com.SistemaDeTreinamento.objetos;
import java.util.Scanner;
public abstract class Treinamento {
    private int id;

    private int cargaHoraria;

    public Treinamento(int id, int cargaHoraria) {
        this.id = id;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoriaria() {
        return cargaHoraria;
    }

    public void setCargaHoriaria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getId() {
        return id;
    }

    public String definirCargaHoraria(int id) throws Exception {
        Scanner ler = new Scanner(System.in);
        String definir = "";

       switch (id){
           case 1:
               System.out.println("""
                       Defina a carga horária do instrutor Daniel do período matutino: 
                       Exemplo(8h às 12h)""");
               definir = ler.nextLine();
               System.out.println("A carga horária do Daniel será: " + definir);
               break;
           case 2:
               System.out.println("""
                       Defina a carga horária do instrutor Lucas do período vespertino
                       Exemplo(8h às 12h)""");
               definir = ler.nextLine();
               System.out.println("A carga horária do Lucas será: " + definir);
               break;
           case 3:
               System.out.println("""
                       Defina a carga horária da instrutora Leticia no período noturno
                       Exemplo(8h às 12h)""");
               definir = ler.nextLine();
               System.out.println("A carga horária da Leticia será: " + definir);
               break;
           case 4:
               System.out.println("""
                       Defina a carga horária da instrutora Ana no período noturno
                       Exemplo(8h às 12h)""");
               definir = ler.nextLine();
               System.out.println("A carga horária da Ana será: " + definir);
               break;
           default:
               System.out.println("Número não reconhecido");
               break;
       }
        if(id < 0 || id>4){
            throw new Exception("Esse número está fora das opções");
            }
        return definir;
        }
    public void verificarUltimoTreinamento(int cargaHoriaria){
        this.cargaHoraria = cargaHoriaria;

    }
}



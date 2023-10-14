package br.com.objetos;

public class Medico {
    private String nome;
    private String sexo;
    private int CRM;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }
    public void Atender(){
        System.out.println("Atendendo");
    }
    public void consultar(){
        System.out.println("Consultando");
    }
    public void medicar(){
        System.out.println("Medicando");
    }
}

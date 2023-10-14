package br.com.objetos;

public class MulherMaravilha {
    private String nome;
    private String inteligencia;
    private String habilidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    public void lutar(){
        System.out.println("Lutando");
    }
    public void defender(){
        System.out.println("Defendendo");
    }
}

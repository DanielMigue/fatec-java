package br.com.objetos;

public class Trator {
    private String cor;
    private double peso;
    private double tamanho;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public void andar(){
        System.out.println("Andando");
    }
    public void cavar(){
        System.out.println("Cavando");
    }
}

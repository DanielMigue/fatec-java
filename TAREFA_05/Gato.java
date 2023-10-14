package br.com.objetos;

import javax.swing.plaf.IconUIResource;

public class Gato {
    private String cor;
    private double peso;
    private String nome;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void miar (){
        System.out.println("MIAAAAAU");

    }
    public void comer(){
        System.out.println("O gato está comendo");
    }
}

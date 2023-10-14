package br.com.objetos;

public class Teclado {
    private String letras;
    private String cor;
    private int tamanho;

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public void enviar(){
        System.out.println("Enviando dados");
    }
    public void teclar(){
        System.out.println("Teclando");
    }
}

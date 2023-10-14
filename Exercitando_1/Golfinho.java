package br.com.objetos;

public class Golfinho {
    private double peso;
    private String habitat;
    private String mamifero;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getMamifero() {
        return mamifero;
    }

    public void setMamifero(String mamifero) {
        this.mamifero = mamifero;
    }

    public void nadar(){
        System.out.println("Nadando");
    }
    public void agrupar(){
        System.out.println("Agrupando");
    }
}

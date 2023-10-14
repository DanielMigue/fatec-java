package br.com.objetos;

public class ReacaoQuimica {
    private String cor;
    private String ingrediente;
    private String produto;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    public void explodir(){
        System.out.println("POOOOOOOWWWWW (Explodindo)");
    }
    public void estabilizar(){
        System.out.println("Estabilizando");
    }
}

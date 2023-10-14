package br.com.objetos;

public class bolsadevalores {
    private int codigoAcao;
    private String grafico;
    private String local;

    public int getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(int codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public String getGrafico() {
        return grafico;
    }

    public void setGrafico(String grafico) {
        this.grafico = grafico;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public void subir(){
        System.out.println("A bolsa de valores está subindo");
    }
    public void descer(){
        System.out.println("A bolsa de valores está descendo");
    }

}

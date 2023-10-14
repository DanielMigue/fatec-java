package br.com.objetos;

public class Importacao {
    private String pais;
    private int codigoImportacao;
    private String local;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCodigoImportacao() {
        return codigoImportacao;
    }

    public void setCodigoImportacao(int codigoImportacao) {
        this.codigoImportacao = codigoImportacao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public void distribuir(){
        System.out.println("Distribuindo");
    }
    public void tributar(){
        System.out.println("Tributando");
    }
}

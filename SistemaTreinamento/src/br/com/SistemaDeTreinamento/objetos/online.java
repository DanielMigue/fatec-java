package br.com.SistemaDeTreinamento.objetos;

public class online extends Treinamento {
    private int cargaHoraria;

    public online(int id, int cargaHoraria, int cargaHoraria1) {
        super(id, cargaHoraria);
        this.cargaHoraria = cargaHoraria1;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String definirCargaHoraria(int id) throws Exception {
        return super.definirCargaHoraria(id);
    }


    public void treinar(){
        System.out.println("treinando online");
    }
}

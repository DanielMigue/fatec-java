package br.com.objetos.Principal;

import br.com.objetos.*;

public class Principal {
    public static void main(String[] args) {

        bolsadevalores bolsa1 = new bolsadevalores();
        System.out.println("BEM-VINDO a bolsa de valores de Eduardo");
        bolsa1.setLocal("R. Quinze de Novembro, 275 - Centro Histórico de São Paulo, São Paulo - SP, 01010-901, Brasil");
        System.out.println("O local da bolsa de valores é: " + bolsa1.getLocal());
        bolsa1.subir();

        System.out.println("");

        bolsadevalores bolsa2 = new bolsadevalores();
        System.out.println("BEM-VINDO a bolsa de valores de Cristiane");
        bolsa2.setLocal("R. Quinze de Novembro, 275 - Centro Histórico de São Paulo, São Paulo - SP, 01010-901, Brasil");
        System.out.println("O local da bolsa de valores é: " + bolsa1.getLocal());
        bolsa2.descer();

        System.out.println("");

        Gato gato1 = new Gato();
        gato1.setNome("Mel");
        System.out.println("O nome do gato é: " + gato1.getNome());
        gato1.miar();

        System.out.println("");


        Gato gato2 = new Gato();
        gato2.setNome("Bob");
        System.out.println("O nome do gato é: " + gato2.getNome());
        gato2.comer();

        System.out.println("");

        Medico medico1 = new Medico();
        medico1.setNome("Dr.Daniel Mulero");
        System.out.println("O nome do médico(a) é: " + medico1.getNome());
        medico1.medicar();

        System.out.println("");

        Medico medico2 = new Medico();
        medico2.setNome("Dr.Carol Rodrigues");
        System.out.println("O nome do médico(a) é: " + medico2.getNome());
        medico2.consultar();

        System.out.println("");

        Caminhao caminhao1 = new Caminhao();
        caminhao1.setCor("Laranja");
        System.out.println("O caminhão tem a cor: " + caminhao1.getCor());
        caminhao1.andar();

        System.out.println("");

        Caminhao caminhao2 = new Caminhao();
        caminhao2.setPeso(1.5);
        System.out.println("O caminhão tem: " + caminhao2.getPeso() + " tonelada");
        caminhao2.despejar();

        System.out.println("");

        Golfinho golfinho1 = new Golfinho();
        golfinho1.setHabitat("Mar");
        System.out.println("Habitat do Golfinho: " + golfinho1.getHabitat());
        golfinho1.nadar();

        System.out.println("");

        Golfinho golfinho2 = new Golfinho();
        golfinho2.setHabitat("Mar");
        System.out.println("Habitat do Golfinho: " + golfinho2.getHabitat());
        golfinho2.agrupar();

        System.out.println("");

        MulherMaravilha heroina1 = new MulherMaravilha();
        heroina1.setNome("Lynda Carter");
        System.out.println("Nome da Mulher Maravilha: " + heroina1.getNome());
        heroina1.lutar();

        System.out.println("");

        MulherMaravilha heroina2 = new MulherMaravilha();
        heroina2.setNome("Lynda Carter");
        System.out.println("Nome da Mulher Maravilha: " + heroina2.getNome());
        heroina2.defender();

        System.out.println("");

        Teclado teclado1 = new Teclado();
        teclado1.setCor("Preto");
        System.out.println("Cor do teclado: " + teclado1.getCor());
        teclado1.teclar();

        System.out.println("");

        Teclado teclado2 = new Teclado();
        teclado2.setCor("Branco");
        System.out.println("Cor do teclado: " + teclado2.getCor());
        teclado2.enviar();

        System.out.println("");

        ReacaoQuimica reacao1 = new ReacaoQuimica();
        reacao1.setIngrediente("Mercúrio");
        System.out.println("Ingrediente químico: " + reacao1.getIngrediente());
        reacao1.explodir();

        System.out.println("");

        ReacaoQuimica reacao2 = new ReacaoQuimica();
        reacao2.setIngrediente("Hidróxido de Cálcio");
        System.out.println("Ingrediente químico: " + reacao2.getIngrediente());
        reacao2.estabilizar();

        System.out.println("");

        Importacao importacao1 = new Importacao();
        importacao1.setCodigoImportacao(99227922);
        System.out.println("Codigo da Importação: " + importacao1.getCodigoImportacao());
        importacao1.tributar();

        System.out.println("");

        Importacao importacao2 = new Importacao();
        importacao2.setCodigoImportacao(99777777);
        System.out.println("Codigo da Importação: " + importacao2.getCodigoImportacao());
        importacao2.distribuir();

        System.out.println("");

        Trator trator1 = new Trator();
        trator1.setCor("Amarelo");
        System.out.println("Cor do trator: " + trator1.getCor());
        trator1.andar();

        System.out.println("");

        Trator trator2 = new Trator();
        trator2.setCor("Laranja");
        System.out.println("Cor do trator: " + trator2.getCor());
        trator2.cavar();
    }
}

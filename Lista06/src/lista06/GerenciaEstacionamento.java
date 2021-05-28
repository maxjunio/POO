package lista06;

public class GerenciaEstacionamento {

    public static void main(String[] args) {
        int vagaOcupada;
        Estacionamento objEstacionamento = new Estacionamento("Estacionamento PUC Minas", 10);
        
        Veiculo carro1 = new Veiculo("HKT0098", "gol", "preto"),
                carro2 = new Veiculo("OLP4290", "city", "branco"),
                carro3 = new Veiculo("HJB0495", "fiesta", "azul"),
                carro4 = new Veiculo("OWB3904", "hb20", "prata"),
                carro5 = new Veiculo("HTP5619", "toro", "branco"),
                carro6 = new Veiculo("BOL4861", "c4", "prata");
        
        vagaOcupada = objEstacionamento.estacionar(carro1);
        vagaOcupada = objEstacionamento.estacionar(carro2);
        vagaOcupada = objEstacionamento.estacionar(carro3);
        vagaOcupada = objEstacionamento.estacionar(carro4);
        
        System.out.println("Ocupação do estacionamento após as chegadas de quatro clientes: \n" + objEstacionamento.ocupacaoEstacionamento());
// HKT0098 OLP4290 HJB0495 OWB3904 vazia vazia vazia vazia vazia vazia
        vagaOcupada = objEstacionamento.obterVagaOcupada(carro1);
        objEstacionamento.retirarVeiculo(vagaOcupada);
        System.out.println("Ocupação do estacionamento após a retirada do veículo de placa HKT0098:\n" + objEstacionamento.ocupacaoEstacionamento());
// vazia OLP4290 HJB0495 OWB3904 vazia vazia vazia vazia vazia vazia
        vagaOcupada = objEstacionamento.estacionar(carro5);
        vagaOcupada = objEstacionamento.estacionar(carro6);
        System.out.println("Ocupação do estacionamento após as chegadas de mais dois clientes:\n" + objEstacionamento.ocupacaoEstacionamento());
// HTP5619 OLP4290 HJB0495 OWB3904 BOL4861 vazia vazia vazia vazia vazia
        System.out.println("Este estacionamento apresenta " + objEstacionamento.getNumVagasLivres() + " vagas livres."); // 5 vagas livres
    }

}

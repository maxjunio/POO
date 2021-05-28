package lista06;

public class Estacionamento {
 //variaveis e constante da classe
    public static final int NUMMAXVAGAS = 50;
    public String nome;
    private Veiculo[] vagas = new Veiculo[NUMMAXVAGAS];
    private int numTotalVagas;
    private int numVagasLivres;

    //construtor
    public Estacionamento(String nomeEstabelecimento, int totalVagas) {
        if (totalVagas <= NUMMAXVAGAS) {
            this.nome = nomeEstabelecimento;
            this.numTotalVagas = totalVagas;
            this.numVagasLivres = totalVagas;
         
        }
        //testar o try catch ou msgm de erro
    };

    public int estacionar(Veiculo carro) {
        if(this.numVagasLivres >=1){
            for (int i=0 ; i< this.vagas.length ; i++ ){
                if(this.vagas[i] == null ){
                    this.vagas[i] = carro;
                    this.numVagasLivres -= 1;
                 break;
                }
            }
        }
        return this.numVagasLivres-1;
    };
//verificar metodo
    public int obterVagaOcupada(Veiculo carro) {
        int achou=0;
        for(int i=0 ; i<this.vagas.length; i++){
            if(carro.getPlaca().equals(this.vagas[i].getPlaca())){
              achou = i;
              break;
            }else achou = -1;
        }       
        return achou;
    };

    public void retirarVeiculo(int numVaga) {
      this.vagas[numVaga] = null;
      this.numVagasLivres += 1;
    };

    public int getNumVagasLivres() {
        return this.numVagasLivres; 
    };

    public String ocupacaoEstacionamento() {
        String ocup= "";
        for(int i=0 ; i<this.numTotalVagas; i++){
            if ( this.vagas[i]!=null){
               ocup += (i+1)+ " "+ vagas[i].getPlaca() + "\n";
                
            }else{
                ocup += (i+1)+ " Vazia " + "\n";
            }
        }
        return ocup;
    };

}

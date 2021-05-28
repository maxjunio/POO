
public class Carro {

    private int tipo;
    private String modelo;
    private int tanque;
    private int tanqueTotal;
    private int dist;
    private int consumo;
//construtor
    public Carro(int tipo, int tanqueTotal) {
        this.tipo = tipo;
        this.tanqueTotal = tanqueTotal;
        this.tanque = 0;
        this.dist = 0;

    }
//getters e setters 
    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getTanqueTotal() {
        return tanqueTotal;
    }

    public void setTanqueTotal(int tanqueTotal) {
        this.tanqueTotal = tanqueTotal;
    }
//seleciona o modelo do carro
    public void selTipo() {
        switch (this.tipo) {
            case 1:
                this.setConsumo(7);
                this.setModelo("Etanol");
                break;
            case 2:
                this.setConsumo(10);
                this.setModelo("Gasolina");
                break;
            default:
                System.out.println("Modelo não correspondente!");
                break;
        }
    }
//seleciona o tamanho do tanque
    public void selTanque() {
        switch (this.getTanque()) {
            case 1:
                this.setTanque(40);
                break;
            case 2:
                this.setTanque(50);
                break;
            default:
                System.out.println("Modelo não correspondente!");
                break;
        }
    }
//abastece o carro
    public void abastece(int fuel) {
        if (this.getTanqueTotal() > this.getTanque()) {
            this.setTanque(fuel + this.getTanque());
            System.out.println("Abastecimento Concluído");
        } else {
            System.out.println("Abastecimento não pode ser concluído!");
        }
    }

    public void move(int dist) {
        this.setDist(this.getTanque() * this.getConsumo());

    }
    //metodo de atualização do tanque dividinho a km pelo consumo do veículo para informar o que resta no tanque
    public void atTanque() {
        for (int i = this.getDist()/ this.getConsumo(); i >0 ; i--) {
            if (this.getDist() > this.getTanque()) {
                this.setTanque(this.getTanque() - 1);
            }
            
        }

    }
//status para informar a situação
    public void status() {
        System.out.println("Carro modelo a " + this.getModelo() + ", percorreu " + this.getDist() + "kms.");
        System.out.println("Resta " + this.getTanque() + " litros de combustível.");
    }

}

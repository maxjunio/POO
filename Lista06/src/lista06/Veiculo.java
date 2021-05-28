package lista06;

public class Veiculo {
    private String placa;
    private String Modelo;
    private String cor;

    public Veiculo(String placa, String Modelo, String cor) {
        this.placa = placa;
        this.Modelo = Modelo;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}

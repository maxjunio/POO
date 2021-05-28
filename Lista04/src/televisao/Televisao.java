package televisao;

public class Televisao {

    private int vol;
    private int chanel;
    private int volMax;
    private int chMax;

    //getters e setters
    public int getChMax() {
        return chMax;
    }

    public void setChMax(int chMax) {
        this.chMax = chMax;
    }

    public int getVolMax() {
        return volMax;
    }

    public void setVolMax(int volMax) {
        this.volMax = volMax;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }
//construtor 
    public Televisao(int volMax, int chMax) {
        this.vol = 1;
        this.chanel = 1;
        this.volMax = volMax;
        this.chMax = chMax;

    }
//metodo de aumento de volume
    public void aumentaVol() {
        if (this.getVol() >= 0 && this.getVol() < this.getVolMax()) {
            this.setVol(this.getVol() + 1);
        }
    }
//metodo de abaixar o volume
    public void abaixaVol() {
        if (this.getVol() <= this.getVolMax() && this.getVol() > 0) {
            this.setVol(this.getVol() - 1);
        }
    }
//metodo de aumentar um canal
    public void aumentaCh() {
        if (this.getChanel() > 0 && this.getChanel() < this.getChMax()) {
            this.setChanel(this.getChanel() + 1);
        } else {
            this.setChanel(1);
        }

    }
//metodo de abaixar um canal
    public void abaixaCh() {
        if (this.getChanel() > 1 && this.getChanel() <= this.getChMax()) {
            this.setChanel(this.getChanel() - 1);
        } else {
            this.setChanel(150);
        }

    }
//metodo de seleção do canal
    public void selCh(int chanel) {
        if (this.getChanel() > 0 && this.getChanel() <= this.getChMax()) {
            this.setChanel(chanel);
            System.out.println("Alteção realizada!");
        } else {
            System.out.println("Canal fora da programação!");
        }

    }
//metodo de status 
    public void status() {
        System.out.println("Canal: " + getChanel() + "\nVolume: " + getVol());
    }

}

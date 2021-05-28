package lista05;

public class ConversaoDeUnidadesDeVolume {
//converte litro em centimetro cubico
    public static double LtrToCmCub(double ltr) {
        return (ltr * 1000);
    }
//converte de metro cubico para litro 
    public static double MtrCubToLtr(double mtr) {
        return (mtr * 1000);
    }
//converte metro cubico para pes cubico
    public static double MtrCubToPesCub(double mtr) {
        return (mtr * 35.32);
    }
//converte galão americano para polegada cubica
    public static double GalAmToPolCub(double gal) {
        return (gal * 231);
    }
//converte galão americando para litro
    public static double GalAmToLtr(double gal) {
        return (gal * 3.785);
    }
//converte metro cubico para centímetro cubico
    public static double MtrCubToCmCub(double mtr) {
        return ((mtr * 1000) * 1000);
    }
}

package lista05;

public class TestaVolume {

    public static void main(String[] args) {
        double piscina = 1.890;

        System.out.println("A piscina tem " + ConversaoDeUnidadesDeVolume.MtrCubToLtr(piscina) + " em litros.");
        System.out.println("A piscina tem " + ConversaoDeUnidadesDeVolume.MtrCubToPesCub(piscina) + " em pés cúbicos.");
        System.out.println("A piscina tem " + ConversaoDeUnidadesDeVolume.MtrCubToCmCub(piscina) + " em centímetros cúbicos.");
    }
}

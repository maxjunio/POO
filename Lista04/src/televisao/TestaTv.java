package televisao;

import java.util.Scanner;

public class TestaTv {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opt;
        Televisao tv = new Televisao(100, 150);

        do {
            System.out.println("Menu");
            System.out.println("1:Proximo Canal \n2:Canal Anterior \n3:Aumenta o volume \n4:Abaixa o volume \n5:Digite o Canal desejado \n0:Sair");
            tv.status();
            switch (opt = entrada.nextInt()) {
                case 1:
                    tv.aumentaCh();
                    break;
                case 2:
                    tv.abaixaCh();
                    break;
                case 3:
                    tv.aumentaVol();
                    break;
                case 4:
                    tv.abaixaVol();
                    break;
                case 5:
                    System.out.println("Digite o canal desejado: ");
                    tv.selCh(entrada.nextInt());
                    break;

            }
        } 
        while (opt != 0);
        System.out.println("Obrigado por utilizar o programa!");

        entrada.close();
    }

}

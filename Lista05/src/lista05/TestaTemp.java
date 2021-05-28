package lista05;

import java.util.Scanner;

public class TestaTemp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opt;
        double temp;

        do {
            System.out.println("Digite a temperatura para conversão:");
            temp = entrada.nextDouble();
            System.out.println("MENU");
            System.out.println("1:De graus Celsius (C) para graus Fahrenheit (F) \n2:De graus Fahrenheit (F) para graus Celsius (C) \n3:De graus Celsius (C) para graus Kelvin (K) \n4:De graus Kelvin (K) para graus Celsius (C)");
            System.out.println("4:De graus Fahrenheit (F) para graus Kelvin (K) \n5:De graus Kelvin (K) para graus Fahrenheit (F) \n0:Sair");
            switch (opt = entrada.nextInt()) {
                case 1:
                    System.out.println(ConversorTemperatura.CelsiusToFahrenheit(temp) + " graus Fahrenheit.");
                    break;
                case 2:
                    System.out.println(ConversorTemperatura.FahrenheitToCelsius(temp) + " graus Celsius.");
                    break;
                case 3:
                    System.out.println(ConversorTemperatura.CelsiusToKelvin(temp) + " graus Kelvin.");
                    break;
                case 4:
                    System.out.println(ConversorTemperatura.KelvinToCelsius(temp) + " graus Celsius.");
                    break;
                case 5:
                    ConversorTemperatura.FahrenheitToCelsius(temp);
                    System.out.println(ConversorTemperatura.CelsiusToKelvin(temp) + " graus Kelvin.");
                    break;
                case 6:
                    ConversorTemperatura.KelvinToCelsius(temp);
                    System.out.println(ConversorTemperatura.CelsiusToFahrenheit(temp) + " graus Fahrenheit.");
                    break;
            }
        } while (opt != 0);
        System.out.println("Obrigado por utilizar o programa!");

        entrada.close();

    }
}

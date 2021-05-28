
package lista05;

public class ConversorTemperatura {

    public static double CelsiusToFahrenheit(double tempC) {
        return(tempC*(9.0/5) + 32); 
    }
    
    public static double FahrenheitToCelsius( double tempF){
        return ((tempF - 32)*5/9.0);
    }
    public static double CelsiusToKelvin(double tempC) {
        return(tempC + 273.15); 
    }
     public static double KelvinToCelsius( double tempK){
        return (tempK - 273.15);
    }
}
